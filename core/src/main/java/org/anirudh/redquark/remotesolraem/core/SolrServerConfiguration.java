package org.anirudh.redquark.remotesolraem.core;

/**
 * This interface describes operations exposed by this configuration service
 */
public interface SolrServerConfiguration {

	public String getSolrProtocol();

	public String getSolrServerName();

	public String getSolrServerPort();

	public String getSolrCoreName();

	public String getContentPagePath();
}
