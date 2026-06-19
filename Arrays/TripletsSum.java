import java.util.*;
class TripletsSum{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,3,4));
       
       int target = 9;
       
       for(int i =0;i<arr.size()-2;i++){
           for(int j=i;j<arr.size()-1;j++){
               for(int k=j;k<arr.size();k++){
                   if(arr.get(i)+arr.get(j)+arr.get(k)==target){
                       System.out.println(arr.get(i)+""+arr.get(j)+""+arr.get(k));
                   }
               }
           }
       }
        
       
        
    }
}