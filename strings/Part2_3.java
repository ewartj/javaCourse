package com.company;

public class Part2_3 {
    Part2_1 part2_1 = new Part2_1();
    public int howManyGenes (String dna) {
        int startIndex = 0;
        int count = 0;
        if (dna == ""){
            return -1;
        }
        while (true) {
            String currentGene = part2_1.findGene(dna, startIndex);
            if (currentGene.isEmpty()) {
                break;
            }
            count ++;
            startIndex = dna.indexOf(currentGene, startIndex) +
                    currentGene.length();
        }
        return count;
    }
    public void testHowManyGenes () {
        String dnaTwoGenes = "ATGERRTAADRTTAGDFFTGAADHASDATGBOOTAAGTGA";
        String dnaOneGene = "ATGERRTAADRTTAGDFFTGA";
        String lowercaseDnaOneGene = "atgERRTAADRTTAGDFFtaa";
        String noGenes = "asusfjskhg";
        String empty = "";
        System.out.println("One gene expected got: " + howManyGenes(dnaOneGene));
        System.out.println("Two genes expected got: " + howManyGenes(dnaTwoGenes));
        System.out.println("Lowercase one gene expected got: " + howManyGenes(lowercaseDnaOneGene));
        System.out.println("No genes expected got: " + howManyGenes(noGenes));
        System.out.println("Empty -1 expected got: " + howManyGenes(empty));
    }
}
