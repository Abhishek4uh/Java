import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String input="aba";
		String output="";
		ArrayList<String> res= subset(input,output);
		System.out.println(res);
		System.out.println(res.size());
		
		HashSet<String> newRes= new HashSet<>(res);
		System.out.println(newRes);
		System.out.println(newRes.size());
	}
	private static ArrayList<String>subset(String input,String output){
	    
	    //base...
	    if(input.length()==0){
	        ArrayList<String> temp= new ArrayList<>();
	        temp.add(output);
	        return temp;
	    }
	    char ch=input.charAt(0);
	    //notTaking
	    ArrayList<String> left= subset(input.substring(1),output);
	    
	    //Taking..
	    ArrayList<String> right= subset(input.substring(1),output+ch);
	    
	    left.addAll(right);
	    
	    return left;
	}
}
