package com.company;

import edu.duke.*;
import java.util.*;
import com.google.common.collect.*;

public class CodonCount {
    HashMap<String, Integer> codonFreq;
    public CodonCount(){
        codonFreq = new HashMap<String, Integer>();
    }
    public void buildCodonMap(int start, String dna){
        dna.toLowerCase();
        codonLocation.clear();
        // substring dna
        String query = dna.substring(start, dna.length() - start);
        // clear map
        // make a list of codons
        String[] pieces = splitAfterNChars(3,dna);
        // make a map of codons base
        int count  = start;
        for (String w : pieces){
            w = w.toLowerCase();
            int location = dna.indexOf(w, count);
            if (codonFreq.keySet().contains(w)){
                if (codonFreq.keySet().contains(w)){
                    codonFreq.put(w,codonFreq.get(w) + 1); // increment total up 1
                }
                else {
                    codonFreq.put(w,1); // add it to the hash map and add 1
                }
            }
            count += 3;
        }
    }

    public String getMostCommonCodon(){
        int largest = 0;
        String largestCodon = "";
        for (String w : codonFreq.keySet()){
            int occourance = codonFreq.get(w);
            if (occourance > largest) {
                largest = occourance;
                largestCodon = w;
            }
        }
        return largestCodon;
    }

    public void printCodonCounts(int start, int end){
        for (String w : codonFreq.keySet()){
            int occourances = codonFreq.get(w);
            if (occourances > start && occourances < end) {
                System.out.println(occourances + "\t" + w);
            }
        }
    }

    private String[] splitAfterNChars(String word, int splitLen) {
        // https://stackoverflow.com/questions/2297347/splitting-a-string-at-every-n-th-character
        return word.split(String.format("(?<=\\G.{%1$d})", splitLen));
    }

}
