package com.dreamcraft.events;

import java.util.Scanner;

public class WeddingEvent extends Event implements EventManagement {

    public WeddingEvent(String name, String date, int guests) {
        super(name, date, guests);
    }

    public void createEvent() {
        System.out.println("\n💍 Wedding Event Created");
        display();
    }

    public static WeddingEvent inputWedding() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Couple Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Wedding Date: ");
        String date = sc.nextLine();

        System.out.print("Enter Number of Guests: ");
        int guests = sc.nextInt();

        return new WeddingEvent(name, date, guests);
    }
}
