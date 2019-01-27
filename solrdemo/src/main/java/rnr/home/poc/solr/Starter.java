package rnr.home.poc.solr;

import rnr.home.poc.solr.bean.CitiBikeStationInfo;

import java.io.IOException;

public class Starter {

    public static void main(String[] args){
        try {
            CitiBikeStationInfo info = new FeedLoader().loadFeed("/feed/citibike_nyc.json");
            new SolrOperator().update(info);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
