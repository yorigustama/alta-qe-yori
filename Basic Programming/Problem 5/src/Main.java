// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        private static boolean palindrome(String value) {
            String reversed = new StringBuilder(value).reverse().toString();
            return value.equals(reversed);
        }

        public static void main(String[] args) {
            System.out.println(palindrome("yori")); // true or false
        }
}
