import java.util.Scanner;

public class Grade {
    // Method to convert letter grade to numeric grade
public static int getNumericGrade(char grade) {
        switch (Character.toUpperCase(grade)) {
            case 'A': return 90;
            case 'B': return 80;
            case 'C': return 70;
            case 'D': return 60;
            case 'F': return 50;
            default: return -1; // invalid grade
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char repeat;

        do { //Ask for letter grade
            System.out.print("Enter a letter grade (A-F): ");
            char grade = input.next().charAt(0);

            int numeric = getNumericGrade(grade);
            if (numeric != -1) {
                System.out.println("Numeric grade: " + numeric);
            } else {
                System.out.println("Invalid grade entered.");
            }

            System.out.print("Do you want to try again? (y/n): ");
            repeat = input.next().charAt(0);
            System.out.println();
        } while (Character.toLowerCase(repeat) == 'y');
        //Finish
        System.out.println("Bye!");
    }
}
