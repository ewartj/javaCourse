package com.company;

import java.security.PublicKey;

public class Part3 {
    public boolean twoOccourences(String stringa, String stringb) {
        // counter idea from https://stackoverflow.com/questions/767759/occurrences-of-substring-in-a-string
        stringa = stringa.toLowerCase();
        stringb = stringb.toLowerCase();
        int lastIndex = 0;
        int count = 0;
        while (lastIndex != -1) {
            lastIndex = stringb.indexOf(stringa, lastIndex);
            if (lastIndex != -1) {
                count ++;
                lastIndex += stringa.length();
            }
        }
        if (count >= 2){
            return true;
        }
        return false;
    }

    public void testTwoOccourances() {
        System.out.println("ana and banana: " + twoOccourences("ana","banana"));
        System.out.println("zoo and forest: " + twoOccourences("zoo","forrest"));
        System.out.println("zoo and zoom: " + twoOccourences("zoo","zoom"));
    }

    public String lastPart (String stringa, String stringb) {
        stringa = stringa.toLowerCase();
        stringb = stringb.toLowerCase();
        // get the index of stringb
        int lastIndex = stringb.indexOf(stringa);
        if (lastIndex == -1) {
            return stringb;
        }
        else {
            String sunString = stringb.substring(lastIndex, stringb.length());
            return sunString;
        }
    }
    public void testLastPart() {
        System.out.println("ana and banana: " + lastPart("ana","banana"));
        System.out.println("zoo and forest: " + lastPart("zoo","forrest"));
        System.out.println("zoo and zoom: " + lastPart("zoo","zoom"));
    }
}
