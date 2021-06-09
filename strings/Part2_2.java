package com.company;

public class Part2_2 {
    public int howMany( String stringa, String stringb) {
        // Based on Part3 howMany
        // counter idea from https://stackoverflow.com/questions/767759/occurrences-of-substring-in-a-string
        stringa = stringa.toLowerCase();
        stringb = stringb.toLowerCase();
        if (stringa == "" || stringb == "") {
            return -1;
        }
        int lastIndex = 0;
        int count = 0;
        while (lastIndex != -1) {
            lastIndex = stringb.indexOf(stringa, lastIndex);
            if (lastIndex != -1) {
                count ++;
                lastIndex += stringa.length();
            }
        }
        return count;
    }
    public void testHowMany () {
        System.out.println("howMany(“GAA”, “ATGAACGAATTGAATC”). Expected 3: " + howMany("GAA", "ATGAACGAATTGAATC"));
        System.out.println("howMany(“AA”, “ATAAAA”) expected 2: " + howMany("AA", "ATAAAA"));
        System.out.println("howMany(e, sdhfslgdh); expected 0 got: " + howMany("e", "sdhfslgdh"));
        System.out.println("Empty, expected -1: " + howMany("",""));
    }
}
