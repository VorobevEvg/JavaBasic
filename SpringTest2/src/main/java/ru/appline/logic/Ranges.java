package ru.appline.logic;

public class Ranges {

 /*   private String value;

    public Ranges()
    {
        super();
    }

    public Ranges(String value) {
        this.value = value;
    }

    public String getRange() {
        return value;
    }

    public void setRange(String value) {
        this.value = value;
    }*/

    private String north;
    private String east;
    private String south;
    private String west;
    private String northEast;
    private String northWest;
    private String southEast;
    private String southWest;

    public Ranges()
    {
        super();
    }

    public Ranges(String north, String east, String south, String west, String northEast, String northWest, String southEast, String southWest) {
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
        this.northEast = northEast;
        this.northWest = northWest;
        this.southEast = southEast;
        this.southWest = southWest;
    }

    public String getEast() {
        return east;
    }

    public void setEast(String east) {
        this.east = east;
    }

    public String getSouth() {
        return south;
    }

    public void setSouth(String south) {
        this.south = south;
    }

    public String getWest() {
        return west;
    }

    public void setWest(String west) {
        this.west = west;
    }

    public String getNorth() {
        return north;
    }

    public void setNorth(String north) {
        this.north = north;
    }

    public String getNorthEast() {
        return northEast;
    }

    public void setNorthEast(String northEast) {
        this.northEast = northEast;
    }

    public String getNorthWest() {
        return northWest;
    }

    public void setNorthWest(String northWest) {
        this.northWest = northWest;
    }

    public String getSouthEast() {
        return southEast;
    }

    public void setSouthEast(String southEast) {
        this.southEast = southEast;
    }

    public String getSouthWest() {
        return southWest;
    }

    public void setSouthWest(String southWest) {
        this.southWest = southWest;
    }
}
