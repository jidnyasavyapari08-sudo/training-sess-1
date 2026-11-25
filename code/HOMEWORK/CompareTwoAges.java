package HOMEWORK;

import java.util.Scanner;

public class CompareTwoAges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first age: ");
        int firstAge = input.nextInt();

        System.out.print("Enter the second age: ");
        int secondAge = input.nextInt();

        System.out.println("Is the first age greater? " + (firstAge > secondAge));
        System.out.println("Is the first age smaller? " + (firstAge < secondAge));
        System.out.println("Are the ages equal? " + (firstAge == secondAge));

        input.close();
    }
}
