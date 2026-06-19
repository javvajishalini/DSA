// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class RemoveDuplicates{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(9,9,7,3));
        HashSet<Integer> set = new HashSet<>(arr);
        System.out.println(set);
}
}