public class Pembagian extends Kalkulator {
    double pembagian1, pembagian2;

    public Pembagian(double pembagian1, double pembagian2) {
        this.pembagian1 = pembagian1;
        this.pembagian2 = pembagian2;
    }

    @Override
    public void hitungKalkulator() {
        super.hitungKalkulator();
        System.out.println("Pembagian : "+ (this.pembagian1/this.pembagian2));
    }
}
