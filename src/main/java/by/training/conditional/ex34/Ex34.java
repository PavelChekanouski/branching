package by.training.conditional.ex34;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Ex34 {
    public static void main( String[] args ) {
        ArrayList<Book> arcive = new ArrayList<>();
        while (true) {
            try {
                Scanner scn = new Scanner(System.in);

                System.out.println("Enter deposited amount \n" + "(Enter 0 to exit)");
                double depositedMoney = scn.nextDouble();

                if (depositedMoney == 0) break;//exit

                arcive.add(new Book("Odyssey", 125.0));
                //arcive.add(new Book("The Lord of the Rings", 255.5)); Another example

                double price = arcive.get(0).getPrice();
                if(price == depositedMoney) {
                    System.out.println("Thank you.");
                }

                if (depositedMoney < price){
                    System.out.println("Not enough money, please add: " + (price-depositedMoney));
                }
                else System.out.println("Take the change please: " + (depositedMoney - price));

            }
            catch (InputMismatchException e) {
                System.out.println("Please, enter valid data.");
            }
        }
    }
}
