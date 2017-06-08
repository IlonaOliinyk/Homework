package com.ilona.homework07;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random1 = new Random();
        Student student1 = new Student("Name" + random1.nextInt(50), "Oliinyk");
        Student student2 = new Student("Name" + random1.nextInt(50), "Oliinyk");
        Student student3 = new Student("Name" + random1.nextInt(50), "Oliinyk");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        for(int i = 0; i < 2; i++){
            Student student4 = new Student("Name" + random1.nextInt(), "Surname" + random1.nextInt());
            System.out.println(student4);

        }

        System.out.println(String.format("My name is %s", "IO" + random1.nextInt()));


    }
}
