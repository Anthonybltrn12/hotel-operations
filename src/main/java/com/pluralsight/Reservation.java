package com.pluralsight;

public class Reservation {

    private String roomType;
    private int numOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numOfNights, boolean isWeekend){
        this.roomType = roomType;
        this.numOfNights = numOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(){
        this.roomType = roomType;
    }
    public double getPrice(){
        double roomRate = 0;
        switch (roomType){
            case "king":
                roomRate = 139.00;
                break;
            case "double":
                roomRate = 124.00;
                break;
        }
        return roomRate;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
    public double getReservationTotal(){
        double total = 0;
        total = getPrice() * getNumOfNights();
        return total;
    }
}
