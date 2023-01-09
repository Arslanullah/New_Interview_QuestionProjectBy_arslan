package Package2;

public class prime_Number2 {
    /*
Prime number list
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
 */


        public static void main(String[] args) {
            boolean result = primeNumber(20);
            System.out.println(result);
        }

        public static boolean primeNumber(int n) {

            if (n <= 1) {
                return false;
            }
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
                return true;
            }
            return false;
        }

    }

