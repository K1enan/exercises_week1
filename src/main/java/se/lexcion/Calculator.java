package se.lexcion;

import java.util.Scanner;

public class Calculator {

  public static void ex6() {

        int calc;
        int num1;
        int num2;
        int result;
        Scanner reader = new Scanner(System.in);

        do {
            System.out.println("### Welcome in my first calc ###");
            System.out.println(" Enter your choice");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit ");
            calc = reader.nextInt();


            switch (calc) {
                case 1:
                    System.out.println("Enter the first number");
                    num1 = reader.nextInt();
                    System.out.println("Enter the second number");
                    num2 = reader.nextInt();
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + (result));
                    break;
                case 2:
                    System.out.println("Enter the first number");
                    num1 = reader.nextInt();
                    System.out.println("Enter the second number");
                    num2 = reader.nextInt();
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + (result));
                    break;
                case 3:
                    System.out.println("Enter the first number");
                    num1 = reader.nextInt();
                    System.out.println("Enter the second number");
                    num2 = reader.nextInt();
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + (result));
                    break;
                case 4:
                    System.out.println("Enter the first number");
                    num1 = reader.nextInt();
                    System.out.println("Enter the second number");
                    num2 = reader.nextInt();
                    result = num1 / num2;
                    System.out.println(num1 + " ÷ " + num2 + " = " + (result));
                    break;
                case 0:
                    break;

                default:
                    System.out.println("Invalid number \n");
            }
        }
        while (calc != 0);
        System.out.println("Good bay");
    }

}





