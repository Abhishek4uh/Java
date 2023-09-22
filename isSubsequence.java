import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String s = "abc";
		String t = "ahbgdc";
		System.out.print(isSubSequence(s,t));
		
	}
	static boolean isSubSequence(String s, String t){
	    
	    int first=0;
	    int second=0;
	    while(first<s.length() && second<t.length()){
	        if(s.charAt(first)==t.charAt(second)){
	            first+=1;
	            second+=1;
	        }
	        else{
	            second+=1;
	        }
	    }
	    return first==s.length();
	}
}
