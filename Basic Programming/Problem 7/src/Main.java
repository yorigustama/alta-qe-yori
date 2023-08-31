// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        private static float mean(float[] numbers) {

            float sum = 0;
            for (float num : numbers) {
                sum += num;
            }

            return sum / numbers.length;
        }

        public static void main(String[] args) {
            float[] nilai = new float[4];
            nilai[0] = 80;
            nilai[1] = 70;
            nilai[2] = 88;
            nilai[3] = 88;

            for (float nilaijumlah : nilai) {
                System.out.println(nilaijumlah);
            }

            System.out.println("Rata-rata: " + mean(nilai));
        }
}