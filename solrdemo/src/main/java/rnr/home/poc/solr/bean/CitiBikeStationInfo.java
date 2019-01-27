package rnr.home.poc.solr.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@JsonAutoDetect
public class CitiBikeStationInfo implements Serializable {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CitiBikeStationInfo{");
        sb.append("executionTime=").append(executionTime);
        sb.append(", stationBeanList=").append(stationBeanList);
        sb.append('}');
        return sb.toString();
    }

    public Date getExecutionTime() {
        return executionTime;
    }

    public CitiBikeStationInfo setExecutionTime(Date executionTime) {
        this.executionTime = executionTime;
        return this;
    }

    public Collection<StationBean> getStationBeanList() {
        return stationBeanList;
    }

    public CitiBikeStationInfo setStationBeanList(Collection<StationBean> stationBeanList) {
        this.stationBeanList = stationBeanList;
        return this;
    }

    private Date executionTime;
    private Collection<StationBean> stationBeanList;
}

