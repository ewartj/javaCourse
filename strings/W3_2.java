
/**
 * Write a description of W3_2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import org.apache.commons.csv.*;
import edu.duke.*;
import java.io.File;

public class W3_2 {
    public CSVParser tester() {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        return parser;
    }
    public CSVRecord coldestHourInFile (CSVParser parser){
        CSVRecord smallestSoFar = null;
        for (CSVRecord currentRow : parser) {
            smallestSoFar = getSmallestOfTwo(currentRow, smallestSoFar);
        }
        return smallestSoFar;
    }
    public CSVRecord coldestInManyDays() {
        CSVRecord smallestSoFar = null;
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            CSVRecord currentRow = hottestHourInFile(fr.getCSVParser());
            smallestSoFar = getSmallestOfTwo(currentRow, largestSoFar);
        }
        return  smallestSoFar;
    }
    public CSVRecord getSmallestOfTwo(CSVRecord currentRow, CSVRecord smallestSoFar) {
        if(smallestSoFar == null){
            smallestSoFar = currentRow;
        }
        else {
            double currentTemp = Double.parseDouble(currentRow.get("Temperature"));
            // filtering out unrecorded values
            if (currentTemp == -9999) {
                currentTemp = 9999;
            }
            double smallestTemp = Double.parseDouble(largestSoFar.get("Temperature"));
            if (currentTemp > smallestTemp) {
                smallestSoFar = currentRow;
            }
        }
        return smallestSoFar;
    }

    public void testColdestInDay() {
        CSVParser parser = tester();
        CSVRecord coldest = coldestHourInFile(parser);
        System.out.println("Coldtest temp was: " + smallest.get("Temperature") + " at " + smallest.get("TimeEST"));
    }
    public void testColdestInManyDays() {
        CSVRecord coldest = coldestInManyDays();
        System.out.println("Coldtest temp was: " + smallest.get("Temperature") + " at " + smallest.get("DateUTC"));
    }
}