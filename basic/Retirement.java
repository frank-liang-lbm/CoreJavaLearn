package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Retirement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How much money do you need to retire?");
        double goal=in.nextDouble();

        System.out.print("How much money will you contribute every year?");
        double payment = in.nextDouble();

        System.out.print("Interest rate in %:");
        double interestrate = in.nextDouble();

        double balance = 0;
        int years = 0;

        while(balance < goal)
        {
            balance+=payment;
            double interst = balance*interestrate/100;
            balance+=interst;
            years++;
        }
        System.out.println("You can retire in "+years+"years.");
    }
}
