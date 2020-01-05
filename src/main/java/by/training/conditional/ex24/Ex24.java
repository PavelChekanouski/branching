package by.training.conditional.ex24;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex24 {
    public static void main( String[] args ) {
        while (true) {
            try {
                Scanner scn = new Scanner(System.in);

                System.out.println("Enter number of petals: \n" + "(Enter 0 to exit)");
                double n = scn.nextDouble();

                if(n == 0) break;//exit

                if(n%2 == 1) {
                    System.out.println("Loves ");
                }
                else System.out.println("Doesn't love");


            } catch (InputMismatchException e) {
                System.out.println("Please, enter valid data.");
            }

        }
    }
}
