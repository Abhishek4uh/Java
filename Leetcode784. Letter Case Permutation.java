import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String s = "a1b2";
        //Output: ["a1b2","a1B2","A1b2","A1B2"]
        
        ArrayList<String> res= solve(s,"",new ArrayList<String>());
        System.out.println(res);
	}
	
	private static ArrayList<String> solve(String input,String output,ArrayList<String> result){
	    if(input.length()==0){
	        result.add(output);
	        return result;
	    }
	    char ch=input.charAt(0);
	    if(Character.isDigit(ch)){
	        solve(input.substring(1),output+ch,result);
	    }
	    else{
	        
	        //lower..
	        solve(input.substring(1),output+Character.toLowerCase(ch),result);
	        //capital..
	        solve(input.substring(1),output+Character.toUpperCase(ch),result);
	    }
	    return result;
	}
}
