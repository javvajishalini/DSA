
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] words = str.split(" ");

        String result = "";

        for (String word : words) {
            if (word.length() == 1) {
                result += word.toUpperCase() + " ";
            } else {
                String newWord
                        = Character.toUpperCase(word.charAt(0))
                        + word.substring(1, word.length() - 1)
                        + Character.toUpperCase(word.charAt(word.length() - 1));

                result += newWord + " ";
            }
        }

        System.out.println(result);
    }
}
