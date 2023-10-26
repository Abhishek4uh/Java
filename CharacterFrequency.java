import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String name= "HelloWorld";
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
		System.out.println(record);

		//we can print in this way..
		for(Map.Entry<Character, Integer> entry : record.entrySet()){
		    System.out.println(entry);
		}
	}
}
