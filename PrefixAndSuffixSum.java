import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int[] arr={0,1,2,3,-4,8};
		System.out.println(Arrays.toString(arr));
		ArrayList<Integer> prefix= prefixSum(arr);
		ArrayList<Integer>suffix= suffixSum(arr);
		System.out.println(prefix);
		System.out.println(suffix);
	}
	private static ArrayList<Integer> prefixSum(int[] arr){
	    ArrayList<Integer> prefix= new ArrayList<Integer>();
	    prefix.add(arr[0]);
		
		for(int i=1;i<arr.length;i++){
		    prefix.add(arr[i]+prefix.get(i-1));
		}
		return prefix;
	}
	private static ArrayList<Integer> suffixSum(int[] arr){
	    int[] sufix=new int[arr.length];
	    sufix[sufix.length-1]=arr[arr.length-1];
        
        for(int i=arr.length-2;i>=0;i--){
            sufix[i]=sufix[i+1]+arr[i];
        }
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int ele: sufix){
            result.add(ele);
        }
        return result;
	}
}
