import java.util.HashSet;

public class Check {
    public static boolean isPangram(String input) {
        // Create a HashSet to store unique characters
        HashSet<Character> charSet = new HashSet<>();

        // Convert the input to uppercase to make it case-insensitive
        String upperInput = input.toUpperCase();

        // Iterate through each character in the input
        for (int i = 0; i < upperInput.length(); i++) {
            char ch = upperInput.charAt(i);

            // Check if the character is an uppercase letter from 'A' to 'Z'
            if (ch >= 'A' && ch <= 'Z') {
                charSet.add(ch); // Add the character to the set
            }
        }

        // If the size of the set is 26, it contains all alphabets
        return charSet.size() == 26;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Change this to your input
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}

