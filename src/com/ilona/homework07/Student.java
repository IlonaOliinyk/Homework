package com.ilona.homework07;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ilona on 08-Jun-17.
 */
public class Student {

    String name;
    String surname;
    Date dateOfCreation;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");


    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        dateOfCreation = new Date();
    }

    @Override
    public String toString() {
        //  return super.toString();
        return name + " " + surname + " " + dateFormat.format(dateOfCreation);
    }
}
