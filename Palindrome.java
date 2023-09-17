import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		String input="mmkmm";
		boolean ans =palindromeCheck(input);
		System.out.println(ans);
	}
	private static boolean palindromeCheck(String name){
	    int st=0;
	    int end=name.length()-1;
	    while(st<=end){
	        if(name.charAt(st)!=name.charAt(end)){
	            return false;
	        }
	        st++;
	        end--;
	    }
	    return true;
	}
}
