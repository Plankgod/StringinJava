package StringinJava;
import java.util.HashSet;

public class DuplicateCharactersRemoval {
    public static void main(String[] args) {
        String inputString = "programming";
        String resultString = removeDuplicates(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("String with Duplicates Removed: " + resultString);
    }

    public static String removeDuplicates(String input) {
        HashSet<Character> charSet = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (charSet.add(character)) {
                result.append(character);
            }
        }

        return result.toString();
    }
}
