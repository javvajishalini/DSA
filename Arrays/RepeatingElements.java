import java.util.*;
class RepeatingElements{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,4,4,5,5,2,2));
    HashSet<Integer> seen = new HashSet<>();
    HashSet<Integer> repeat = new HashSet<>();
    
    for(int num:arr){
        if(!seen.add(num))
         repeat.add(num);
    }
    System.out.println("Repeated:"+repeat);
        
}
}