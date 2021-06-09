package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        Day(-1);
//        printNumberInWord(-1);
//        printNumberInWord(50);
//        System.out.println(getDaysInMonth(1, 2020));
//        for(int i=0;i<6;i++) {
//            System.out.println("10,000 at " + i + "% interest " + String.format("%.2f", calcIntrest(10000, i)));
//        }
//        int count = 0;
//        for(int i=1;i < 1000; i++){
//            if(isPrime(i) == true){
//                count++;
//                System.out.println(i +" is Prime");
//                if(count == 100){
//                    break;
//                }
//            }
//        }
//        count = 0;
//        int sum = 0;
//        for(int i=1; 1 <= 1000; i++){
//            if ((i % 3 == 0) && (i % 5 == 0)){
//                count ++;
//                sum = sum + i;
//                System.out.println(sum);
//                if(count == 5){
//                    break;
//                }
//            }.
//        }
//        System.out.println(sumOdd(1,11));
//        int num = 4;
//        int fin = 200;
//        int evenCount = 0;
//        while(num <= fin){
//            num ++;
//            if(!isEvenNumber(num)){
//                continue;
//            }
//            evenCount++;
//            if(evenCount>5) {
//                break;
//            }   else {
//                System.out.println("Even Number:" + num);
//            }
//        }
//        numberToWords(123);
//        numberToWords(1010);
//        numberToWords(-1);
//        numberToWords(-10);
//        System.out.println(getLargestPrime(21));
        inputThenPrintSumAndAverage();
//        System.out.println(getLargestPrime(0));
//        System.out.println(getLargestPrime(45));
//        System.out.println(getLargestPrime(-5));

    }
    public static void printNumberInWord(int wholeNumber) {
            switch(wholeNumber) {
                case 0:
                    System.out.println("ZERO");
                    break;
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 7:
                    System.out.println("SEVEN");
                    break;
                case 8:
                    System.out.println("EIGHT");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;
                default:
                    System.out.println("OTHER");
                    break;
            }
        }
    public  static void Day(int day){
        if (day >= 0 || day < 7){
            switch (day){
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("W");
                    break;
                case 4:
                    System.out.println("Thr");
                    break;
                case 5:
                    System.out.println("f");
                    break;
                case 6:
                    System.out.println("sAT");
                    break;
                default:
                    System.out.println("iNVALID");
            }
        }
        else {
            System.out.println("Invalid2");
        }
    }
    public static boolean isLeapYear(int year){
        if (year > 0 && year <= 9999 ){
            if ((year % 4 ==0 && year % 100 != 0) || (year % 400 == 0) && (year % 100 == 0)){
                return true;
            }
        }
        return false;
    };
    public static int getDaysInMonth(int month, int year){
        if ((month >= 1 && month < 13) && (year >=1 && year <= 9999)) {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 4: case 6: case 9: case 11:
                    return 30;
                case 2:
                    if (isLeapYear(year)){
                        return 29;
                }   return 28;
                    }
            };
        return -1;};
    public static double calcIntrest(double amount, double rate){
        return (amount*(rate/100));
    }
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i <= (long) Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return  true;
    }
    public static boolean isOdd(int number){
        if(number > 0){
            if(number % 2 != 0){
                return true;
            }
        }
        return false;
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if (end < start || (start < 0 || end < 0)) {
            return -1;
        }
        else {
            for(int i = start; i <= end; i++){
                if(isOdd(i) == true){
                    sum +=i;
                }
            }
        }
        return sum;
    }
    public static boolean isEvenNumber(int numb){
        if((numb %  2) == 0){
            return true;
        } else {
            return false;
        }
    }
    public static int sumDigits(int numb){
        if(numb < 10){
            return -1;
        }
        int sum = 0;
        // 125 - 125 / 10 = 10 (its an int) * 10 = 120 125 - 120 = 5
        while (numb >0) {
            // extract least sig
            int digit = numb % 10;
            sum += digit;
            numb /= 10;
        }
        return sum;
    }
    public static boolean isPalindrome(int numb){
        if(numb < 10){
            return false;
        }
        int reverse = 0;
        int number = numb;
        int tot = 0;
        // 125 - 125 / 10 = 12 (its an int) * 10 = 120 125 - 120 = 5
        while (numb > 0 || 0 < numb) {
            // extract least sig
            int digit = numb % 10;
            reverse = reverse * 10;
            reverse += digit;
            numb /= 10;
        }
        return (number == reverse );
    }
    public static int sumFirstAndLastDigit(int numb){
        if(numb < 0){
            return -1;
        }
        int temp = numb;
        int last = 0;
        int tot = 0;
        int first = numb % 10;
        while (temp > 9) {
            // extract least sig
            temp /= 10;
        }
        if(numb < 10){
            return first + first;
        }
        return temp + first;
    }
    public static int getEvenDigitSum(int numb){
        if(numb < 0){
            return -1;
        }
        int temp = numb;
        int isEven;
        int score = 0;
        while (temp > 0) {
            // extract least sig
            isEven = temp % 10;
            if(isEven % 2 == 0){
                score += isEven;
            }
            temp /= 10;
        }
        return score;
    }
    public static boolean hasSharedDigit(int n1, int n2){
        if (n1 < 10 || n1 > 99 || n2 < 10 || n2 > 99){
            return false;
        }
        while (n1 > 0){
            int n2Temp = n2;
            while (n2Temp > 0){
                if (n1 % 10 == n2Temp % 10){
                    return true;
                }
                n2Temp /= 10;
            }
            n1 /= 10;
        }
        return false;
    }
    public static boolean hasSameLastDigit(int n1, int n2, int n3){
        if (n1 < 10 || n2 < 10 || n3 < 10 ||
                n1 > 1000 || n2 > 1000 || n3 > 1000){
            return false;
        }
        return ((n1%10==n2%10) || (n1%10==n3%10) || (n2%10==n3%10)
        );
    }
    public static boolean isValid(int numb){
        if(numb < 10 || numb > 1000){
            return false;
        } else
        return true;
    }
    public static int getGreatestCommonDivisor(int n1, int n2){
        int divisor = 0;
        if (n1 < 10 || n2 < 10){
            return -1;
        }
        for (int i = 1; i <= n1 /2; i++){
            if (n1 % i == 0 && n2 % i == 0){
                divisor = i;
            }
        }
        return divisor;
    }
    public static void printFactors(int n1){
        int divisor = 0;
        if (n1 < 0){
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= n1 ; i++){
            if (n1 % i == 0){
                System.out.println(i + " ");
            }
        }
    }
    public static boolean isPerfectNumber(int n1){
        int divisor = 0;
        if (n1 < 0){
            return false;
        }
        for (int i = 1; i <= n1 / 2 ; i++){
            if (n1 % i == 0){
                divisor += i;
            }
        }
        if (divisor != n1){
            return false;
        } else {
            return true;
        }
    }
    public static int getDigitCount(int numb){
        if(numb < 0){
            return -1;
        }
        int temp = numb;
        int count = 0;
        if(numb == 0){
            return 1;
        }
        while(temp > 0){
            count++;
            temp /= 10;
        }
        return count;
    }
    public static int reverse(int numb){
        int temp = numb;
        int reverse = 0;
        while (temp > 0 || temp < 0){
            int n = temp % 10;
            reverse = (reverse * 10) + n;
            temp /= 10;
        }
        return reverse;
    }
    public static void numberToWords (int numb){
        if(numb <0 ){
            System.out.println("Invalid Value");
        }
        if(numb == 0){
            System.out.println("Zero");
        }
        else {
            int numbRev = reverse(numb);
            int temp = numbRev;
            int forWords=reverse(numb);
            int reverseCount=getDigitCount(forWords);
            int numberCount=getDigitCount(numb);
            while (temp != 0){
                int i = temp % 10;
                switch(i) {
                    case 0:
                        System.out.println(" Zero");
                        break;
                    case 1:
                        System.out.println(" One");
                        break;
                    case 2:
                        System.out.println(" Two");
                        break;
                    case 3:
                        System.out.println(" Three");
                        break;
                    case 4:
                        System.out.println(" Four");
                        break;
                    case 5:
                        System.out.println(" Five");
                        break;
                    case 6:
                        System.out.println(" Six");
                        break;
                    case 7:
                        System.out.println(" Seven");
                        break;
                    case 8:
                        System.out.println(" Eight");
                        break;
                    case 9:
                        System.out.println(" Nine");
                        break;
                }
                temp /= 10;
            }
            if(reverseCount != numberCount){
                for(int i=reverseCount ; i<numberCount;i++){
                    System.out.print(" Zero");
                }
            }
        }

    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int sum = (bigCount * 5) + smallCount;
        if (sum >= goal && bigCount == 0) {
            return true;
        }
        else if (sum >= goal && smallCount == 0) {
            if (goal % 5 == 0 ) {
                return true;
            }
        }
        else if(sum >= goal &&  goal % 5 <=smallCount){
            return true;
        }
        return false;
    }
    public static void userNumbers(){
        Scanner scanner = new Scanner(System.in);
        int count = 0; // could use Intiger.Max isntead of the first flah
        int total = 0;
        int min = 0;
        int max = 0;
        boolean first = true;
        while (true){
            int order = count + 1;
            System.out.println("Enter number #" + order);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int numberInput = scanner.nextInt();
                if (first){
                    min = numberInput;
                    max = numberInput;
                    first = false;
                }
                if (numberInput < min){
                    max = numberInput;
                }
                if (numberInput > max){
                    max = numberInput;
                }
                count ++;
                total += numberInput;
                if (count == 10){
                    break;
                }
            }
            else {
                System.out.println("Not an intiger.");
            }
            scanner.nextLine();//handles enter
        }
        System.out.println("Sum = "+ total);
        System.out.println("Min = "+ min);
        System.out.println("Max = "+ max);
        scanner.close();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int count = 0; // could use Intiger.Max isntead of the first flah
        int total = 0;
        int mean = 0;
        boolean first = true;
        while (true){
//            int order = count + 1;
//            System.out.println("Enter number #" + order);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int numberInput = scanner.nextInt();
                count ++;
                total += numberInput;
                mean = Math.round((double)total / (double)count) ;
            }
            else {
                break;
            }
            scanner.nextLine();//handles enter
        }
        System.out.println("Sum = "+ total);
        System.out.println("Avg = "+ mean);
        scanner.close();
    }
}
//    Write a method named getLargestPrime with one parameter of type int named number.
//
//        If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
//
//
//        The method should calculate the largest prime factor of a given number and return it.
//
//
//        EXAMPLE INPUT/OUTPUT:
//
//        * getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
//
//        * getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
//
//        * getLargestPrime (0); should return -1 since 0 does not have any prime numbers
//
//        * getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
//
//        * getLargestPrime (-1); should return -1 since the parameter is negative
//
//
//        HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.
//
//        NOTE: The method getLargestPrime should be defined as public static like we have been doing so far in the course.
//
//        NOTE: Do not add a main method to the solution code.
