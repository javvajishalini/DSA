
import java.util.Scanner;

class PowerOfNumber {

    static long power(int base, int exp) {
        if (exp < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative");
        }
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();

        System.out.println(base + "^" + exp + " = " + power(base, exp));

        sc.close();
    }
}
