package se.lexcion;

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {


        int userInput;
        System.out.println("### Time Converter by Kenan Almousa ###\n");
        Scanner inPut = new Scanner(System.in);

        do {
            System.out.println("Enter your choice \n");
            System.out.println("1. Days converter ");
            System.out.println("2. Hours converter");
            System.out.println("3. Minutes converter");
            System.out.println("4. Seconds converter");
            System.out.println("0. Exit");
            userInput = inPut.nextInt();

            int daySum = userInput * 24;
            int hourSum = userInput * 24 * 60;
            int minSum = userInput * 24 * 60 * 60;
            int secSum = userInput * 60 * 60;

            switch (userInput) {

                case 1:
                    System.out.println("Enter the number of days ");
                    userInput = inPut.nextInt();
                    System.out.println("There is " + daySum + " hours, " + hourSum + " minutes, and " + minSum + " seconds in " + userInput + " days. ");
                    break;

                case 2:
                    System.out.println("Enter the number of hours ");
                    userInput = inPut.nextInt();
                    System.out.println("There is " + userInput * 60 + " minutes, and " + userInput * 60 * 60 + " in " + userInput + " hours.\n");
                    break;

                case 3:
                    System.out.println("Enter the number of minutes ");
                    userInput = inPut.nextInt();
                    System.out.println("There is " + userInput * 60 + " seconds in " + userInput + " minutes. \n");
                    break;

                case 4:
                    System.out.println("Enter the number of seconds ");
                    userInput = inPut.nextInt();
                    int a = userInput / 60 / 60;
                    int b = userInput / 60 / 24;
                    System.out.println("There is " + a + ":" + b + ":" + b + " in " + userInput);

                case 0:
                    break;

                default:
                    System.out.println("Invalid number");

            }

        }

        while (userInput != 0);
        System.out.println("Good bay");

    }
}
