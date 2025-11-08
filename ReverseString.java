import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int repeat; //loop for repeat 

        // Welcome bar
        System.out.println("=====================================");
        System.out.println("     WELCOME TO THE STRING REVERSER  ");
        System.out.println("=====================================\n");

        do {
            // Ask the user to enter a string
            System.out.print("Enter a string: ");
            String text = input.nextLine();

            String reversed = "";

            System.out.println("\nReversing step-by-step:");
            // Loop through the string backwards
            for (int i = text.length() - 1; i >= 0; i--) {
                reversed += text.charAt(i);
                System.out.println("Adding '" + text.charAt(i) + "' → " + reversed);
            }

            // Display the reversed string
            System.out.println("\nReversed string: " + reversed);

            // Ask if the user wants to reverse another string
            System.out.print("\nEnter 0 to exit or any other number to try again: ");
            while (!input.hasNextInt()) { // Prevents errors if user types words
                System.out.print("Please enter a number (0 to exit): ");
                input.next(); 
            }
            repeat = input.nextInt();
            input.nextLine(); // clear the buffer
            System.out.println();

        } while (repeat != 0);

        // Goodbye bar
        System.out.println("=====================================");
        System.out.println("          THANK YOU! BYE!            ");
        System.out.println("=====================================");

        input.close();
    }
}
