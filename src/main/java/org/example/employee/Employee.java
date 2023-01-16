package org.example.employee;

import java.text.SimpleDateFormat;

public abstract class Employee {
    private String name;
    private SimpleDateFormat date;

    protected Employee(String name, SimpleDateFormat date) {
        this.name = name;
        this.date = date;
    }

    public String getName(){
        return name;
    }
    public SimpleDateFormat getBirthDate(){
        return date;
    }
}


