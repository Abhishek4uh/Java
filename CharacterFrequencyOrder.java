import java.util.*;
//printing in sorted order...
public class Main
{
	public static void main(String[] args) {
		String name= "helloworld";
		HashMap<Character,Integer> record= new HashMap<>();
		char [] allchars= name.toCharArray();
		for(char ch: allchars){
		    if(record.containsKey(ch)){
		        record.put(ch, record.get(ch) + 1);
		    }
		    else{
		        record.put(ch,1);
		    }
		}
		
		ArrayList<Character> keysList = new ArrayList<>(record.keySet());
		Collections.sort(keysList);
		for(Character entry: keysList){
		    System.out.println(entry + "->"+ record.get(entry));
		}
	}
}
