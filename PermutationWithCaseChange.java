import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String input="ab";
		String output="";
		permutationWithCaseChange(input,output);
	}
	private static void permutationWithCaseChange(String input,String output){
	    
	    if(input.length()==0){
	        System.out.print(output+" ");
	        return;
	    }
	    char ch= input.charAt(0);
	    
	    //smalcase...
	    permutationWithCaseChange(input.substring(1),output+Character.toLowerCase(ch));
	    
	    //capital case...
	    permutationWithCaseChange(input.substring(1),output+Character.toUpperCase(ch));
	    
	    return;
	}
}
