package rnr.home.solr.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@JsonAutoDetect
public @Data class CitiBikeStationInfo implements Serializable {
    private Date executionTime;
    private Collection<StationBean> stationBeanList;
}

