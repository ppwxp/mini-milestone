package org.example;

public class Main {


    public static void main(String[] args) {

        Flight flight = new Flight();

        if (flight.checkLanguage(flight.getFlightLanguage()) && flight.isCompassRecived()) {
            System.out.println("All good, we can start!");
        }else{
            System.out.println("Sorry, we can't start");
        }
    }
}

