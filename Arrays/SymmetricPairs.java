import java.util.*;
class SymmetricPairs{
    public static void main(String[] args) {
       int[][] pairs ={
        {1,2},
        {3,4},
        {2,1},
        {5,6}
       };
       HashMap<Integer,Integer> map = new HashMap<>();
       
       for(int[] p:pairs){
           int first = p[0];
           int second  = p[1];
           
           if(map.containsKey(second) && map.get(second) == first){
               System.out.println("(" +second + ""+first+")");
       }
       map.put(first,second);
       }
        
    }
}