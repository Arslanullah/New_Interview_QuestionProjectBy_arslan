package Package2;

public class Primenumber4 {
    public static void main(String[] args) {
        boolean result = primenumbers(11);
        System.out.println(result);
    }

    public static boolean primenumbers(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 0; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
            return true;
        }

        return false;
    }
}