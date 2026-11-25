package HOMEWORK;

import java.util.Scanner;

public class percent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalMarks = 0;

        for (int subject = 1; subject <= 6; subject++) {
            System.out.print("Enter marks for subject " + subject + " (out of 100): ");
            totalMarks += input.nextDouble();
        }

        double percentage = (totalMarks / 600) * 100;

        System.out.println("Total marks: " + totalMarks + " out of 600");
        System.out.println("Percentage: " + percentage + "%");

        input.close();
    }
}
