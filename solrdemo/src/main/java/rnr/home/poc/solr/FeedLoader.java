package rnr.home.poc.solr;


import com.fasterxml.jackson.databind.ObjectMapper;
import rnr.home.poc.solr.bean.CitiBikeStationInfo;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;

public class FeedLoader {

    Logger logger = Logger.getLogger(FeedLoader.class.getName());

    public CitiBikeStationInfo loadFeed(String path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        final DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        objectMapper.setDateFormat(df);
        CitiBikeStationInfo info = objectMapper.readValue(this.getClass().getResource(path), CitiBikeStationInfo.class);
        //logger.info(info.toString());
        return info;
    }
}
