import java.util.Scanner;

public class DecimalToBinary {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int repeat; //loop

        // Welcome bar
        System.out.println("=====================================");
        System.out.println("   WELCOME TO THE DECIMAL CONVERTER  ");
        System.out.println("=====================================\n");

        do {
            System.out.print("Enter a decimal number: ");
            int decimal = input.nextInt();

            if (decimal == 0) {
                System.out.println("Binary: 0");
            } else {
                int number = decimal;
                String binary = "";

                System.out.println("\nStep-by-step conversion:");

                // Convert decimal to binary
                while (number > 0) {
                    int remainder = number % 2; // find remainder
                    System.out.println(number + " / 2 = " + (number / 2) + " remainder " + remainder);
                    binary = remainder + binary; // add remainder to the front
                    number = number / 2; // divide number by 2
                }

                System.out.println("\nBinary result: " + binary);
            }

            // Ask user if repeat is wanted
            System.out.print("\nEnter 0 to exit or any other number to try again: ");
            repeat = input.nextInt();
            System.out.println();

        } while (repeat != 0); // loop ends when user enters 0

        // Goodbye bar
        System.out.println("=====================================");
        System.out.println("           THANK YOU! BYE!           ");
        System.out.println("=====================================");

        input.close();
    }
}
