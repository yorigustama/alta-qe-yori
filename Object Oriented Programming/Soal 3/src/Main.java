import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Penjumlahan penjumlahan1 = new Penjumlahan(10, 10);
        penjumlahan1.hitungKalkulator();

        Pengurangan pengurangan1 = new Pengurangan(11, 10);
        pengurangan1.hitungKalkulator();

        Perkalian perkalian1 = new Perkalian(5, 5);
        perkalian1.hitungKalkulator();

        Pembagian pembagian1 = new Pembagian(5, 5);
        pembagian1.hitungKalkulator();


    }
}