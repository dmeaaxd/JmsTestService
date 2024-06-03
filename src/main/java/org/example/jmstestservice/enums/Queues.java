package org.example.jmstestservice.enums;

public enum Queues {

    NOTIFICATIONS,
    PAYMENTS,
    SUBSCRIPTIONS;

    public static String toString(Queues queues) {
        switch (queues){
            case NOTIFICATIONS -> {
                return "Notifications";
            }
            case PAYMENTS -> {
                return "Payments";
            }
            case SUBSCRIPTIONS -> {
                return "Subscriptions";
            }
        }
        return null;
    }
}
