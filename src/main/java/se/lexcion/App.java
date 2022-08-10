package se.lexcion;


import java.time.Year;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        Calculator.ex6();
        TimeConverter.ex7();
        Guess.ex8();


    }

    public static void ex1() {

        System.out.println("Hello" + "\nKenan!");
    }

    public static void ex2() {

        boolean loop = true;
        int choice;
        Scanner input = new Scanner(System.in);

        while (loop) {

            System.out.println("Enter a year: ");
            int year = input.nextInt();
            boolean leapYear = new GregorianCalendar().isLeapYear(year);

            if (leapYear == true)

                System.out.println("This is a leap year");
            else
                System.out.println("This is not a leap year");

            System.out.println("Enter 1 to continue or 0 to exit ");
            choice = input.nextInt();

            if (choice == 1)
                loop = true;
            else if (choice == 0)
                loop = false;
        }
        System.out.println("Good bay");
    }

    public static void ex3() {

        int numb1 = 2, numb2 = 1, result;
        System.out.println(numb1 + numb2);
        System.out.println(numb1 - numb2);
        System.out.println(numb1 * numb2);
        System.out.println(numb1 / numb2);
    }

    public static void ex4() {

        int numb1, numb2, numb3, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number ");
        numb1 = input.nextInt();
        System.out.println("Enter the second number ");
        numb2 = input.nextInt();
        System.out.println("Enter the third number ");
        numb3 = input.nextInt();
        result = (numb1 + numb2 + numb3) / 3;
        System.out.println("The average of these numbers " + "\n" + result);

    }

    public static void ex5() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String name = input.nextLine();
        System.out.println("Hello " + name + "!");
    }


}
