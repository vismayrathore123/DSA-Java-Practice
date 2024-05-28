import java.util.Arrays;
public class Anagram {

    public boolean isAnagram(String str1, String str2){
        int len1 = str1.length();
        int len2 = str2.length();

        if (len1 != len2) {
            return false; // Lengths are different, can't be anagrams
        }

        // Convert strings to lowercase to ignore case sensitivity
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Convert strings to character arrays for easier comparison
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "Evision";
        String str2 = "noisivE";
        Anagram anagramChecker = new Anagram();
        boolean areAnagrams = anagramChecker.isAnagram(str1, str2);

        if (areAnagrams) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
