
import java.util.*;
class Sum{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,20,30,40));
    int sum =0;
    for(int num:arr){
        sum +=num;
    }
    System.out.println("sum:" +sum);
}
}