
import java.util.*;
class LargestNumber{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length");
    int n = sc.nextInt();
    ArrayList<Integer> arr = new ArrayList<>();
    System.out.println("Enter elemnt:");
    for(int i=0;i<n;i++){
        arr.add(sc.nextInt());
    }
    int max = arr.get(0);
    for(int num: arr){
        if(num>max){
            max=num;
        }
    }
    System.out.println("Largesr:" +max);
}
}