package com.dreamcraft.events;

public class Event {
    protected String name;
    protected String date;
    protected int guests;

    public Event(String name, String date, int guests) {
        this.name = name;
        this.date = date;
        this.guests = guests;
    }

    public void display() {
        System.out.println("Event Name : " + name);
        System.out.println("Event Date : " + date);
        System.out.println("Guests     : " + guests);
    }
}
