public class Pengurangan extends Kalkulator{
    int pengurangan1, pengurangan2;

    public Pengurangan(int pengurangan1, int pengurangan2) {
        this.pengurangan1 = pengurangan1;
        this.pengurangan2 = pengurangan2;
    }

    @Override
    public void hitungKalkulator() {
        super.hitungKalkulator();
        System.out.println("Pengurangan : " + (this.pengurangan1 - this.pengurangan2));
    }
}
