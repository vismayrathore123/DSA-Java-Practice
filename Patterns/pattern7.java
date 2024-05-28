public class pattern7 {
    public static void main(String[] args) {
        // int rows = 5; // Number of rows in the pattern

        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >=5-(i-1); j--) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
