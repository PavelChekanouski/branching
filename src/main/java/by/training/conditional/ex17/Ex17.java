package by.training.conditional.ex17;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * There are 2 numbers. m and n, if m equals n, m && n = 0; if it's bigger, then m && n = m; else m && n = n;
 *
 */

public class Ex17 {
    public static void main( String[] args ){
        while (true) {
            try {
                Scanner scn = new Scanner(System.in);
                System.out.println("Enter coefficient m:");
                double m = scn.nextDouble();

                System.out.println("Enter coefficient n:");
                double n = scn.nextDouble();

                System.out.println("Numbers: "+ m + ", " + n);
                if(m == n){
                    m = 0;
                    n = 0;
                }
                if(m > n){
                    n = m;
                }
                else m = n;

                System.out.println("Result: "+ m + ", " + n);

            } catch (InputMismatchException e) {
                System.out.println("Please, enter valid data.");
            }
        }
    }
}
