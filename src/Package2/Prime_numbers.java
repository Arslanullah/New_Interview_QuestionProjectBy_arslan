package Package2;

public class Prime_numbers {

    /*
    Write a program to get Prime numbers
    i.e   2 , 3  5  ,7  ,11
     */

        public static void main(String[] args) {

            boolean result = checkPrime(11);
            System.out.println(result);

        }

        public static boolean checkPrime(int n) {
        /*
        If n is less than or / equals to 1  ,than return false
         n == 1 or less than or equals to 1 it means do false (print false)
         */

            if (n <= 1) {
                return false;
            }
        /*
        or when I is equals to ==2  and i is less than Math.sqrt (
         */


            for (int i = 2; i < Math.sqrt(n); i++) {
                // using math.sqrt is a square root

                if (n % i == 0) {
                    // if (n(11)%2 == equals 0  = 5.5 (actually) than if this condition true than                  //return false

                    return false;
                }  // otherwise return the value as true

                return true;


            }
            return false;
        }
    }



