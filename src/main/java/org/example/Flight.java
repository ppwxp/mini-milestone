package org.example;

import org.example.employee.FlightAttendants;

import java.util.ArrayList;
import java.util.Objects;

public class Flight {
    private ArrayList<FlightAttendants> flightAttendants = new ArrayList<FlightAttendants>(3);
//    FlightAttendants flight = new FlightAttendants();
//    String flightLanguage = flight.getFlightLanguage();
    public ArrayList<FlightAttendants> hireEmployees(){
        for (int i = 0; i <= 3; i++){
            FlightAttendants flightAttendant = new FlightAttendants();
            flightAttendants.add(flightAttendant);
        }
        System.out.println(flightAttendants.get(0).getLanguage() + flightAttendants.get(1).getLanguage() + flightAttendants.get(2).getLanguage());
        return flightAttendants;
    }

    public void isAbleToFly(ArrayList<FlightAttendants> flightAttendants){
        int counter = 0;
        for (int i = 0; i <3; i++){
            if(Objects.equals(flightAttendants.get(i).getLanguage(), flightAttendants.get(i + 1).getLanguage())){
                counter++;
            }

        }
        System.out.println(counter);
//        if(flightAttendants.get(0).getLanguage() == flightAttendants.get(1).getLanguage(),){
//
//        }
//        System.out.println(pilot.isCompassRecived(pilot.getPilotTime()) + " " + coPilot.isCompassRecived(pilot.getPilotTime()));
//        System.out.println(flightAttendants.get(0).getLanguage() + flightAttendants.get(1).getLanguage() + flightAttendants.get(2).getLanguage());
    }

}
