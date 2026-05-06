package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void room_should_be_available(){
        //arrange
        Room room = new Room(1,105,false,false);

        boolean expectedOutput = true;

        //act
        boolean actualOutput = room.getIsAvailable();

        //assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void room_should_be_dirty_and_occupied_after_check_in(){
        //arrange
        Room room = new Room(1,105,false,false);
        room.checkedIn();
        boolean expectedOutput = false;

         //act
        boolean actualOutput = room.getIsAvailable();

        //assert
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void room_should_not_be_availablefor_check_in(){
        //arrange
        Room room = new Room(1,105,true,true);
        room.checkedIn();
        boolean expectedOutput = false;

        //act
        boolean actualOutput = room.getIsAvailable();

        //arrange
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void room_should_be_available_after_check_out(){
        //arrange
        Room room = new Room(1,105,false,false);
        room.checkedIn();
        room.cleanRoom();
        room.checkedOut();
        boolean expectedOutput = true;

        //act
        boolean actualOutput = room.getIsAvailable();

        //assert
        assertEquals(expectedOutput, actualOutput);

    }

}