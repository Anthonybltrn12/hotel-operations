package com.pluralsight;

import java.time.LocalTime;

public class App {

    public static void main(String[] args) {
        Employee Chris = new Employee(123,"Chris","SOftware", 25.00, 0);
        Hotel hotel = new Hotel("Omni",10,20);
        hotel.bookRoom(3,true);
        hotel.bookRoom(2,false);

        System.out.println("There are " + hotel.getAvailableSuites() + " rooms left.");
        System.out.println(hotel.getAvailableRooms());

    }
}
