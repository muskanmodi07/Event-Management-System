package com.dreamcraft.events;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== EVENT MANAGEMENT SYSTEM ======");
            System.out.println("1. Birthday Event");
            System.out.println("2. Wedding Event");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    BirthdayEvent b = BirthdayEvent.inputBirthday();
                    b.createEvent();
                    break;

                case 2:
                    WeddingEvent w = WeddingEvent.inputWedding();
                    w.createEvent();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
