package org.anirudh.redquark.remotesolraem.core;

import java.io.IOException;

import javax.jcr.RepositoryException;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.commons.json.JSONArray;
import org.apache.sling.commons.json.JSONException;
import org.apache.sling.commons.json.JSONObject;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;

import com.day.cq.search.result.SearchResult;

/**
 * This interface describes the operations exposed by this service
 */
public interface SolrSearchService {

	JSONArray crawlContent(String resourcePath, String resourceType);

	JSONArray createPageMetadataArray(SearchResult searchResult) throws RepositoryException;

	JSONObject createPageMetadataObject(Resource pageContent);

	boolean indexPageToSolr(JSONObject indexPageData, HttpSolrClient server)
			throws JSONException, SolrServerException, IOException;

	boolean indexPagesToSolr(JSONArray indexPageData, HttpSolrClient server)
			throws JSONException, SolrServerException, IOException;

}