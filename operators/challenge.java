package com.company;
/*Write a method swith parameter of type long named minutes.

The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.

If the parameter is less than 0, print text "Invalid Value".

Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.


EXAMPLES OF INPUT/OUTPUT:

* printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"

* printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"

* printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"


TIPS:

* Be extra careful about spaces in the printed message.

* Use the remainder operator

* 1 hour = 60 minutes

* 1 day = 24 hours

* 1 year = 365 days

NOTES

* The printYearsAndDays method needs to be defined as public static like we have been doing so far in the course.

* Do not add main method to solution code.

* The solution will not be accepted if there are extra spaces*/

public class challeng {
    public  static  void  main(String[] args) {
        /*System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(1800));*/
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-561600);
    };
        public static boolean isLeapYear(int year){
            if (year > 0 && year <= 9999 ){
                if ((year % 4 ==0) && (year % 400 == 0) && (year % 100 == 0)){
                return true;
                }
            }
            return false;
        };
    public static boolean areEqualByThreeDecimalPlaces(double decimal1 ,double decimal2 ){
        if ((int)(decimal1 * 1000)==(int)(decimal2*1000)){
            return true;
        }
        return false;
    };
    public static boolean hasTeen(int decimal1 ,int decimal2, int answer ){
        if ((decimal1 > 12 && decimal1 < 20)|| (decimal2 > 12 && decimal2 < 20) || (answer > 12 && answer < 20) ){
            return true;
        }
        return false;
    };

    public static String getDurationString(double mins, double secs){
        if ((mins >= 0) && (secs >=0 && secs <= 59)){
               double min = ((int) secs / 60) + mins;
               double hr = ((int) min / 60);
               double remainingMins = (int) hr % 60;
               double sec = ((int) min % 60) + secs;
               String hoursString = hr + "h";
               if (hr < 10){
                   hoursString = "0" + hoursString;
            }
            String minString = remainingMins + "m";
            if (remainingMins < 10){
                minString = "0" + minString;
            }
            String secString = sec + "s";
            if (sec < 10){
                secString = "0" + secString;
            }
               return hoursString + " " + minString + " " + secString;
        }
        return "Invalid value";
    };
    public static String getDurationString(double sec){
        if (sec <0){
            return "Invalid value";
        }
        double m = (int) sec / 60;
        double s = (int) sec % 60;
        System.out.println(m + " " + s);
        return getDurationString(m,s);
    }

    public static double area(double length){
        if (length >= 0){
            double area1 = length * length * Math.PI;
            return area1;
        }
        return -1;
    }
    public static double area(double length, double width){
        if ((length < 0) || (width < 0)){
            double area1 = length * width;
            return area1;
            }
        return -1;
        }
    public static void printYearsAndDays(long mins){
        if (mins < 0){
            System.out.println("Invalid Value");
        }
        else{
            long year = (int) mins / (60*24*365);
            long dayMin = (int) mins % (60*24*365);
            long day = (int) dayMin / (60*24);
            System.out.println(year + " y and " + day + " d");
        }
    }

};

