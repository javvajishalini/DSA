
import java.util.*;
class SecondSmallest{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length");
    int n = sc.nextInt();
    ArrayList<Integer> arr = new ArrayList<>();
    System.out.println("Enter elemnt:");
    for(int i=0;i<n;i++){
        arr.add(sc.nextInt());
    }
    Collections.sort(arr);
    System.out.println("sorted:" +arr.get(1));
}
}