package com.company;

public class Part3_1 {
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
    public float cgRatio (String dna) {
        dna = dna.toLowerCase();
        if (dna.length() < 1) {
            return -1;
        }
        int c = (int) dna.chars().filter(ch -> ch == 'c').count();
        int g = (int) dna.chars().filter(ch -> ch == 'g').count();
        int t = (int) dna.chars().filter(ch -> ch == 't').count();
        int a = (int) dna.chars().filter(ch -> ch == 'a').count();
        float gcContent = (float) (g + c) / (float) dna.length();
        return gcContent;
    }

    public void testCgRatio() {
        String dna = "ATGCCATAG";
        System.out.println("Expected 0.4 got: " + cgRatio(dna));
        System.out.println("Expected -1 got: " + cgRatio(""));
    }
//    public StorageResource getAllGenes (String dna) {
//        StrorageResource geneList = new StrorageResource();
//        int startIndex = 0;
//        while (true) {
//            String currentGene = findGene(dna, startIndex);
//            if (currentGene.isEmpty()) {
//                break;
//            }
//            geneList.add(currentGene);
//            startIndex = dna.indexOf(currentGene, startIndex) +
//                    currentGene.length();
//        }
//        return geneList;
//    }

//    public void testGetAllGenes () {
//        String dnaTwoGenes = "ATGERRTAADRTTAGDFFTGAADHASDATGBOOTAAGTGA";
//        String dnaOneGene = "ATGERRTAADRTTAGDFFTGA";
//        String lowercaseDnaOneGene = "atgERRTAADRTTAGDFFtaa";
//
//        System.out.println("One gene: ");
//        StorageResource gene = getAllGenes(dnaOwoGenes);
//        for (String g: genes) {
//            System.out.println(s);
//        }
//        System.out.println("Two genes: ");
//        StorageResource gene = getAllGenes(dnaTwoGenes);
//        for (String g: genes) {
//            System.out.println(s);
//        }
//        System.out.println("Lower Case: ");
//        StorageResource gene = getAllGenes(lowercaseDnaOneGene);
//        for (String g: genes) {
//            System.out.println(s);
//        }
//        System.out.println("No genes: ");
//        StorageResource gene = getAllGenes("");
//        for (String g: genes) {
//            System.out.println(s);
//        }
//    }
}
