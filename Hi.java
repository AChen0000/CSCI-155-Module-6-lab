import java.util.Scanner;

public class Hi {
    // Method to check the number and print a message
    public static void checkNumber(int num) {
        if (num % 5 == 0) {
            System.out.println("HiFive");
        } else if (num % 2 == 0) {
            System.out.println("HiEven");
        } else {
            System.out.println(num + " is neither divisible by 5 nor 2");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int repeat;

        do {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            checkNumber(num);

            System.out.print("Enter 0 to exit or any other number to try again: ");
            repeat = input.nextInt();
            System.out.println();
        } while (repeat != 0);

        System.out.println("Bye!");
    }
}
