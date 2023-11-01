import java.util.*;

class Main {
  public static void main(String[] args) {
    String input="abcde";
    subsetPrint(input,"");
  }
  private static void subsetPrint(String input,String output){
      
      if(input.length()==0){
          System.out.print(output+ " ");
          return;
      }
        char temp=input.charAt(0);
        //taking..
        subsetPrint(input.substring(1),output+temp);
        //!taking..
        subsetPrint(input.substring(1),output);
        return;
      
    }
}
