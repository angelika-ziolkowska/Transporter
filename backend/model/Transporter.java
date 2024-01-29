package com.example.transporter.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "transporters")
public
class Transporter {
    // @Column(name = "type")
    // private String type;

    @Id
 	@GeneratedValue(strategy = GenerationType.IDENTITY)
 	private long identityId;
    // @Column(name = "id")
    // private String id;

    @Column(name = "operationType")
    private int operationType;

    @Column(name = "vehicleId")
    private String vehicleId;

    @Column(name = "naptanId")
    private String naptanId;

    @Column(name = "stationName")
    private String stationName;

    @Column(name = "lineId")
    private String lineId;

    @Column(name = "lineName")
    private String lineName;

    @Column(name = "platformName")
    private String platformName;

    //inbound or outbound
    @Column(name = "direction")
    private String direction;

    @Column(name = "bearing")
    private String bearing;

    @Column(name = "destinationNaptanId")
    private String destinationNaptanId;

    @Column(name = "destinationName")
    private String destinationName;

    // datetime
    @Column(name = "timestamp")
    private String timestamp;

    @Column(name = "timeToStation")
    private int timeToStation;

    @Column(name = "currentLocation")
    private String currentLocation;

    @Column(name = "towards")
    private String towards;

    //datetime
    @Column(name = "expectedArrival")
    private String expectedArrival;

    @Column(name = "timeToLive")
    private String timeToLive;

    @Column(name = "modeName")
    private String modeName;

    public Transporter(){
    }

    public Transporter(
                int operationType, 
                String vehicleId, 
                String naptanId, 
                String stationName, 
                String lineId, 
                String lineName, 
                String platformName, 
                String direction, 
                String bearing, 
                String destinationNaptanId, 
                String destinationName, 
                String timestamp, 
                int timeToStation, 
                String currentLocation, 
                String towards, 
                String expectedArrival,
                String timeToLive, 
                String modeName 
                ) {
        super();
        //this.id = id;
        //this.type = type;
        this.operationType = operationType;
        this.vehicleId = vehicleId;
        this.naptanId = naptanId;
        this.stationName = stationName;
        this.lineId = lineId;
        this.lineName = lineName;
        this.platformName = platformName;
        this.direction = direction;
        this.bearing = bearing;
        this.destinationNaptanId = destinationNaptanId;
        this.destinationName = destinationName;
        this.timestamp = timestamp;
        this.timeToStation = timeToStation;
        this.currentLocation = currentLocation;
        this.towards = towards;
        this.expectedArrival = expectedArrival;
        this.timeToLive = timeToLive;
        this.modeName = modeName;
    }

    @Override
	public String toString() {
		return "Transporter [identityid=" + identityId + ", operationType=" + operationType + ", vehicleId=" + vehicleId + ", naptanId=" + naptanId + "stationName=" + stationName + 
        ", lineId=" + lineId + ", lineName=" + lineName + ", platformName=" + platformName + ", direction=" + direction + ", bearing=" + bearing + 
        ", destinationNaptanId=" + destinationNaptanId + ", destinationName=" + destinationName + ", timestamp=" + timestamp + ", timeToStation=" + timeToStation + 
        ", currentLocation=" + currentLocation + ", towards=" + towards + ", expectedArrival=" + expectedArrival + ", timeToLive=" + timeToLive + ", modeName=" + modeName + 
         "]";
	}

    // public String getType() {
    //     return type;
    // }

    // public void setType(String type) {
    //     this.type = type;
    // }

    public long getIdentityId() {
        return identityId;
    }

    // public void setId(Long id) {
    //     this.id = id;
    // }
    
    public int getOperationType() {
        return operationType;
    }

    public void setOperationType(int operationType) {
        this.operationType = operationType;
    }
    
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    
    public String getNaptanId() {
        return naptanId;
    }

    public void setNaptanId(String naptanId) {
        this.naptanId = naptanId;
    }
    
    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
    
    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }
    
    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }
    
    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }
    
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    
    public String getBearing() {
        return bearing;
    }

    public void setBearing(String bearing) {
        this.bearing = bearing;
    }
    
    public String getDestinationNaptanId() {
        return destinationNaptanId;
    }

    public void setDestinationNaptanId(String destinationNaptanId) {
        this.destinationNaptanId = destinationNaptanId;
    }
    
    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }
    
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    
    public int getTimeToStation() {
        return timeToStation;
    }

    public void setTimeToStation(int timeToStation) {
        this.timeToStation = timeToStation;
    }
    
    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }
    
    public String getTowards() {
        return towards;
    }

    public void setTowards(String towards) {
        this.towards = towards;
    }
    
    public String getExpectedArrival() {
        return expectedArrival;
    }

    public void setExpectedArrival(String expectedArrival) {
        this.expectedArrival = expectedArrival;
    }
    
    public String getTimeToLive() {
        return timeToLive;
    }

    public void setTimeToLive(String timeToLive) {
        this.timeToLive = timeToLive;
    }
    
    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public void forEach(Object object) {
    }
}
