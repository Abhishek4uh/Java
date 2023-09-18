import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int n=19;
		fibbo(n);
	}
	private static void fibbo(int n){
	    int first=0;
	    int second=1;
	    for (int i=0; i<=n;i++ ){
	      System.out.print(first +" ");  
	      int temp=first+second;
	      first=second;
	      second=temp;
	    } 
	  }
}
