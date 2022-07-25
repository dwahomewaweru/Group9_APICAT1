package com.apps.realestateco.Model;

import javax.persistence.*;

@Entity
@Table (name = "PROPERTY")
public class Property {

    @Id
    @Column(name = "PROPERTY_ID")
    private Long propertyId;
    @Column(name = "PROPERTY_TITLE")
    private String title;
    @Column(name = "PROPERTY_TYPE")
    private String type;
    @ManyToOne
    @JoinColumn(name = "AGENT_ID")
    private Agent agent;
    @Column( name = "PROPERTY_LOCATION")
    private String location;
    @Column(name = "PROPERTY_AREASIZE")
    private int areaSize;
    @Column(name = "PROPERTY_PRICE")
    private int price;

    public Property(Long propertyId, String title, String type, Agent agent, String location, int areaSize, int price) {
        this.propertyId = propertyId;
        this.title = title;
        this.type = type;
        this.agent = agent;
        this.location = location;
        this.areaSize = areaSize;
        this.price = price;
    }

    public Property() {

    }

    public Long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAreaSize() {
        return areaSize;
    }

    public void setAreaSize(int areaSize) {
        this.areaSize = areaSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
