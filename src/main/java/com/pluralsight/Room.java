package com.pluralsight;

public class Room {

    private int numOfBeds;
    private final double getPrice;
    private boolean isOccupied;
    private boolean isDirty;

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
        if(this.isDirty && this.isOccupied){
            return false;
        }
        return true;
    }

    public void checkedIn(){
       if(getIsAvailable()) {
           this.isDirty = true;
           this.isOccupied = true;
           System.out.println("You are checked in!");
       }
        System.out.println("There is not a room available.");
    }
    public void cleanRoom(){
       if(this.isOccupied && this.isDirty) {
           this.isDirty = false;
           System.out.println("Room is being cleaned!");
       }
    }
    public void checkedOut(){
       if(this.isOccupied) {
           cleanRoom();
           this.isOccupied = false;
           System.out.println("The guest is checked out of room!");
       }
    }



}
