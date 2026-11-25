package HOMEWORK;

import java.util.Scanner;

public class kilometers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = input.nextDouble();

        double meters = kilometers * 1_000;
        double centimeters = kilometers * 100_000;

        System.out.println(kilometers + " kilometers = " + meters + " meters");
        System.out.println(kilometers + " kilometers = " + centimeters + " centimeters");

        input.close();
    }
}
