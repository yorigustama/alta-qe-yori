// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int studentScore = 111;

        String nilaiHuruf ="";

        if (studentScore >= 80 && studentScore <= 100) {
            nilaiHuruf = "A";
        } else if (studentScore >=65 && studentScore <= 79) {
            nilaiHuruf = "B+";
        } else if (studentScore >=50 && studentScore <= 64) {
            nilaiHuruf = "B";
        } else if (studentScore >=35 && studentScore <= 49) {
            nilaiHuruf = "C";
        } else if (studentScore >=0 && studentScore <= 34) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "invalid";
        }

        System.out.println("Nilai hasil dari konversi angka ke huruf: "+ nilaiHuruf );
    }
}