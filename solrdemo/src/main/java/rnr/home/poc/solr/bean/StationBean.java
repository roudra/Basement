package rnr.home.poc.solr.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.solr.client.solrj.beans.Field;

import java.util.Date;

public class StationBean{
    @JsonProperty("id")
    @Field private long recordId;
    @Field private String stationName;
    @Field private int availableDocks;
    @Field private int totalDocks;
    @Field private double latitude;
    @Field private double longitude;
    @Field private String statusValue;
    @Field private int statusKey;
    @Field private int availableBikes;
    @Field private String stAddress1;
    @Field private String stAddress2;
    @Field private String city;
    @Field private String postalCode;
    @Field private String location;
    @Field private String altitude;
    @Field private boolean testStation;
    @Field private Date lastCommunicationTime;
    @Field private String landMark;

    public StationBean(){
        super();
    }

    public long getRecordId() {
        return recordId;
    }

    public StationBean setRecordId(long recordId) {
        this.recordId = recordId;
        return this;
    }

    public String getStationName() {
        return stationName;
    }

    public StationBean setStationName(String stationName) {
        this.stationName = stationName;
        return this;
    }

    public int getAvailableDocks() {
        return availableDocks;
    }

    public StationBean setAvailableDocks(int availableDocks) {
        this.availableDocks = availableDocks;
        return this;
    }

    public int getTotalDocks() {
        return totalDocks;
    }

    public StationBean setTotalDocks(int totalDocks) {
        this.totalDocks = totalDocks;
        return this;
    }

    public double getLatitude() {
        return latitude;
    }

    public StationBean setLatitude(double latitude) {
        this.latitude = latitude;
        return this;
    }

    public double getLongitude() {
        return longitude;
    }

    public StationBean setLongitude(double longitude) {
        this.longitude = longitude;
        return this;
    }

    public String getStatusValue() {
        return statusValue;
    }

    public StationBean setStatusValue(String statusValue) {
        this.statusValue = statusValue;
        return this;
    }

    public int getStatusKey() {
        return statusKey;
    }

    public StationBean setStatusKey(int statusKey) {
        this.statusKey = statusKey;
        return this;
    }

    public int getAvailableBikes() {
        return availableBikes;
    }

    public StationBean setAvailableBikes(int availableBikes) {
        this.availableBikes = availableBikes;
        return this;
    }

    public String getStAddress1() {
        return stAddress1;
    }

    public StationBean setStAddress1(String stAddress1) {
        this.stAddress1 = stAddress1;
        return this;
    }

    public String getStAddress2() {
        return stAddress2;
    }

    public StationBean setStAddress2(String stAddress2) {
        this.stAddress2 = stAddress2;
        return this;
    }

    public String getCity() {
        return city;
    }

    public StationBean setCity(String city) {
        this.city = city;
        return this;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public StationBean setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public StationBean setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getAltitude() {
        return altitude;
    }

    public StationBean setAltitude(String altitude) {
        this.altitude = altitude;
        return this;
    }

    public boolean isTestStation() {
        return testStation;
    }

    public StationBean setTestStation(boolean testStation) {
        this.testStation = testStation;
        return this;
    }

    public Date getLastCommunicationTime() {
        return lastCommunicationTime;
    }

    public StationBean setLastCommunicationTime(Date lastCommunicationTime) {
        this.lastCommunicationTime = lastCommunicationTime;
        return this;
    }

    public String getLandMark() {
        return landMark;
    }

    public StationBean setLandMark(String landMark) {
        this.landMark = landMark;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StationBean{");
        sb.append("recordId=").append(recordId);
        sb.append(", stationName='").append(stationName).append('\'');
        sb.append(", availableDocks=").append(availableDocks);
        sb.append(", totalDocks=").append(totalDocks);
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", statusValue='").append(statusValue).append('\'');
        sb.append(", statusKey=").append(statusKey);
        sb.append(", availableBikes=").append(availableBikes);
        sb.append(", stAddress1='").append(stAddress1).append('\'');
        sb.append(", stAddress2='").append(stAddress2).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", postalCode='").append(postalCode).append('\'');
        sb.append(", location='").append(location).append('\'');
        sb.append(", altitude='").append(altitude).append('\'');
        sb.append(", testStation=").append(testStation);
        sb.append(", lastCommunicationTime=").append(lastCommunicationTime);
        sb.append(", landMark='").append(landMark).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
