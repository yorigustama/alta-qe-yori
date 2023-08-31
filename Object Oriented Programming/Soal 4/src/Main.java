import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Panjang Barang : ");
        double panjang = input.nextDouble();

        System.out.println("Lebar Barang : ");
        double lebar = input.nextDouble();

        System.out.println("Tinggi Barang : ");
        double tinggi = input.nextDouble();

        System.out.println("Tinggi Barang : ");
        double berat = input.nextDouble();

        Pengiriman kirimbarang1 = new Pengiriman(panjang, lebar, tinggi, berat);
        double totalharga = kirimbarang1.hitungBiaya();

        System.out.println("Total Pengiriman : " + totalharga);


    }
}