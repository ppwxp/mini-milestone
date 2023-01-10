package org.example.employee.pilot;

import org.example.employee.Employee;

import java.util.Random;

public class Pilot extends Employee {
    Random random = new Random();
    private int timeToReciveCompass = 1000;

    public int getPilotTime() {
        return pilotTime;
    }

    private final int pilotTime = random.nextInt(5000);

    public boolean isCompassRecived(int time){
        if (time >= timeToReciveCompass){
            return true;
        }
        else{
            return false;
        }
    }





}
