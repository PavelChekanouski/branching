package by.training.conditional.ex7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * There is a polinomial: ax^2+bx+c;
 *
 */
public class Ex7
{
    public static void main( String[] args ){
        while (true) {
            try {
                Scanner scn = new Scanner(System.in);
                System.out.println("Enter coefficient a:");
                double a = scn.nextDouble();

                System.out.println("Enter coefficient b:");
                double b = scn.nextDouble();

                System.out.println("Enter coefficient c:");
                double c = scn.nextDouble();

                System.out.println("Enter x: ");
                double x = scn.nextDouble();

                System.out.println("Result: " + (a*x*x+ b*x + c));

            } catch (InputMismatchException e) {
                System.out.println("Please, enter valid data.");
            }
        }
    }
}

