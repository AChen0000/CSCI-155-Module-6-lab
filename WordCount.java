import java.util.Scanner;

public class WordCount {
    // Method to count words in a string
    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.trim().split("\\s+"); // split by spaces
        return words.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String repeat;

        do { // Ask for sentence
            System.out.print("Enter a sentence: ");
            String sentence = input.nextLine();

            int numWords = countWords(sentence);
            System.out.println("Number of words: " + numWords);
            // Ask for repeat
            System.out.print("Do you want to try again? (yes/no): ");
            repeat = input.nextLine();
            System.out.println();
        } while (repeat.equalsIgnoreCase("yes"));
        //Finish
        System.out.println("Bye!");
    }
}
