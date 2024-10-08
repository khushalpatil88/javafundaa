public class Pattern2 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print spaces in each row
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // Print stars in each row
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
