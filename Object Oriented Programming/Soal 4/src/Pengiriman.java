public class Pengiriman extends Barang{
    public Pengiriman (double panjang, double lebar, double tinggi, double berat) {
        super(panjang, lebar, tinggi, berat);
    }

    public double hitungBiaya() {
        if (hitungVolume() < 50){
            System.out.println("Dimensi Barang Terlalu kecil");
            return 0;
        }
        return 5000 * hitungBeratBulat();
    }
}
