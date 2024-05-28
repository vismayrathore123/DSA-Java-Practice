public class Pattern11 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern

        for (int i = 2; i <= rows + 1; i++) {
            for (int j = i; j <= i + 3; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
