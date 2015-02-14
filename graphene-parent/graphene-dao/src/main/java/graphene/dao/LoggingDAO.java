package graphene.dao;

import graphene.model.idl.G_GraphViewEvent;
import graphene.model.idl.G_ReportViewEvent;
import graphene.model.idl.G_UserLoginEvent;
import graphene.model.query.BasicQuery;
import graphene.model.query.EntityQuery;

import java.util.List;

import mil.darpa.vande.generic.V_GraphQuery;
import mil.darpa.vande.interactions.TemporalGraphQuery;

/**
 * DAO for recording user initiated events, errors and system status to a
 * persistent store for later analysis and auditing.
 * 
 * @author djue
 * 
 */
public interface LoggingDAO {

	List<Object> getAllEvents(String userId, String partialTerm, int limit);

	List<TemporalGraphQuery> getGraphQueries(String userId, String partialTerm, int limit);

	List<G_GraphViewEvent> getGraphViewEvents(String userId, int limit);

	List<EntityQuery> getQueries(String userId, String partialTerm, int offset, int limit);

	List<G_ReportViewEvent> getReportViewEvents(String userId, int limit);

	/**
	 * Record an export event and what values were used to initiate the export.
	 * 
	 * @param queryString
	 * @return
	 */
	public abstract boolean recordExport(String queryString);

	public abstract void recordGraphViewEvent(G_GraphViewEvent q);

	/**
	 * Record the event of a user logging in.
	 * 
	 * 
	 * @param e
	 */
	public abstract void recordLoginEvent(G_UserLoginEvent e);

	/**
	 * For recording query terms (or queries that were executed, with all their
	 * options) for auditing and analysis. Make sure the user information is
	 * included in the query object if you need to log it.
	 * 
	 * @param sq
	 *            The entity query initiated by the user
	 */
	public abstract void recordQuery(BasicQuery sq);

	/**
	 * For recording query terms (or queries that were executed, with all their
	 * options) for auditing and analysis.
	 * 
	 * @param queryString
	 * @return
	 */
	public abstract void recordQuery(V_GraphQuery q);

	public abstract void recordReportViewEvent(G_ReportViewEvent q);
}
