package com.company;

public class W3_4 {
    // what is your name (in terms of rank) this year
    // need name, sex, year
    // file ordered by popularity
    // girls and then male
    // need FileResource
    // fr.getCSVParser(faklse); - as there is no header
    // String name = rec.get(0);
    // String gender = rec.get(1);
    public void printNames () {
        FileResource fr = new FileResource();
        for (CSVRecord rec : fr.getCSVParser(false)) {
            int numBorn = Intiger.parseInt(rec.get(2));
            if (numBorn < 100) {
                System.out.println("Name " + rec.get(0) +
                        "Gender " + rec.get(1) +
                        "Num Born " + rec.get(3));
            }
        }
    }
    public void totalBirths (FileResource fr) {
        int totalBirths = 0;
        int totalBoys = 0;
        int totalGirls = 0;
        for (CSVRecord rec : fr.getCSVParser(false)){
            int numBorn = Integer.parseInt(rec.get(2));
            totalBirths += numBorn;
            if (rec.get(1).equals("M")) {
                totalBoys += numBorn;
            }
            if (rec.get(1).equals("F")) {
                totalGirls += numBorn;
            }
        }
        System.out.println("Total Births =" + totalBirths);
        System.out.println("Total Boys =" + totalBoys);
        System.out.println("Total Girlss =" + totalGirls);
    }
}
