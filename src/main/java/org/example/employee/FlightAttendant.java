package org.example.employee;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;

public class FlightAttendant {
//    Language language = new Language();
    String name;
    SimpleDateFormat birthDay;
    private Language language = Language.getRandomLanguage();

    public FlightAttendant(String name, SimpleDateFormat birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    Random random = new Random();
    private ArrayList<String> languages = new ArrayList<String>(4);

    public FlightAttendant() {

    }

    public Language getLanguage(){

        return language;
    }
//    public String getFlightLanguage(){
//        return languages.get(random.nextInt(languages.size()));
//    }


}
