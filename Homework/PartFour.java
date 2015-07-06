/**
 * Created by Izzie_Express on 7/1/2015.
 */

/*
    Tip calculator. As a programmer, you are asked to write a program
    to calculate the amount you should tip. In your program, you need
    to ask for the following information from the user:
       - Please enter the bill amount:
       - Please enter the tip percentage (15 by default, if empty):
    Your output should be as follows:
       - Tip amount: $15.23
       - Total amount (Bill + tip): $58.26
 */

import java.util.Scanner;

public class PartFour {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the bill amount: ");
        double billAmount = in.nextDouble();

        System.out.println("Please enter the tip percentage: ");
        double tipPercent = in.nextDouble();

        double tipAmount = billAmount * tipPercent * 0.01;
        double totalAmount = billAmount + tipAmount;

        System.out.format("Tip amount: $" + "%.2f", tipAmount);
        System.out.println();
        System.out.format("Total amount: $" + "%.2f", totalAmount);
    }
}