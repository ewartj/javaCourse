package com.company;

public class Part2 {
    public String findSimpleGene(String dna, String startCodon, String stopCodon) {
        String result = "";
        dna = dna.toUpperCase();
        int startIndex = dna.indexOf(startCodon);
        if (startIndex < 0) {
            System.out.println("No start codon");
            return "";
        }
        int stopIndex = dna.indexOf(stopCodon, startIndex + 3);
        if (stopIndex < 0) {
            System.out.println("No stop codon");
            return "";
        }
        result = dna.substring(startIndex, stopIndex + 3);
        int totalGeneLength = result.length() + 1;
        if (totalGeneLength % 3 != 0) {
            System.out.println("Invalid gene size");
            return "";
        }
        return result;
    }
    public void testSimpleGene () {
        String normalDNA = "AATGSYGFUASGTAA";
        String noStartCodon = "ASYGFUASGTAAA";
        String noStopCodon = "AATGSYGFUASG";
        String noStartOrStop = "GSYGFUASG";
        String invalidGeneLength = "AATGSYFUASGTAAA";
        System.out.println("Normal DNA: " + findSimpleGene(normalDNA, "ATG", "TAA"));
        System.out.println("No start codon: " + findSimpleGene(noStartCodon, "ATG", "TAA"));
        System.out.println("No stop codon: " + findSimpleGene(noStopCodon, "ATG", "TAA"));
        System.out.println("No start or stop sodon: " + findSimpleGene(normalDNA, "ATG", "TAA"));
        System.out.println("Incorrect length of DNA: " + findSimpleGene(normalDNA, "ATG", "TAA"));
    }
}
