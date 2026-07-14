
import java.util.Scanner;

class ReverseNumber {

    static int reverse(int n) {
        boolean isNegative = n < 0;
        if (isNegative) {
            n = -n;
        }

        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        return isNegative ? -rev : rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Reversed number: " + reverse(n));

        sc.close();
    }
}
