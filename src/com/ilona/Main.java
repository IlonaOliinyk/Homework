package com.ilona;

public class Main {

    public static void main(String[] args) {
        String testString = "My    name   is   \"Ilona\".";
        System.out.println(testString);
        System.out.println(Words.getWordsNumber(testString));

        System.out.println("Get word: " + Words.getWord(testString, 3));
    }
}
