import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string input
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // 1. Find the length of the string
        System.out.println("Length of the string: " + input.length());

        // 2. Convert the string to uppercase
        System.out.println("Uppercase: " + input.toUpperCase());

        // 3. Convert the string to lowercase
        System.out.println("Lowercase: " + input.toLowerCase());

        // 4. Trim whitespace from the string
        String trimmedInput = input.trim();
        System.out.println("Trimmed string: " + trimmedInput);

        // 5. Replace a character in the string (example: replace 'a' with 'o')
        String replacedString = input.replace('a', 'o');
        System.out.println("Replaced string (replace 'a' with 'o'): " + replacedString);

        // 6. Check if the string contains a specific word
        System.out.println("Enter a word to search in the string: ");
        String wordToSearch = scanner.nextLine();
        if (input.contains(wordToSearch)) {
            System.out.println("The string contains the word: " + wordToSearch);
        } else {
            System.out.println("The string does not contain the word: " + wordToSearch);
        }

        // 7. Concatenate two strings
        System.out.println("Enter another string to concatenate: ");
        String secondString = scanner.nextLine();
        String concatenatedString = input + " " + secondString;
        System.out.println("Concatenated string: " + concatenatedString);

        // 8. Get a substring of the string (example: from index 2 to 5)
        System.out.println("Substring (from index 2 to 5): " + input.substring(2, 5));

        
    }
}

