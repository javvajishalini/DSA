// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class MaximumProductSubarray{
    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,3,-2,4));
    
    int maxProd = arr.get(0);
    int minProd = arr.get(0);
    int result = arr.get(0);
    
    for(int i=1;i<arr.size();i++){
       int curr = arr.get(i);
    
    
    if(curr<0){
        int temp = maxProd;
        maxProd = minProd;
        minProd = temp;

    }
    maxProd =Math.max(curr,maxProd*curr);
    minProd =Math.max(curr,minProd*curr);
    result=Math.max(result,maxProd);
    }
   System.out.println("Result:"+result);
    }
}