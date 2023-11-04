package StringinJava;

public class PangramChecker {

    public static boolean isPangram(String sentence) {
        // Create an array to keep track of whether each letter is present in the sentence
        boolean[] isLetterPresent = new boolean[26];

        // Convert the sentence to lowercase to handle both uppercase and lowercase letters
        sentence = sentence.toLowerCase();

        // Iterate through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') {
                // If the character is a letter, mark it as present in the array
                isLetterPresent[c - 'a'] = true;
            }
        }

        // Check if all letters from 'a' to 'z' are present
        for (int i = 0; i < 26; i++) {
            if (!isLetterPresent[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean result = isPangram(sentence);

        if (result) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
}

