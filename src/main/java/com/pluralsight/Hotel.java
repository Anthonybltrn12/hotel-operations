package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedRooms;
    private int bookedSuites;


    public Hotel(String name, int numberOfSuites, int numberOfRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedRooms = bookedRooms;
    }

    public boolean bookRoom(int numOfRooms, boolean isSuite){
        if(isSuite){
            if(this.numberOfSuites >= numOfRooms) {
                bookedSuites += numOfRooms;
                return true;

            }else{
                return false;
            }
        }else{
            if(this.numberOfRooms >= numOfRooms){
                bookedRooms += numOfRooms;
                return true;
            }else{
                return false;
            }
        }
    }

    public int getBookedRooms() {
        return bookedRooms;
    }

    public int getAvailableRooms(){

        return this.numberOfRooms - this.bookedRooms;

    }
    public int getAvailableSuites(){
        return this.numberOfSuites - this.bookedSuites;
    }

}
