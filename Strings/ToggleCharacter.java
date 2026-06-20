
import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str =sc.nextLine();
       String res="";
      for(char ch:str.toCharArray()){
         if(Character.isUpperCase(ch)){
             res += Character.toLowerCase(ch);
         }
         else{
             res += Character.toUpperCase(ch);
         }
      }
      System.out.println(res);
    }
}