package HOMEWORK;
import java.util.Scanner;

public class arithemetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double first = input.nextDouble();

        System.out.print("Enter the second number: ");
        double second = input.nextDouble();

        System.out.println("Addition (+): " + (first + second));
        System.out.println("Subtraction (-): " + (first - second));
        System.out.println("Multiplication (*): " + (first * second));

        if (second != 0) {
            System.out.println("Division (/): " + (first / second));
            System.out.println("Remainder (%): " + (first % second));
        } else {
            System.out.println("Division (/) and remainder (%) are undefined when the second number is 0.");
        }

        System.out.println("Unary plus (+first): " + (+first));
        System.out.println("Unary minus (-first): " + (-first));

        double value = first;
        System.out.println("Prefix increment (++value): " + (++value));

        value = first;
        System.out.println("Postfix increment (value++): " + (value++));
        System.out.println("Value after postfix increment: " + value);

        value = first;
        System.out.println("Prefix decrement (--value): " + (--value));

        value = first;
        System.out.println("Postfix decrement (value--): " + (value--));
        System.out.println("Value after postfix decrement: " + value);

        input.close();
    }
}
