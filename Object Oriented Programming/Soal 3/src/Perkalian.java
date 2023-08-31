public class Perkalian extends Kalkulator {

    int perkalian1, perkalian2;

    public Perkalian(int perkalian1, int perkalian2) {
        this.perkalian1 = perkalian1;
        this.perkalian2 = perkalian2;
    }

    @Override
    public void hitungKalkulator() {
        super.hitungKalkulator();
        System.out.println("Perkalian : " + (this.perkalian1 * this.perkalian2));
    }
}
