
import java.util.Scanner;

class StrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), temp = n, sum = 0;

        while (temp > 0) {
            int d = temp % 10, f = 1;
            for (int i = 1; i <= d; i++) {
                f *= i;
            }
            sum += f;
            temp /= 10;
        }

        System.out.println(sum == n ? "Strong" : "Not Strong");
    }
}
