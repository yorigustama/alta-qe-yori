import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input nilai alas : ");
        double alasInput = input.nextDouble();
        System.out.println("Input nilai tinggi : ");
        double tinggiInput = input.nextDouble();

        double luas = 0.5 * alasInput * tinggiInput;
        System.out.println("Hasil Luas Segitiga = " +luas );

    }
}