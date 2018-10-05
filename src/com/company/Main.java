package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
//	Declare a Variable that will be used as a condition for the do loop
	String response="";

	do {
//Prompt the user for the number
        System.out.println("Enter a number");
        int number = sc.nextInt();
        sc.nextLine();
//Using a for loop starting from the number to one

        for (int i = number; i >= 1; i--) {
// if the number is not divisible by both 5 and 7 print the number
            if (((i % 5) != 0) && ((i % 7) != 0)) {
                System.out.println(i);
            }
// if the number is divisible by both 5 and 7 print "CopyCat"
            if (((i % 5) == 0) && ((i % 7) == 0)) {
                System.out.println("CopyCat");
            }
// if the number is divisible by 5 and not by 7 print "Copy"
            if (((i % 5) == 0) && ((i % 7) != 0)) {
                System.out.println("Copy");
            }
// if the number is divisible by 7 and not by 5 print "Cat"
            if ((i % 7) == 0 && (i % 5) != 0) {
                System.out.println("Cat");
            }

        }
//Ask the user if they want to continue
        System.out.println("Would you like to enter another number (y/n)");
        response=sc.nextLine();

    }while(response.equalsIgnoreCase("Y"));

    System.out.println("Thank you for Playing!");

    }
}
