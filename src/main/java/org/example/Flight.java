package org.example;

import org.example.employee.FlightAttendant;
import org.example.employee.Language;
import org.example.employee.pilot.Pilot;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Flight {
    private ArrayList<FlightAttendant> flightAttendants = new ArrayList<FlightAttendant>(3);
    FlightAttendant flight = new FlightAttendant();
    private Language flightLanguage = Language.getRandomLanguage();

    public Language getFlightLanguage() {
        return flightLanguage;
    }

    private ArrayList<Pilot> pilots = new ArrayList<>(2);

    public ArrayList<Pilot> getPilots() {
        Pilot pilot = new Pilot("Bob", new SimpleDateFormat("1977-01-05"));
        pilots.add(pilot);
        Pilot coPilot = new Pilot("Delta", new SimpleDateFormat("1979-04-05"));
        pilots.add(coPilot);
        return pilots;
    }

    public boolean isCompassRecived() {
        pilots = getPilots();
        for (Pilot pilot : pilots) {
            if (!pilot.isCompassRecived(pilot.getPilotTime())) {
                System.out.println("Pilot: " + pilot.getName() + " did not recived compass yet!");
                return false;
            }
        }
        System.out.println("Pilots rocived their compasses!");
        return true;
    }

    public ArrayList<FlightAttendant> getEmployees() {
        FlightAttendant maria = new FlightAttendant("Maria", new SimpleDateFormat("1992-02-03"));
        flightAttendants.add(maria);
        FlightAttendant mike = new FlightAttendant("Mike", new SimpleDateFormat("1966-03-04"));
        flightAttendants.add(mike);
        FlightAttendant peter = new FlightAttendant("Peter", new SimpleDateFormat("1968-06-01"));
        flightAttendants.add(peter);
        return flightAttendants;
    }

    public boolean checkLanguage(Language flightLanguage) {
        ArrayList<FlightAttendant> employees = getEmployees();

        for (FlightAttendant stew : employees) {
            if (stew.getLanguage() != flightLanguage) {
                System.out.println("Some employee dont speak in " + flightLanguage);
                return false;
            }
        }
        System.out.println("All stews speaks " + flightLanguage);
        return true;
    }
}


