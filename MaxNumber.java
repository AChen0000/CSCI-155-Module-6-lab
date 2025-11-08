import java.util.Scanner;

public class MaxNumber {
    // Method to find the larger of two numbers
    public static int max(int num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    // Method to find the largest of four numbers using the first method
    public static int max(int num1, int num2, int num3, int num4) {
        int bigger1 = max(num1, num2);   // uses max with 2 parameters
        int bigger2 = max(num3, num4);   // uses max with 2 parameters
        return max(bigger1, bigger2);    // uses max with 2 parameters again
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int repeat;

        do {
            // Ask for four numbers
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter second number: ");
            int num2 = input.nextInt();

            System.out.print("Enter third number: ");
            int num3 = input.nextInt();

            System.out.print("Enter fourth number: ");
            int num4 = input.nextInt();

            // Call the max method and print the result
            int largest = max(num1, num2, num3, num4);
            System.out.println("\nThe largest number is: " + largest);

            // Ask to repeat or exit
            System.out.print("\nEnter 0 to exit or any other number to try again: ");
            repeat = input.nextInt();
            System.out.println();

        } while (repeat != 0);

        // Goodbye message
        System.out.println("Bye!");
    }
}
