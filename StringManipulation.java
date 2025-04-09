import java.util.Scanner;
 public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Length of the string: " + input.length());
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());
        String trimmedInput = input.trim();
        System.out.println("Trimmed string: " + trimmedInput);
        String replacedString = input.replace('a', 'o');
        System.out.println("Replaced string (replace 'a' with 'o'): " + replacedString);
        System.out.println("Enter a word to search in the string: ");
        String wordToSearch = scanner.nextLine();
        if (input.contains(wordToSearch)) {
            System.out.println("The string contains the word: " + wordToSearch);
        } else {
            System.out.println("The string does not contain the word: " + wordToSearch);
        }
        System.out.println("Enter another string to concatenate: ");
        String secondString = scanner.nextLine();
        String concatenatedString = input + " " + secondString;
        System.out.println("Concatenated string: " + concatenatedString);
        System.out.println("Substring (from index 2 to 5): " + input.substring(2, 5));    
    }}

