import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number: ");
		int num =sc.nextInt();
		
		if((num&1)==0){
		    System.out.print("even");
		}
		else{
		    System.out.print("odd");
		}
	
	}
	
}
