
import java.util.*;
class OddEven{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,20,30,40));
   int odd =0 ;
   int even =0;
   for(int num:arr){
       if(num%2==0){
           even++;
       }
       else{
           odd++;
       }
   }
   System.out.println("Even" +even);
   System.out.println("Odd" +odd);
}
}