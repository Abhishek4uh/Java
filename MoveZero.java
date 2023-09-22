import java.util.*;

public class Main{
	public static void main(String[] args) {
		System.out.println("Move Zero");
		
		int[] nums={0,1,0,3,12};
		
		int inserPos=0;
		
		for (int i=0; i<nums.length;i++){
		    if(nums[i]!=0){
		        nums[inserPos]=nums[i];
		        inserPos+=1;
		    }
		}
		
		for(int i=inserPos;i<nums.length;i++){
		    nums[i]=0;
		}
		
		System.out.println(Arrays.toString(nums));
	}
	
}
