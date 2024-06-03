package org.example.jmstestservice.enums;

public class Queues {
    private String name;

    private Queues(String name) {
        this.name = name;
    }

    public static Queues NOTIFICATIONS = new Queues("Notifications");
    public static Queues PAYMENTS = new Queues("Payments");
    public static Queues SUBSCRIPTIONS = new Queues("Subscriptions");

}
