
import java.util.Scanner;

class SumOfDigits {

    static int sumOfDigits(int n) {
        if (n < 0) {
            n = -n;
        }

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Sum of digits: " + sumOfDigits(n));

        sc.close();
    }
}
