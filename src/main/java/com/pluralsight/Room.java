package com.pluralsight;

public class Room {

    private final int numOfBeds;
    private final double getPrice;
    private final boolean isOccupied;
    private final boolean isDirty;

    public Room(int numOfBeds, double getPrice, boolean isOccupied, boolean isDirty) {
        this.numOfBeds = numOfBeds;
        this.getPrice = getPrice;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumOfBeds() {
        return numOfBeds;
    }

    public double getGetPrice() {
        return getPrice;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean getIsAvailable(){
        if(isDirty == true || isOccupied == true){
            return false;
        }
        return true;
    }
}
