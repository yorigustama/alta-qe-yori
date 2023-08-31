// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static boolean primeNumber (int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;


    }
    public static void main(String[] args) {
        System.out.println(primeNumber(2));

    }
}