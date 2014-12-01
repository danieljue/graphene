// Entity Graph

// requires: EntityGraphToolBar.js

Ext
		.define(
				"DARPA.PBGraph",
				{

					// Holds the graph itself and the details/settings tabpanel
					// in an hbox
					// Height was set in its container as flex:1 so as to
					// maximize height

					extend : "Ext.panel.Panel",
					border : '1',
					title : 'Graph',
					layout : {
						align : 'stretch',
						type : 'hbox'
					},
					resizable : true, // MFM
					collapsible : false, // MFM don't allow
					hidden : false,
					titleAlign : 'center',
					width : 'auto',
					entityId : null,
					// height:'auto',
					graphStore : {}, // PWG
					graph1HopStore : {}, // MFM2
					json : null,
					graphId : 'EntityGraph',
					currentNode : null,
					prevNode : null,
					GraphVis : null, // reference to "DARPA.GraphVis" defined
					// in cytoGraphSubs.js
					json1Hop : null, //
					json1HopNode : null, // currently selected node to expand
					// if any
					nodesExpanded : 0, // 
					fromAdvancedSearch : false,
					prevLoadParams : {
						searchValue : null,
						value : null,
						prevValue : null
					}, // MFM store the calling params for later Pivot
					tbar : null,
					// items: [],

					listeners : { // MFM
						resize : function(tab, width, height, oldWidth,
								oldHeight) {
							// DEBUG
							// console.log("resized to w = " + width + ", h = "
							// + height);

							if (tab.GraphVis) {
								tab.GraphVis.resize(width, height);
							}
						}
					}, // listeners

					constructor : function(config) {
						var self = this;

						this.institution = config.institution;
						
						var toolbar;
						try {
							toolbar = Ext.create("DARPA.GraphToolbar", {
								id: config.id + "-GraphToolbar",
								institution : config.institution
							});
							
							if (typeof toolbar == "undefined") throw "New toolbar .js not included in .html";
						} catch (e) {
							// use old toolbar instead
							toolbar = Ext.create("DARPA.PBCSToolbar", {
								id: config.id + "-GraphToolbar",
								institution : config.institution
							});
						}
						config.tbar = toolbar;
						
						config.bbar = Ext.create('Ext.ProgressBar', {
							text : 'Ready',
							id : config.id + '-ProgressBar',
							height : 20,
							width : 200
						});

						this.entityId = config.entityId;

						// OLD this.InfoVis = Ext.create("DARPA.InfoVis", {});

						this.GraphVis = new CytoGraphVis(config.id + "-PBcygraph");

						this.graphStore = makeEntityGraphStore();

						// MFM2
						this.graph1HopStore = Ext.create('Ext.data.Store', { // only
							// created
							// once
							// per
							// instance
							proxy : {
								type : 'ajax',
								model : 'EntityGraph',
								timeout : 120000,
								url : '',
								reader : {
									type: 'json'
									//type : 'xml',
									//record : 'graph',
									//root : 'graphml'
								}
							}
						});

						this.nodesExpanded = 0;

						// MFM
						var graphSettings = Ext.create("DARPA.GraphSettings", {
							id : config.id + '-settings'

						});
						
						graphSettings.setGraph(self); // MFM

						// MFM The Entity (customer) graph does not have a
						// concept of time - so disable dates and animation
						var filterSettings = Ext.create("DARPA.FilterSettings",
								{
									id : config.id + '-PBGraphFilter'
								});

						// MFM JIRA-29 Additional filter settings.
						/**
						 * { dispFieldName: string | "getfromkey" // name to
						 * display in the grid // getfromkey: get the display
						 * text from the attrs[j].key value dispFieldType:
						 * "text" | "dropdown" | "other" dispFieldWidth: width
						 * of the input field (not yet used) dispFieldChoices:
						 * string | "getfromnode", // comma separated choices,
						 * or get the choices from the node's field
						 * dataSourceType: "nodes" | "edges" | "other TBD"
						 * dataSourceField: "color" | "idType" | "name" |
						 * "amount" | "weight" | "attrs" // Special case: when
						 * "attrs" - this iterates over all of the attrs and
						 * builds the // fields in the grid from each attribute
						 * (key, value) pair }
						 */

						// Specify the additional attributes that can be used
						// for filtering
						var addfilter1 = { // NODE
							dispFieldName : "Node Color",
							dispFieldType : "dropdown",
							dispFieldWidth : 100,
							dispFieldChoices : "getfromnode",
							dataSourceType : "nodes",
							dataSourceField : "color"
						};

						var addfilter2 = { // NODE
							dispFieldName : "Node Name",
							dispFieldType : "dropdown",
							dispFieldWidth : 100,
							dispFieldChoices : "getfromnode",
							dataSourceType : "nodes",
							dataSourceField : "name"
						};

						var addfilter3 = { // NODE
							dispFieldName : "Identifier Type",
							dispFieldType : "dropdown",
							dispFieldWidth : 100,
							dispFieldChoices : "getfromnode",
							dataSourceType : "nodes",
							dataSourceField : "idType"
						};

						var addfilter4 = { // NODE
							dispFieldName : "getfromkey",
							dispFieldType : "text",
							dispFieldWidth : 100,
							dispFieldChoices : "",
							dataSourceType : "nodes",
							dataSourceField : "attrs" // array of attributes
						};
						var addfilter5 = { // EDGE
							dispFieldName : "Amount", // TODO: maybe edge
							// weight as another
							// attribute
							dispFieldType : "text",
							dispFieldWidth : 100,
							dispFieldChoices : "",
							dataSourceType : "edges",
							dataSourceField : "amount"
						};
						var addfilter6 = { // EDGE
							dispFieldName : "getfromkey",
							dispFieldType : "text",
							dispFieldWidth : 100,
							dispFieldChoices : "",
							dataSourceType : "edges",
							dataSourceField : "attrs" // array of attributes
						};
						var addFilterFields = [ addfilter1, addfilter2,
								addfilter3, addfilter4, addfilter5, addfilter6 ];
						var ret = filterSettings.setAdditionalFields(addFilterFields);
						// DEBUG
						// console.log("filterSettings.setAdditionalFields
						// returned = " + ret);

						// END MFM JIRA-29 Additional filter settings
						// 
						// Have to delay this call a bit since the Graph Frame
						// (see PB_Frame) is not defined yet
						//var wtimeout2 = window.setTimeout(
						//	function() {
						//		window.clearTimeout(wtimeout2);
								filterSettings.setGraph(self);
								filterSettings.enableTimeFilter(false); // is
								// enabled by default, disable it here
								filterSettings.setSearchFieldLabel("Identifier(s)");
						//	}, 7500);

						var graphContainer = Ext.create("Ext.Container", { // MFM
							width : 'auto',
							height : 'auto',
							id : config.id + '-PBcygraph', // This is the dom
							// element that
							// contains the
							// graph.
							flex : 1
						});

						var settings = Ext.create("Ext.tab.Panel", {
							width : 320,
							height : 'auto',
							collapsible : true, // MFM
							collapseDirection : 'right',
							items : [ Ext.create("Ext.panel.Panel", {
								title : 'DETAILS/ACTIONS',
								layout : 'fit',
								items : [ Ext.create("DARPA.PBNodeDisplay", {
									id : config.id + '-NodeDisplay',
									height : 'auto'
								}) ]
							}),

							Ext.create("Ext.panel.Panel", {
								title : 'SETTINGS/FILTER',
								items : [ graphSettings, // MFM
								// MFM Added Filtering Panel
								Ext.create("Ext.panel.Panel", {
									title : 'FILTER',
									collapsible : false,
									items : filterSettings
								}) ]
							})

							// ,
							// legend
							]
						});
						this.items = [ graphContainer, settings ];

						this.callParent(arguments);

					},

					getProgressBar : function() {
						var self = this;
						return Ext.getCmp(self.id + '-ProgressBar');
					},

					// MFM
					appendTabTitle : function(appendText) {
						var p = this;
						if (appendText && appendText.length > 0) {
							// DEBUG
							// console.log("eg appendTabTitle: BEFORE origTitle
							// = " + p.originalTitle + ", title = " + p.title);

							if (p.originalTitle == undefined
									|| p.originalTitle == null) {
								p.originalTitle = p.title;
							}

							var title = (p.originalTitle) ? p.originalTitle
									: p.title;
							p.setTitle(title + " " + appendText);
						}
					},

					load : function(custno) {
						var self = this;
						self.json = null;
						var graphStore = self.graphStore; // MFM2
						var hops = self.getSettings().getMaxHops();
						var degree = parseInt(hops);// + 1; //djue
						graphStore.proxy.extraParams.degree = degree;
						graphStore.proxy.url = Config.entityGraphCSUrl
								+ 'customer/' + custno;

						self.prevLoadParams.searchValue = self.prevLoadParams.value = self.prevLoadParams.prevValue = custno;

						// MFM progress indicator
						/*
						 * var pb = self.getProgressBar(); if (pb) { pb.wait({
						 * interval: 1000, duration: 90000, increment: 10, text:
						 * 'Searching ...', scope: this, fn: function() {
						 * pb.updateText("."); } }); }
						 */

						graphStore
								.load({
									scope : this, // ?
									callback : function(records, operation,
											success) {

										var pb2 = self.getProgressBar();

										if (success == false) {
											alert("Search failed due to server error.");

											if (pb2) {
												pb2
														.updateText("Search failed due to server error.");
												pb2.reset();
											}
											self.clear();
										} else {

											self.json = records[0].raw;
											// var graph =
											// xmlToGraph(records[0].raw); //
											// read the xml into graph structure
											// self.json=
											// self.GraphVis.graphToJSON(graph);
											// // create the graph json object.

											// results could be empty, check for
											// this here
											if (self.json
													&& self.json.nodes.length == 0) {
												alert("No data was found for this identifier.");
												// self.clear(); // don't clear
												// what is already shown
											} else {
												self.clear();
												self
														.showjson(self.prevLoadParams.value);
											}

											var nodeCount = self.json.nodes.length;
											self.appendTabTitle("("
													+ nodeCount.toString()
													+ ")");

											// if (pb2) {
											// pb2.updateText(graph.nodes.length
											// + " nodes");
											// pb2.reset();
											// }

											// DRAPER API
											// Send a System Activity Message
											// with optional metadata
											// activityLogger.logSystemActivity('Graph
											// results returned and displayed',
											// {'Tab':'PB Graph',
											// 'searchResults': { 'nodesFound':
											// graph.nodes.length.toString()
											// }});
										}
									}
								});
					},

					afterLayout : function() {
						var self = this;

						if (self.GraphVis.getGv() == null) {
							// TODO May want to override some styling attributes
							// in this config
							var config = {
								width : self.getWidth(),
								height : self.getHeight(),
								rightBorder : 320,
								leftBorder : 5,
								topBorder : 5,
								botBorder : 80
							};

							self.GraphVis.initGraph(config, self, function () {
								self.showjson(self.prevLoadParams.value);
							});
						} else {
							// This isn't even really necessary...
							//self.showjson(self.prevLoadParams.number);
							//self.showjson1Hop(false, null);
						}

						this.callParent(arguments);
					},
					afterRender : function() {
						var self = this;
						self.showjson();
						this.callParent(arguments);
					},

					// MFM
					importGraph : function() {
						importGraph(this);
					},

					exportGraph : function() {
						exportGraph(this, "Entity");
					},

					saveGraph : function() {
						saveGraph(this, "unknown");
					},

					restoreGraph : function(butid) {
						restoreGraph(this, "unknown", butid)
					},

					showjson : function(searchValue) {

						var self = this;
						if (self.json != null && self.GraphVis.getGv() != null) {
							self.GraphVis.showGraph(self.json, searchValue); // display
							// the
							// graph
						}
					},
					applySettings : function() {
						// called by Apply button

						var self = this;
						self.load(self.prevLoadParams.value); // this is the
						// last one we
						// loaded

					},

					nodeClick : function(node) {
						var self = this;
						self.currentNode = node;
						var nodeDisp = self.getNodeDisplay();
						nodeDisp.setAttrs(node);
						var type = node.data().idType;
						var isEntity = false;
						if (typeof isPivotableType !== "undefined") {
							// isPivotableType is a global function found in .html
							isEntity = isPivotableType(type);
						} else {
							isEntity = (type == 'customer' || type == 'LENDER' || type == 'BORROWER');
						}
						nodeDisp.enablePivot(isEntity);
						nodeDisp.enableShow(type == 'account' || isEntity);
						nodeDisp.enableHide(true);
					},

					editNode: function(node) {
						var self = this;
						
						if (!node || !node.isNode || !node.isNode()) {
							console.error("Variable 'node' is not a cytoscape node object.");
							return;
						}
						
						var x_pos = node.position().x;
						var y_pos = node.position().y;
						
						var window = Ext.create("DARPA.NodeEditor", {
							nodeRef: node,
							onComplete: function() {
								var fields = window.getAttrs();
								var newAttrs = [];
								for (var i = 0; i < fields.length; i++) {
									var field = fields[i];
									//node.data().attrs = node.data().attrs.concat([{key: name, val: value}])
									newAttrs.push({key: field.name, val: field.value});
								}
								node.data().attrs = newAttrs;
								
								node.data({
									"name": window.getName(),
									"idType": window.getIdType(),
									"color": window.getColor(),
									"EDITED_BY_USER": true
								});
							}
						});
						
						// window.showAt(x_pos, y_pos - window.height)?
						window.show();
					},

					givePromptToMerge: function(superNode, selectedNodes) {
						var owner = this;
						var window = Ext.create("DARPA.NodeMergeDialog", {
							confirmFn: function(reason) {
								// first, do the client-side merge of all the nodes and get subNodeIds
								var subNodeIds = owner.mergeNodes(superNode, selectedNodes); 

								// ...then persist those unmerges to the back-end service via REST
								/*
								Ext.Ajax.request({
									method: "POST",
									url: "TODO",
									//headers: {"Content-Type": "application/json"},
									params: {
										isMerge: true,
										superNodeIds: [superNode.data("id")],
										subNodeIds: subNodeIds,
										userComment: reason
										//TODO: get user ID
									},
									scope: this,
									success: function(resp) {
										console.log("Persist POST success.");
									},
									failure: function(resp) {
										console.error("Persist POST failed.");
									}
								});
								*/
							},
							cancelFn: function() {
								// don't merge
							}
						});
						window.show();
					},
					
					givePromptToUnmerge: function(superNodes) {
						var owner = this;
						var window = Ext.create("DARPA.NodeMergeDialog", {
							confirmFn: function(reason) {
								// first, do the client-side unmerge of all the nodes
								var superNodeIds = [];
								superNodes.each(function(i, n) {
									superNodeIds.push(n.data("id"));
									owner.unmergeNode(n);
								});
								
								// ...then persist those unmerges to the back-end service via REST
								/*
								Ext.Ajax.request({
									method: "POST",
									url: "TODO",
									//headers: {"Content-Type": "application/json"},
									params: {
										isMerge: false,
										superNodeIds: superNodeIds,
										subNodeIds: [],
										userComment: reason
										//TODO: get user ID
									},
									scope: this,
									success: function(resp) {
										console.log("Persist POST success.");
									},
									failure: function(resp) {
										console.error("Persist POST failed.");
									}
								});
								*/
							},
							cancelFn: function() {
								// don't merge
							}
						});
						window.show();
					},
					
					mergeNodes: function(superNode, selectedNodes) {
						var doContinue = true;
						try {
							if (typeof superNode == "undefined") throw "Variable 'superNode' is undefined.";
							if (typeof superNode.isNode == "undefined" || typeof superNode.isNode() == false) throw "Right-clicked element is not a node.";
							if (typeof selectedNodes == "string" || selectedNodes.length < 1) throw "No other nodes were selected.";
						} catch (e) {
							doContinue = false;
							Ext.Msg.alert("Failed to Merge", "Unable merge nodes.  Reason: " + e);
						}

						var _this = this;
						var typesMatch = true;
						for (var i = 0; i < selectedNodes.length; i++) {
							if (superNode.data("idType") !== selectedNodes[i].data("idType")) {
								typesMatch = false;
								break;
							}
						}
						
						if (!typesMatch) {
							doContinue = false;
							Ext.Msg.alert("Failed to Merge", "You can only merge nodes of the same type.");
						}
						
						if (!doContinue) return;
						
						var subNodeIds = [];
						
						selectedNodes.each(function(i, n) {
							if (n.data("id") != superNode.data("id")) {
							
								subNodeIds.push(n.data("id"));
								
								n.connectedEdges().each(function(j, e) {
									var edge_clone = e.json();
									if (e.data("target") == n.data("id")) {
										// selectedNode n is target node
										if (typeof edge_clone.data.old_targets == "undefined") {
											edge_clone.data.old_targets = [];
										}
										edge_clone.data.old_targets.push(n.data("id"));
										edge_clone.data.target = superNode.data("id");
									} else if (e.data("source") == n.data("id")) {
										// selectedNode n is source node
										if (typeof edge_clone.data.old_sources == "undefined") {
											edge_clone.data.old_sources = [];
										}
										edge_clone.data.old_sources.push(n.data("id"));
										edge_clone.data.source = superNode.data("id");
									}
									_this.GraphVis.gv.remove(e);
									_this.GraphVis.gv.add(edge_clone);
								});
								
								if (typeof superNode.data().subNodes == "undefined") {
									superNode.data().subNodes = [];
								}
								
								superNode.data().subNodes.push(n.json());
								_this.GraphVis.deleteNodes([n]);
							}
						});
						
						return subNodeIds;
					},
					
					unmergeNode: function(superNode) {
						if (typeof superNode == "undefined" || typeof superNode.isNode == "undefined" ||
							superNode.isNode == false || typeof superNode.data().subNodes == "undefined") {
							// fail quietly
							console.log("variable superNode is not valid input");
							return;
						}
						
						var _this = this;
						
						var subNodes = superNode.data("subNodes");
						while (subNodes.length > 0) {
							var subNodeJSON = subNodes.pop();
							_this.GraphVis.gv.add(subNodeJSON);
							_this.json.nodes.push(subNodeJSON);
							
							_this.GraphVis.gv.edges().each(function(i, e) {
								var edge_clone;
								
								if (typeof e.data().old_sources !== "undefined" && e.data().old_sources.length > 0) {
									var old_source = e.data().old_sources.pop();
									if (old_source == subNodeJSON.data.id) {
										edge_clone = e.json();
										edge_clone.data.source = subNodeJSON.data.id;
										_this.GraphVis.gv.remove(e);
										_this.GraphVis.gv.add(edge_clone);
										_this.json.edges.push(edge_clone);
									} else {
										// didn't match, so put it back
										e.data().old_sources.push(old_source);
									}
								}
								
								if (typeof e.data().old_targets !== "undefined" && e.data().old_targets.length > 0) {
									var old_target = e.data().old_targets.pop();
									if (old_target == subNodeJSON.data.id) {
										edge_clone = e.json();
										edge_clone.data.target = subNodeJSON.data.id;
										_this.GraphVis.gv.remove(e);
										_this.GraphVis.gv.add(edge_clone);
										_this.json.edges.push(edge_clone);
									} else {
										// didn't match, so put it back
										e.data().old_targets.push(old_target);
									}
								}
							});
						}
						// might not be necessary, since subNodes would be [] at this point
						delete superNode.data().subNodes;
					},
					
					nodeMouseOver : function(node) {
						var self = this;

						if (node.data().attrs.length <= 0) {
							// if there is no data, we do not want to create a
							// popup display
							self.mouseOverPopUp = undefined;
							return;
						}

						var dataHTML = (function(attrs) {
							var html = "<span>";

							html += "<TABLE rules='rows'>";
							for (var i = 0; i < attrs.length; ++i) {
								var a = attrs[i];
								if (a.key.indexOf("node-prop") == -1) {
									html += "<TR><TD>" + a.key + "</TD><TD>"
											+ a.val + "</TD></TR>";
								}
							}
							html += "</TABLE>";

							return html + "</span>";
						})(node.data().attrs);

						if (!self.mouseOverPopUp) {
							self.mouseOverPopUp = Ext.create("Ext.Window", {
								xtype : 'panel',
								height : 150,
								layout : 'fit',
								autoScroll : true,
								title : "Right-Click for more options",
								closable : false, // prevent X in top-right
								// corner
								bodyStyle : "padding:10px"
							});
						}

						self.mouseOverPopUp.update(dataHTML);
						// self.mouseOverPopUp.show();
					},

					edgeClick : function(edge) {
						var self = this;
						var nodeDisp = self.getNodeDisplay();
						var d = edge.data();
						if (d && d.attrs)
							nodeDisp.setAttrs(edge);
					},
					nodeRightClick : function(node) {
						// now gets called on mouseover, after a timeout
						var idType = node.data().idType;
						if (!(idType == 'LENDER' || idType == 'BORROWER'))
							return;

						var self = this;
						// var actions = self.getNodeDisplay().getActions();

						// retrieve the name/value pairs in node.data().attrs
						// array using
						// this (immediate) anonymous function
						var dataHTML = (function(attrs) {
							var html = "<span>";

							html += "<TABLE rules='rows'>";
							for (var i = 0; i < attrs.length; ++i) {
								var a = attrs[i];
								if (a.key.indexOf("node-prop") == -1) {
									html += "<TR><TD>" + a.key + "</TD><TD>"
											+ a.val + "</TD></TR>";
								}
							}
							html += "</TABLE>";

							return html + "</span>";
						})(node.data().attrs);

						var buttons = [

						Ext.create("Ext.Button", {
							text : 'HIDE',
							listeners : {
								'click' : function(b) {
									self.hideNode(node);
									self.popup.close();
								}
							}
						}),
						/*
						 * PWG - You can't select a hidden node to unhide it!
						 * This needs to be a menu option.
						 * Ext.create("Ext.Button", { text:'UNHIDE', listeners:{
						 * 'click':function(b) { self.unhide();
						 * self.popup.close(); } } }),
						 */
						Ext.create("Ext.Button", {
							text : 'PIVOT',
							listeners : {
								'click' : function(b) {
									self.pivot(node);
									self.popup.close();

								}
							}
						}),
						/*
						 * Again, needs to be a menu option. Should not have to
						 * select a node in order to unpivot.
						 * Ext.create("Ext.Button", { text:'UNPIVOT',
						 * listeners:{ 'click':function(b) { self.unpivot(node);
						 * self.popup.close(); } } }),
						 */
						Ext.create("Ext.Button", {
							text : 'EXPAND',
							listeners : {
								'click' : function(b) {
									self.expand(node); // expand out 1 hop from
									// this node
									self.popup.close();
								}

							// DRAPER API
							// Send a User Activity Message with optional
							// metadata
							// activityLogger.logUserActivity('Expand Selected
							// Node', 'PB Graph Tab', activityLogger.WF_SEARCH,
							// {'Tab':'PB Graph', 'action': 'Expand',
							// 'selectedNode': node.data().name });

							}
						}), Ext.create("Ext.Button", {
							text : 'COMPACT',
							listeners : {
								'click' : function(b) {
									self.unexpand(node);
									self.popup.close();
								}
							}
						}), Ext.create("Ext.Button", {
							text : 'SHOW',
							listeners : {
								'click' : function(b) {
									self.popup.close(); // has to be first
									self.showDetail(node.data());
								}
							}
						})

						];

						// var pivot = Ext.getCmp(self.id +
						// '-NodeDisplay-Actions-PIVOT');

						// alert(!pivot.isDisabled());

						self.popup = Ext.create("Ext.Window", {
							xtype : 'panel',
							height : 200,
							width : 400,
							layout : 'fit',
							autoScroll : true,
							title : 'Pick an option for ' + node.data().name,
							bodyStyle : "padding:10px",
							html : dataHTML,
							// items:buttons
							buttons : buttons
						});
						self.popup.show();
					},

					/*
					 * nodeEnter:function(node) { // TODO: This does not work
					 * because for some reason self was initiated as the window
					 * instead of // the object. Odd, because nodeClick for
					 * example works. //var self = this; //self.currentNode =
					 * node; // var self = getPBFrame().getGraph(); // if (self) { //
					 * var nodeDisp =self.getNodeDisplay(); //
					 * nodeDisp.setAttrs(node.data().attrs); // } },
					 * nodeLeave:function(node) { var self=this; //
					 * self.currentNode = null; },
					 */
					getNodeDisplay : function() {
						var self = this;
						var tabPanel = this.items.items[1];
						var tabScreen = tabPanel.items.items[0];
						return tabScreen.items.items[0];
					},
					getSettings : function() {
						var self = this;
						var tabPanel = this.items.items[1];
						var settingsPanel = tabPanel.items.items[1];
						return settingsPanel.items.items[0];
					},

					pivot : function(node) {
						// assumes tbe node type is entity for now
						var self = this;
						self.prevLoadParams.type = 'customer';
						self.prevLoadParams.prevValue = node.data().idVal;
						self.load(self.prevLoadParams.prevValue);

					},
					hideNode : function(node) {
						var self = this;
						self.GraphVis.hideNode(node);
						self.prevNode = node;
						self.currentNode = null;
						var unhide = self.getUnHideButton();
						if (unhide) {
							unhide.setDisabled(false);
						}
						;
					},
					unhide : function() {
						var self = this;
						if (self, prevNode) {
							self.GraphVis.showNode(prevNode);
							self.currentNode = prevNode;
							var unhide = self.getUnHideButton();
							if (unhide)
								unhide.setDisabled(true);
							// DRAPER API
							// Send a User Activity Message with optional
							// metadata
							// activityLogger.logUserActivity('UNHide Selected
							// Node', 'PB Graph Tab', activityLogger.WF_OTHER,
							// {'Tab':'PB Graph', 'action': 'UNHide',
							// 'selectedNode': self.prevNode.name });
						}
						; // if prevNode

					},

					// MFM added
					unpivot : function() {
						var self = this;
						if (self.prevLoadParams.type == 'customer') {
							var idValue = self.prevLoadParams.prevValue;
							if (idValue) {
								self.load(idValue);
							}
						}
					},

					// MFM Expand out 1 hop from the selected node
					// userInitiated will be true when the user specifically
					// expands a node, else this will be false
					showjson1Hop : function(userInitiated) {
						var self = this;
						var node = self.json1HopNode;

						// DEBUG
						// console.log("showjson1Hop");

						if (self.json1Hop != null && node != null) {
							// Don't NEED:
							// self.fd.canvas.resize(this.items.items[0].getWidth(),this.items.items[0].getHeight());
							self.json = self.GraphVis.showGraph1Hop(self.json1Hop, node); // display
							// the
							// graph
							if (userInitiated && userInitiated == true) {
								self.nodesExpanded++;
							}
						}
					},

					// load data for specified node expanded 1 hop out
					loadOneHop : function(intype, node, pb, fromDate, toDate) {
						var self = this;
						var graphStore = self.graphStore; // MFM2

						var s = self.getSettings();
						var maxNewCallsAlertThresh = 30; // Adjust as needed

						// DEBUG
						// console.log("loadOneHop");

						// for feedback while the query and graph display is in progress
						var mbox = Ext.Msg.show({
							title : 'Expand',
							msg : 'The expanded data is being obtained and prepared for display. Please wait...',
							buttons : Ext.Msg.OK
						});

						// PWG OR TRY: utils.setBlink(self, true);

						graphStore.proxy.extraParams.degree = 1; // labelled hops. only 1 hop out from this node
						graphStore.proxy.extraParams.maxEdgesPerNode = s.getMaxEdgesPerNode();
						graphStore.proxy.extraParams.maxNodes = s.getMaxNodes();
						if (graphStore.proxy.extraParams.maxNodes > 200) {
							graphStore.proxy.extraParams.maxNodes = 200; // hard limit for this case
						}
						if (maxNewCallsAlertThresh > graphStore.proxy.extraParams.maxEdgesPerNode) {
							maxNewCallsAlertThresh = graphStore.proxy.extraParams.maxEdgesPerNode;
						}
						graphStore.proxy.extraParams.minWeight = s.getMinWeight();
						// MFM The Rest Service expects this:
						// @QueryParam("fromdt") @DefaultValue(value = "0")
						// String minSecs,
						// @QueryParam("todt") @DefaultValue(value = "0") String
						// maxSecs,

						//graphStore.proxy.extraParams.fromdt = fromDate;
						//graphStore.proxy.extraParams.todt = toDate;
						if (intype == null || intype.length == 0) {
							intype = "customer";
						}
						graphStore.proxy.extraParams.Type = intype;

						// Type must be set in the URL
						//Changed from node.name to node.data().name --djue
						graphStore.proxy.url = Config.entityGraphUrl + intype + '/' + node.data().name;
						
						// DEBUG
						// console.log("loadOneHop: Service URL = " + graphStore.proxy.url);

						self.json1Hop = null; // prevents us from trying to display the previous graph if we switch to this tab before we have fully loaded the new graph
						self.json1HopNode = node;

						graphStore.load({
							scope : this, // ?
							callback : function(records, operation, success) {

								if (success == false) {
									alert("Failed to retrieve graph results due to a server error. Please contact your System Administrator."); // MFM
									self.json1HopNode = null;
									if (pb) {
										pb.updateText("Search failed due to server error.");
										pb.reset();
									}
									// don't alter or clear the existing graph
								} else {
									var graph = records[0].raw;
									self.json1Hop = graph;

									// results could be empty, check for this here
									if (self.json1Hop && self.json1Hop.nodes.length <= 2) { 
										// don't include this node already connected to another node in the graph
										alert("No additional items were found for this id.");
										self.json1HopNode = null;
										// don't alter the existing graph
									} else {
										if (self.json1Hop.length > maxNewCallsAlertThresh) {
											if (mbox) {
												mbox.close();
											}
											Ext.Msg.confirm(
												'Confirm',
												'This value has more than ' + maxNewCallsAlertThresh + ' items and may clutter the display. Do you want to continue displaying it?',
												function(ans) {
													if (ans == 'yes') {
														self.showjson1Hop(true);
													}
												}
											);
										} else {
											self.showjson1Hop(true);
										}
									}

									var nodeCount = self.json.nodes.length;
									self.appendTabTitle("(" + nodeCount.toString() + ")");

									if (pb) {
										pb.updateText(graph.nodes.length + " nodes");
										pb.reset();
									}
									// Update title to display the communicationId value and value of nodes found
									// self.updateTitle(graph.nodes.length, self.prevLoadParams.value );
								}
								if (mbox) {
									mbox.close();
								}

							}
						});
					},

					// Expand out 1 hop for selected node only
					// pb - Reference to Progress bar (if any)
					doPBNumberExpand : function(intype, pb, node, opts) {
						var self = this;
						// DEBUG
						// console.log("doPBNumberExpand: intype = " + intype +
						// ", node.name = " + node.name);

						// MFM Progress bar
						if (pb) {
							pb.wait({
								interval : 1000,
								duration : 60000,
								increment : 10,
								text : 'Expand ' + node.data().name
										+ ' Searching ...', // MFM2
								scope : this,
								fn : function() {
									pb.updateText(".");
								}
							});
						}

						self.loadOneHop(intype, node, pb, null, null); // last
						// 2
						// params
						// are
						// placeholders
						// for
						// start
						// and
						// end
						// date

					},

					// Expand out one hop from a selected node; On the resulting
					// graph,
					// when you select a leaf node it should expand out ONLY
					// that node one more hop
					expand : function(node) {
						var self = this;
						var idType = getNodeIdType(node); // in graphutils
						var pb = self.getProgressBar();
						self.doPBNumberExpand(idType, pb, node, null);

						// When the results are returned, this will eventually
						// call the showjson1Hop() function (see above).

					},
					// Remove or hide the expanded nodes from the graph,
					unexpand : function(node) {
						var self = this;

						self.GraphVis.unexpand1Hop(node); // display the graph
						self.nodesExpanded--;

						// DEBUG
						// console.log("unexpand nodesExpanded is now = " +
						// self.nodesExpanded);
						if (self.nodesExpanded <= 0) {
							self.nodesExpanded = 0;
							self.json1Hop = null; // clear the json data
						}

					},

					// filter is meant to hide items in the graph canvas
					// searchItems is a string that may contain a partial or
					// full string (anything), or a comma separated list of
					// strings
					// fromDate and toDate are numeric (in millisecs)
					applyFilter : function(searchItems, amount, fromDate,
							toDate) {
						// applyFilter(this, searchItems, amount, fromDate,
						// toDate);
						var self = this;
						// applyFilter(self, searchItems, amount, null, null);
						// // MFM from and todates set to null until entity
						// graph has temporal data
						applyFilter(self, searchItems, amount, fromDate, toDate);
					},

					// MFM JIRA-29
					// applyAdditionalFieldsFilter is meant to hide items in the
					// graph canvas
					// filterItems - array of additional attributes (fields) to
					// filter on
					applyAdditionalFieldsFilter : function(filterItems,
							compareType) {
						var self = this;
						applyAdditionalFieldsFilter(self, filterItems,
								compareType);
					},

					// clear filter is meant to unhide all items in the graph
					// canvas
					clearFilter : function() {
						clearFilter(this);
					},

					clear : function() {
						var self = this;
						if (self.GraphVis.getGv() != null) {
							self.GraphVis.clear();
						}
					},
					restore : function() {
						var self = this;
						// TODO. We get here after tabbing back to the Customer
						// tab but I haven't been able to get the graph to
						// reshow

					},
					getPivotButton : function() {
						var self = this;
						return Ext.getCmp(self.id
								+ '-NodeDisplay-Actions-PIVOT');
					},

					getUnPivotButton : function() {
						var self = this;
						return Ext.getCmp(self.id
								+ '-NodeDisplay-Actions-UNPIVOT');
					},

					getHideButton : function() {
						var self = this;
						return Ext
								.getCmp(self.id + '-NodeDisplay-Actions-HIDE');
					},

					getUnHideButton : function() {
						var self = this;
						return Ext.getCmp(self.id
								+ '-NodeDisplay-Actions-UNHIDE');
					},
					getExpandButton : function() {
						var self = this;
						return Ext.getCmp(self.id
								+ '-NodeDisplay-Actions-EXPAND');
					},
					getUnExpandButton : function() {
						var self = this;
						return Ext.getCmp(self.id
								+ '-NodeDisplay-Actions-UNEXPAND');
					},
					getShowButton : function() {
						var self = this;
						return Ext
								.getCmp(self.id + '-NodeDisplay-Actions-SHOW');
					},
					getStopButton : function() {
						var self = this;
						return Ext
								.getCmp(self.id + '-NodeDisplay-Actions-STOP');
					},

					showDetail : function(data) {
						// Called when you click on "SHOW" in the graph
						// passes us the data associated with the node

						if (data.idType == 'customer') {
							showEntityDetails(data.idVal); // global in the
							// html code

						} else if (data.idType == 'account') {
							for (var i = 0; i < data.attrs.length; ++i) {
								if (data.attrs[i].key == 'entityId') {
									showEntityDetails(data.attrs[i].val);
									// TODO: set a flag to load the ledger when
									// the entity has been loaded
									// However: if we eventually show all
									// transactions automatically
									// this will be redundant.
									break;
								}
							}

						}
					}

				}); // define

Ext.define("EntityGraph", {
	extend : 'Ext.data.Model'
});

function makeEntityGraphStore() {
	var graphStore = Ext.create('Ext.data.JsonStore', {
		proxy : {
			type : 'ajax',
			model : 'EntityGraph',
			timeout : 120000,
			url : '',
			reader : {
				type : 'json'
			// record:'graph',
			// root:'graphml'
			}
		}
	});
	return graphStore;
}
