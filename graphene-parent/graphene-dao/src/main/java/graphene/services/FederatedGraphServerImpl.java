package graphene.services;

import graphene.dao.FederatedGraphServer;
import graphene.util.validator.ValidationUtils;

import java.util.Collection;

import org.apache.tapestry5.ioc.annotations.Inject;
import org.slf4j.Logger;

public class FederatedGraphServerImpl implements FederatedGraphServer {
	private Collection<AbstractGraphBuilder> singletons;
	@Inject
	private Logger logger;

	public FederatedGraphServerImpl(Collection<AbstractGraphBuilder> singletons) {
		this.singletons = singletons;
		printDatasetsSupported();
	}

	/**
	 * This is a rudimentary implementation that just returns the first graph
	 * builder that supports the dataset. Eventually we want to return a
	 * collection of graph builders supporting the dataset.
	 * 
	 * @param datasource
	 * @return
	 */
	@Override
	public AbstractGraphBuilder getGraphBuilderForDataSource(String datasource) {
		if (ValidationUtils.isValid(datasource)) {
			if (ValidationUtils.isValid(singletons)) {
				for (AbstractGraphBuilder s : singletons) {
					if (s.getSupportedDatasets().contains(datasource)) {
						logger.debug("Found service "
								+ s.getClass().getCanonicalName()
								+ " for datasource " + datasource);
						return s;
					}
				}
			} else {
				logger.warn("No graph builders found");
			}
		} else {
			logger.warn("No datasource specified");
		}
		logger.warn("Unable to find a graph generator for type " + datasource);
		return null;
	}

	@Override
	public String toString() {
		return "FederatedGraph ["
				+ (singletons != null ? "singletons=" + singletons : "") + "]";
	}

	@Override
	public void printDatasetsSupported() {
		System.out.println("--------------------------------------");
		System.out.println("FEDERATED GRAPH DATASETS -------------");
		System.out.println("--------------------------------------");
		for (AbstractGraphBuilder s : singletons) {
			System.out.println("Supports " + s.getSupportedDatasets());
		}
		System.out.println("--------------------------------------");
	}
}