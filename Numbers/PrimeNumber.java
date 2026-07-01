
import java.util.Scanner;
import java.util.Scanner;

class PrimeNumber {

    public sner sc = new Scanner(System.in);

    

    atic void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = true;

        if (n <= 1) {
            prime = false; 
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if (prime) {
            System.out.println("Prime number"); 
        } else {
            System.out.println("Not prime number");
        }

    }
}
