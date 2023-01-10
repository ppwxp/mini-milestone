package org.example;

import org.example.employee.Employee;
import org.example.employee.FlightAttendants;
import org.example.employee.pilot.Pilot;

import java.util.ArrayList;
import java.util.Objects;

public class Main {



    public static void main(String[] args) {
        Pilot pilot = new Pilot();
        Pilot coPilot = new Pilot();
        Flight flight = new Flight();

//        FlightAttendants flight = new FlightAttendants();
//        String flightLanguage = flight.getFlightLanguage();
        ArrayList<FlightAttendants> employees = flight.hireEmployees();
        flight.isAbleToFly(employees);




//        if(Objects.equals(flightLanguage, flightAttendants.get(0).getLanguage(), flightAttendants.get(1).getLanguage(), flightAttendants.get(2).getLanguage()))
//        System.out.println(pilot.isCompassRecived(pilot.getPilotTime()) + " " + coPilot.isCompassRecived(pilot.getPilotTime()));
//        System.out.println(flightAttendants.get(0).getLanguage() + flightAttendants.get(1).getLanguage() + flightAttendants.get(2).getLanguage());

    }

}

