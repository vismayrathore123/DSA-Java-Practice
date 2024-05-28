package hundredproblems;

public class SubstringofString {

    public static void substring(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String result = str.substring(i, j);
                System.out.println(result);
            }
        }

    }

    public static void main(String[] args) {
        String str = "Vismay";
        // SubstringofString ans= new SubstringofString();
        SubstringofString.substring(str);
    }
}
