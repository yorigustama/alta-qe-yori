// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    Persegi persegi1 = new Persegi(2);
    persegi1.hitungLuasPersegi();
    persegi1.hitungKelilingPersegi();
    System.out.println("Luas Persegi : " + persegi1.hitungLuasPersegi());
    System.out.println("Keliling Persegi : " +persegi1.hitungKelilingPersegi());

    PersegiPanjang persegiPanjang1 = new PersegiPanjang(2,3);
    persegiPanjang1.hitungLuasPersegiPanjang();
    persegiPanjang1.hitungKelilingPersegiPanjang();
    System.out.println("Luas Persegi Panjang : " + persegiPanjang1.hitungLuasPersegiPanjang());
    System.out.println("Luas Keliling Persegi Panjang : " + persegiPanjang1.hitungKelilingPersegiPanjang());

    Segitiga segitiga1 = new Segitiga(2, 4, 2,3,4);
    segitiga1.hitungLuasSegitiga();
    segitiga1.hitungKelilingSegitiga();
    System.out.println("Luas Segitiga : " + segitiga1.hitungLuasSegitiga());
    System.out.println("Keliling Segitiga : " + segitiga1.hitungKelilingSegitiga());


    }
}