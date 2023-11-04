package StringinJava;

import java.util.HashSet;
        import java.util.Set;

public class UniqueCharacters {
    public static boolean hasAllUniqueCharacters(String str) {
        // Create a HashSet to store characters seen so far
        Set<Character> characters = new HashSet<>();

        // Iterate through the string
        for (char c : str.toCharArray()) {
            // If the character is already in the HashSet, it's a duplicate
            if (characters.contains(c)) {
                return false;
            }

            // Otherwise, add the character to the HashSet
            characters.add(c);
        }

        // If we've iterated through the entire string without finding duplicates, it's unique
        return true;
    }

    public static void main(String[] args) {
        String input = "abcdefg"; // Replace with your string
        boolean isUnique = hasAllUniqueCharacters(input);

        if (isUnique) {
            System.out.println("The string contains all unique characters.");
        } else {
            System.out.println("The string does not contain all unique characters.");
        }
    }
}

