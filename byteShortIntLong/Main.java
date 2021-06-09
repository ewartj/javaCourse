package com.company;

import javax.print.DocFlavor;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	int myValue = 10000;

	int myMinIntValue = Integer.MIN_VALUE;
	int myMaxIntValue = Integer.MAX_VALUE;
	System.out.println("Ineger Minimum Value = " + myMinIntValue);
	System.out.println("Ineger Minimum Value = " + myMaxIntValue);
	System.out.println("Busted =" + (myMaxIntValue +1));

	byte myMinByte = Byte.MIN_VALUE;
	byte myMaxByte = Byte.MAX_VALUE;
	System.out.println("Byte min: " + myMinByte);
	System.out.println("Byte Max: " + myMaxByte);

	short myMinShort = Short.MIN_VALUE;
	long myMaxShort = Short.MAX_VALUE;
	System.out.println("Byte min: " + myMinShort);
	System.out.println("Byte Max: " + myMaxShort);

	long myLongValue = 100L;
	long myMinLong = Long.MIN_VALUE;
	long myMaxLong = Long.MAX_VALUE;
	System.out.println("Byte min: " + myMinLong);
	System.out.println("Byte Max: " + myMaxLong);
	byte myNewByteVal = (byte) (myMinByte / 2);
// My challenge:
	byte myByte = 12;
	short myShort = 150;
	int myint = 156464;
	long total = 50000L + 10L *
			(myByte + myint + myShort);
	System.out.println("Total: " + total);

	System.out.println("\n");
//lesson 2
	float myMinFloat = Float.MIN_VALUE;
	float myMaxFloat = Float.MAX_VALUE;
	System.out.println("Float min: " + myMinFloat);
	System.out.println("Float Max: " + myMaxFloat);

	double myMinDouble = Double.MIN_VALUE;
	double myMaxDouble = Double.MAX_VALUE;
	System.out.println("Double min: " + myMinDouble);
	System.out.println("Double Max: " + myMaxDouble);

	int myInt = 5/3;
	float myFloat = 5f/3f;
	double myDouble = 5d/3d;
	System.out.println("MyInt: " + myInt);
	System.out.println("MyDouble: " + myDouble);
	System.out.println("MyFloat: " + myFloat);

	double pounds = 200;
	double poundToKiloRatio = 0.45359237;
	double kilo = pounds * poundToKiloRatio;
	System.out.println("Pound to Kilo: " + kilo);

	System.out.print("\n");

	char UniCodecharescter = '\u5975';
	System.out.print(UniCodecharescter);

	System.out.print("\n");

	String myString = "Test";
	myString = myString + myInt;
	System.out.print("myString = " + myString);




    }
}
