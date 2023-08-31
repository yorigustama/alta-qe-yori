public class Barang {
    double panjang, lebar, tinggi, berat;

    public Barang(double panjang, double lebar, double tinggi, double berat) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public double hitungBeratBulat() {
        return Math.ceil(berat);
    }
}
