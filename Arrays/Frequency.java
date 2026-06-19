// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Frequency{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList(Arrays.asList(1,2,3,3,4,4,2));
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        
      
    }
      System.out.println(map);
}
}