package com.dreamcraft.events;

import java.util.Scanner;

public class BirthdayEvent extends Event implements EventManagement {

    public BirthdayEvent(String name, String date, int guests) {
        super(name, date, guests);
    }

    public void createEvent() {
        System.out.println("\n🎂 Birthday Event Created");
        display();
    }

    public static BirthdayEvent inputBirthday() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Birthday Person Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Date: ");
        String date = sc.nextLine();

        System.out.print("Enter Number of Guests: ");
        int guests = sc.nextInt();

        return new BirthdayEvent(name, date, guests);
    }
}
