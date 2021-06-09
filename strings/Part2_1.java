package com.company;

import javax.swing.table.TableRowSorter;

public class Part2_1 {
    // find ATG
    // give this a variable: startIndex
    // look for ATG curStop while (curStop = -1)
    //      curStop - startIndex
    //      if distance between start and tempStop % 3 = 0 store as a gene
    //      ELSE keep looping and find next TAA
    public String findGene(String dna, int startFrom){
        dna = dna.toUpperCase();
        int startIndex = dna.indexOf("ATG", startFrom);
        if (startIndex == -1) {
            return "";
        }
        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");
        // getting the smallest variable
        int minIndex = 0;
        if (taaIndex == -1 ||
                tgaIndex != -1 && tgaIndex < taaIndex) {
            minIndex = tgaIndex;
        }
        else {
            minIndex = taaIndex;
        };
        if (minIndex == -1 || tagIndex != -1 && tagIndex <  minIndex) {
            minIndex = tagIndex;
        }
        if (minIndex == -1) {
            return "";
        }
        return dna.substring(startIndex, minIndex +3);
//        int currIndex = dna.indexOf("TAA",startIndex + 3);
//        while (currIndex != -1) {
//            if ((currIndex - startIndex) % 3 == 0) {
//                return dna.substring(startIndex, currIndex + 3);
//            }
//            else {
//                currIndex = dna.indexOf("TAA", currIndex + 1);
//            }
//        }
//        return "";
    }
    public int findStopCodon (String dna, int startIndex, String stopCodon) {
        dna = dna.toUpperCase();
        int curIndex = dna.indexOf(stopCodon, startIndex + 3);
        while (curIndex != -1) {
            if ((curIndex - startIndex) % 3 ==0) {
                return curIndex;
            }
            else {
                curIndex = dna.indexOf(stopCodon, curIndex + 1);
            }
        }
        return -1;
    }
    public void printGenes (String dna) {
        int startIndex = 0;
        while (true) {
            String currentGene = findGene(dna, startIndex);
            if (currentGene.isEmpty()) {
                break;
            }
            System.out.println(currentGene);
            startIndex = dna.indexOf(currentGene, startIndex) +
                    currentGene.length();
        }
        // thing first gene
        // if no gene.isEmpty() found break, return -1;
        // then get the length of the gene and add that to the startIndex
        // save the gene in a variable/array?
        // look for the next gene
        // repeat until the end of the gene startGene = -1
    }
    public void testFindGene () {
//        String oneTAA = "AATGSYGFUASGTAA";
//        String twoTAA = "AATGATAASYGFUASGTAAA"; // TAA at start (2bp out) and end
//        String threeTAA = "AATGATAASTAAYGFUASGTAAA"; // TAA at start (2bp out), two more bp further on and end
//        String noTAA = "ATGGSYGFUASG";
//        System.out.println("Normal DNA: " + findGene(oneTAA));
//        System.out.println("No start codon: " + findGene(twoTAA));
//        System.out.println("No stop codon: " + findGene(threeTAA));
//        System.out.println("No start or stop sodon: " + findGene(noTAA));
        String dnaTAA = "ATGERRTAADRTTAGDFFTGA";
        String dnaTAG = "ATGERRTAGDRTTAGDFFTGA";
        String dnaTGA = "ATGERRTGADRTTAGDFFTGA";
        String noTAA = "ATGGSYGFUASG";
        System.out.println("Normal dna TAA: " + findGene(dnaTAA, 0));
        System.out.println("Normal dna TAG: " + findGene(dnaTAG, 0));
        System.out.println("Normal dna TGA: " + findGene(dnaTGA, 0));
        System.out.println("No TAA: " + findGene(noTAA, 0));
    }
    public  void testFindStopCodon() {
        //            0123456789012345
        String dna = "aefTAAdfjTAGvfsTGA";
        int oneTAA = findStopCodon(dna, 0, "TAA");
        int secondTAG = findStopCodon(dna,3, "TAG");
        int thirdTGA = findStopCodon(dna,6, "TGA");
        if (oneTAA != -1){
            System.out.println("TAA error -1 expected got: " + oneTAA);
        }
        if (secondTAG != -1) {
            System.out.println("TAG error -1 expected got: " + secondTAG);
        }
        if (thirdTGA != -1) {
            System.out.println(("TGA error expected -1 got: " + thirdTGA));
        }
    }
    public void testPrintGenes () {
        String dnaTwoGenes = "ATGERRTAADRTTAGDFFTGAADHASDATGBOOTAAGTGA";
        String dnaOneGene = "ATGERRTAADRTTAGDFFTGA";
        String lowercaseDnaOneGene = "atgERRTAADRTTAGDFFtaa";
        System.out.println("One gene:");
        printGenes(dnaOneGene);
        System.out.println("Two genes:");
        printGenes(dnaTwoGenes);
        System.out.println("Lower Case");
        printGenes(lowercaseDnaOneGene);
        System.out.println("No genes:");
        printGenes("");
    }
}
