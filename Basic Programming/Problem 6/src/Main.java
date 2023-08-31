// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static void drawXYZ(int n) {
        for (int i = 1; i <= n; i++) {
            for (int z = 1; z <= n; z++) {
                if ((i + z) % 3 == 0) {
                    System.out.print("X ");
                } else if ((i + z) % 2 == 0) {
                    System.out.print("Z ");
                } else {
                    System.out.print("Y ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawXYZ(3);
    }
}
