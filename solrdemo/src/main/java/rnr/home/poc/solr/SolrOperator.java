package rnr.home.poc.solr;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import rnr.home.poc.solr.bean.CitiBikeStationInfo;

import java.util.ArrayList;
import java.util.List;

public class SolrOperator {

    String urlString = "http://localhost:8983/solr/CitiBike";

    public void update(CitiBikeStationInfo info) throws Exception{
        SolrClient solr = new HttpSolrClient.Builder(urlString).build();

        solr.addBeans(info.getStationBeanList());
        solr.commit();
    }
}
