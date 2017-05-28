package com.ilona.homework01;

public class Words {

    static int getWordsNumber(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    static String getWord(String text, int wordNumber){
        String[] words = text.split("\\s+");
        if (wordNumber < words.length){
            return words[wordNumber];
        }
        return "";
    }


    static int getNumber(String s) {
        int sum = 1;
        for (int i = 0; i < s.length();) {
            if (s.charAt(i) == ' ') {
                sum++;
                do {
                    i++;
                } while(s.charAt(i) != ' ');
                continue;
            }
            i++;
        }
        return sum;
    }
}
