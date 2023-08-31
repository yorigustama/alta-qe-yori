public class Kubus {
    double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolumeKubus() {
        return Math.pow(this.sisi, 3);
    }
}
