import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        //decimalToAnyBase
        System.out.println(decimalToAnyBase(19,2));  //Binary
        System.out.println(decimalToAnyBase(19,8));  //Octal
        System.out.println(decimalToAnyBase(19,16)); //Hexa
        
        System.out.println("\n------\n");
        //binaryToAnyBase
        System.out.println(binaryToAnyBase(10011,2)); //base 2
        System.out.println(binaryToAnyBase(101,8)); //base 8
        System.out.println(binaryToAnyBase(101,10)); //base 10
        System.out.println(binaryToAnyBase(101,16)); //base 16
        
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
    
    public static int binaryToAnyBase(int binaryNum, int base) {
       int result=0;
       int power=0;
       while(binaryNum>0){
           int rem= binaryNum%10;
           binaryNum= binaryNum/10;
           result+= rem * Math.pow(base,power);
           power++;
       }
       return result;
    }
    
}
