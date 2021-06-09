package com.company;

import java.awt.*;
import java.io.File;

public class numberDuke {
    import edu.duke.*;
import java.io.File;

    public class PerimeterAssignmentRunner {
        public double getPerimeter (Shape s) {
            // Start with totalPerim = 0
            double totalPerim = 0.0;
            // Start wth prevPt = the last point
            Point prevPt = s.getLastPoint();
            // For each point currPt in the shape,
            for (Point currPt : s.getPoints()) {
                // Find distance from prevPt point to currPt
                double currDist = prevPt.distance(currPt);
                // Update totalPerim by currDist
                totalPerim = totalPerim + currDist;
                // Update prevPt to be currPt
                prevPt = currPt;
            }
            // totalPerim is the answer
            return totalPerim;
        }

        public int getNumPoints (Shape s) {
            // set a variable for points
            int totalPoints = 0;
            // loop through the points
            for (Point currPt : s.getPoints()) {
                totalPoints ++;
            }
            return totalPoints;
        }

        public double getAverageLength(Shape s) {
            Shape s = new Shape(fr);
            //get length
            double length = getPerimeter(s);
            // get sides
            int points = getNumPoints(s);
            double averageLength = length / (double) points;
            return averageLength;
        }

        public double getLargestSide(Shape s) {
            // Variable for largest side
            double largestSide = 0.0;
            // Start wth prevPt = the last point
            Point prevPt = s.getLastPoint();
            // For each point currPt in the shape,
            for (Point currPt : s.getPoints()) {
                // Find distance from prevPt point to currPt
                double currDist = prevPt.distance(currPt);
                // if this is the largest size update the variable
                if (currDist > largestSide) {
                    largestSide = currDist;
                }
                // Update prevPt to be currPt
                prevPt = currPt;
            }
            return largestSide;
        }

        public double getLargestX(Shape s) {
            // get the number of sides
            double largestX = getNumPoints(s);
            // Start wth prevPt = the last point
            Point prevPt = s.getLastPoint();
            // Calculate the size of each side,
            for (Point currPt : s.getPoints()) {
                // Find distance from prevPt point to currPt
                double currDist = prevPt.distance(currPt);
                // if this is larger than the number of sizes update largestX
                if (currDist > largestX) {
                    largestX = currDist;
                }
                // Update prevPt to be currPt
                prevPt = currPt;
            }
            return largestX;
        }

        public double getLargestPerimeterMultipleFiles() {
            // Put code here
            // double largestPerimiter = 0.0;
            // load all files
            // loop through files and if its biggest so far update largestPerimiter
            double perimeter = 0.0;
            // load the files
            DirectoryResource dr = new DirectoryResource();
            //loop through files
            for (File f : dr.selectedFiles()) {
                FileResource fr = new FileResource(f);
                Shape s = new Shape(fr);
                double perimeterSize = getPerimeter(s);
                if (perimeterSize > perimeter) {
                    perimeter = perimeterSize;
                }
            }
            return perimeter;
        }

        public String getFileWithLargestPerimeter() {
            // Put code here
            File temp = null;    // replace this code
            // hold the file name in temp
            // llop though the files?
            // if a file has the largest value it becomes the temp
            // if that file name is the largest
            double perimeter = 0.0;
            // load the files
            DirectoryResource dr = new DirectoryResource();
            //loop through files
            for (File f : dr.selectedFiles()) {
                FileResource fr = new FileResource(f);
                Shape s = new Shape(fr);
                double perimeterSize = getPerimeter(s);
                if (perimeterSize > perimeter) {
                    perimeter = perimeterSize;
                    temp = f;
                }
            }
            return temp.getName();
        }

        public void testPerimeter () {
            FileResource fr = new FileResource();
            Shape s = new Shape(fr);
            double length = getPerimeter(s);
            int points = getNumPoints(s);
            double avg = getAverageLength(s);
            double largestSide = getLargestSide(s);
            double largestX = getLargestX(s);
            System.out.println("perimeter = " + length);
            System.out.println("points = " + points);
            System.out.println("longest length = " + largestSide);
            System.out.println("longest X = " + largestX);
        }

        public void testPerimeterMultipleFiles() {
            // Put code here
        }

        public void testFileWithLargestPerimeter() {
            String name = getFileWithLargestPerimeter();
            System.out.println("Largest file = " + name);
        }

        // This method creates a triangle that you can use to test your other methods
        public void triangle(){
            Shape triangle = new Shape();
            triangle.addPoint(new Point(0,0));
            triangle.addPoint(new Point(6,0));
            triangle.addPoint(new Point(3,6));
            for (Point p : triangle.getPoints()){
                System.out.println(p);
            }
            double peri = getPerimeter(triangle);
            System.out.println("perimeter = "+peri);
        }

        // This method prints names of all files in a chosen folder that you can use to test your other methods
        public void printFileNames() {
            DirectoryResource dr = new DirectoryResource();
            for (File f : dr.selectedFiles()) {
                System.out.println(f);
            }
        }

        public static void main (String[] args) {
            PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
            pr.testPerimeter();
        }
    }

}
