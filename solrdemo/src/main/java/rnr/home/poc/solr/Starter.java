package rnr.home.poc.solr;

import rnr.home.poc.solr.bean.CitiBikeStationInfo;

public class Starter {

    public static void main(String[] args){
        try {
            CitiBikeStationInfo info = new FeedLoader().loadFeed("/feed/citibike_nyc.json");
            //new SolrOperator().insert(info);
            new SolrOperator().query();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
