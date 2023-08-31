// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Balok balok1 = new Balok(3,3,3);
        balok1.hitungVolumeBalok();
        System.out.println("Volume Balok : " + balok1.hitungVolumeBalok());

        Kubus kubus1 = new Kubus(1);
        kubus1.hitungVolumeKubus();
        System.out.println("Volume Kubus : " + kubus1.hitungVolumeKubus());

        Tabung tabung1 = new Tabung(2,3);
        tabung1.hitungVolumeTabung();
        System.out.println("Volume Tabung : " +tabung1.hitungVolumeTabung());
    }
}