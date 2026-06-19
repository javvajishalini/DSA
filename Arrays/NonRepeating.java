// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class NonRepeating{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,4,4,5,5,2,2));
   HashMap<Integer,Integer> map = new HashMap<>();
   for(int num:arr){
       map.put(num,map.getOrDefault(num,0)+1);
   }
   for(int key:map.keySet())
   if(map.get(key)==1){
       System.out.println(key+"");
   }
        
}
}