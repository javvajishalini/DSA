
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        char[] a = str1.toCharArray();
        Arrays.sort(a);
        System.out.println(new String(a));
    }
}
