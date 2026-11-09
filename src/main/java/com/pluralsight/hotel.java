package com.pluralsight;

public class hotel {
    public static void main(String[] args) {
        Room firstRoom = new Room(2,20.00, true, false);
        System.out.println(firstRoom.getPrice());
    }
}
