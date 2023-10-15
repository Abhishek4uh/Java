import java.util.*;


public class Main
{
	public static void main(String[] args) {
	    
	    String s="ABC";
		ArrayList<String> ans = new ArrayList();

        for (int i = 0; i < s.length(); i++) {
            StringBuilder str = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                str.append(s.charAt(j));
                ans.add(str.toString());
            }
        }
        System.out.println(ans);
	}
}
