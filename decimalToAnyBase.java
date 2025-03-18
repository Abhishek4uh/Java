import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        System.out.println(decimalToAnyBase(19,2));  //Binary
        System.out.println(decimalToAnyBase(19,8));  //Octal
        System.out.println(decimalToAnyBase(19,16)); //Hexa
    }

    public static int decimalToAnyBase(int decimalNum, int base) {
       int result=0;
       int power=0;
       while(decimalNum>0){
           int rem= decimalNum%base;
           decimalNum= decimalNum/base;
           result+= rem * Math.pow(10,power);
           power++;
       }
       return result;
    }
}
