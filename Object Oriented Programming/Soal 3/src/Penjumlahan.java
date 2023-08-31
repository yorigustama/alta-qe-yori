public class Penjumlahan extends Kalkulator{
    int jumlah1, jumlah2;

    public Penjumlahan(int jumlah1, int jumlah2) {
        this.jumlah1 = jumlah1;
        this.jumlah2 = jumlah2;
    }

    @Override
    public void hitungKalkulator() {
        super.hitungKalkulator();
        System.out.println("Penjumlahan : "+ (this.jumlah1 + this.jumlah2));
    }
}
