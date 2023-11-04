package StringinJava;

import java.util.HashMap;
        import java.util.Map;

public class MaxOccurringCharacter {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char maxChar = findMaxOccurringCharacter(str);
        System.out.println("Maximum occurring character: " + maxChar);
    }

    public static char findMaxOccurringCharacter(String str) {
        // Create a map to store the frequency of each character
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Iterate through the characters in the string and update the frequency map
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) { // Consider only letters, you can modify this condition as needed
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
        }

        char maxChar = ' ';
        int maxCount = 0;

        // Find the character with the maximum frequency
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return maxChar;
    }
}

