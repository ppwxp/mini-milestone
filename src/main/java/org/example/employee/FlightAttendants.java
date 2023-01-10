package org.example.employee;

import java.util.ArrayList;
import java.util.Random;

public class FlightAttendants {
    Random random = new Random();
//    String[] languages = {"English", "German", "Spanish", "Polish"};
    private ArrayList<String> languages = new ArrayList<String>(4);
    public String getLanguage(){
        languages.add("English");
        languages.add("German");
        languages.add("Spanish");
        languages.add("Polish");
        return languages.get(random.nextInt(languages.size()));
    }
    public String getFlightLanguage(){
        return languages.get(random.nextInt(languages.size()));
    }


}
