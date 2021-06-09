package com.company;

public class  challenge2 {
    public  static  void  main(String[] args){
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your second final score is " + highScore);
        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your second final score is " + highScore);
        int highScorePos = calcPosition(1500);
        playerScore("Tim",highScorePos);
        highScorePos = calcPosition(900);
        playerScore("Tim2",highScorePos);
        highScorePos = calcPosition(400);
        playerScore("Tim3",highScorePos);
        highScorePos = calcPosition(50);
        playerScore("Tim4",highScorePos);
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        else {
            return  -1;
        }
    };

    public static void playerScore(String name, int calcPosition){
        System.out.println(name + ' ' + calcPosition);

    };
    public  static int calcPosition(int score){
        int position = 4;

        if(score >= 1000){
            position = 1;
        } else if(score >= 500) {
            position = 2;
        } else if(score >= 100) {
            position = 3;
        }
        return position;
        };
        public static long toMilesPerHour(double kilometerPerHour){
            if (kilometerPerHour > 0){
                kilometerPerHour = kilometerPerHour * 0.6214;
                return Math.round(kilometerPerHour);
            }
            else{
                kilometerPerHour = -1;
                return Math.round(kilometerPerHour);
            }
        }
        public static void printConversion(double kilometerPerHour){
            if (kilometerPerHour < 0){
                System.out.println("Invalid Value");
            }
            else{
                double converted = toMilesPerHour(kilometerPerHour);
                System.out.println((kilometerPerHour + " km/h = " + converted + " mi/h"));
            }
            System.out.println();
        }


    }
