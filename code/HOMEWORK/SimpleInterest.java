package HOMEWORK;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter annual rate of interest (%): ");
        double rate = input.nextDouble();

        System.out.print("Enter time in years: ");
        double time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple interest: " + simpleInterest);

        input.close();
    }
}
