
import java.util.Scanner;

class PrimeNumbersRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int n = start; n <= end; n++) {
            if (n <= 1) {
                continue;
            }
            boolean prime = true;

            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println(n + " ");
            }
        }

    }
}
