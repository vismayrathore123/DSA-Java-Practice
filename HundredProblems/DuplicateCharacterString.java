package hundredproblems;
import java.util.HashSet;

public class DuplicateCharacterString {
    public static boolean hasDuplicateCharacters(String str) {
        // Check if the input string is null or empty
        if (str == null || str.isEmpty()) {
            return false;
        }

        HashSet<Character> characters = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // If the character is already in the set, it's a duplicate
            if (characters.contains(c)) {
                return true;
            }
            characters.add(c);
        }

        // No duplicate characters found
        return false;
    }

    public static void main(String[] args) {
        String str = "Evision";
        boolean hasDuplicates = hasDuplicateCharacters(str);
        System.out.println("Does the string have duplicate characters? " + hasDuplicates);
    }
}
