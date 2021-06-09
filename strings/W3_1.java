package com.company;

import org.apache.commons.csv.*;


public class W3_1 {
    public CSVParser tester() {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        return parser;
    }

    public void countryInfo  (CSVParser parser, String countryOfInterest) {
        // defined here to act as an indication if nothing is found
        String export = "";
        for(CSVRecord record : parser){
            String country = record.get("Country");
            if (country.contains(countryOfInterest)) {
                export = record.get("Exports");
                String value = record.get("Value (dollars)");
                System.out.println(countryOfInterest + " : " + export + " : " + value);
            }
        }
        if (export == "") {
            System.out.println(countryOfInterest + " : " + "NOT FOUND");
        }
    }
    public void listExportersTwoProducts(CSVParser parser, String exportItem1, String exportItem2){
        String country = "";
        for(CSVRecord record : parser){
            String export = record.get("Export");
            if (export.contains(exportItem1) && export.contains(exportItem2)) {
                country = record.get("Country");
                System.out.println(country);
            }
        }
        if (country == "") {
            System.out.println("NOT FOUND");
        }
    }
    public int numberOfExporters(CSVParser parser, String exportItem){
        int count = 0;
        for(CSVRecord record : parser){
            String export = record.get("Export");
            if (export.contains(exportItem)) {
                count ++;
            }
        }
        return count;
    }


    public void testCountryInfo() {
        // need to use the test csv not full
        CSVParser parser = tester();
        countryInfo(parser, "Germany");
        parser = tester();
        countryInfo(parser, "France");
        parser = tester();
        countryInfo(parser, "Malawi");
    }
    public void testListExportersTwoProducts() {
        // need to use the test csv not full
        CSVParser parser = tester();
        listExportersTwoProducts(parser, "gold", "diamonds");
        parser = tester();
        listExportersTwoProducts(parser, "France" , "Malawi");
    }
    public void testNumberOfExports() {
        CSVParser parser = tester();
        System.out.println("Gold export, expected 3 got: " + numberOfExports(parser, "gold"));
    }
}

