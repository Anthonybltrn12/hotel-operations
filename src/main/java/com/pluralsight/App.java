package com.pluralsight;

import java.time.LocalTime;

public class App {

    public static void main(String[] args) {
        Employee Chris = new Employee(123,"Chris","SOftware", 25.00, 0);
        Hotel hotel = new Hotel("Omni",10,20);
        hotel.bookRoom(1,false);

        System.out.println("There are" + hotel.getAvailableRooms() + " number of rooms left.");

    }
}
