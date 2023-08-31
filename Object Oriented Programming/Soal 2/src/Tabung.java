public class Tabung {
    double jarijari, tinggi;

    public Tabung(double jarijari, double tinggi) {
        this.jarijari = jarijari;
        this.tinggi = tinggi;
    }

    public double hitungVolumeTabung() {
        return Math.PI * Math.pow(this.jarijari, 2) * this.tinggi;
    }
}
