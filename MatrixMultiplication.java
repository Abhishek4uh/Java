import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int A[][] = {{17,4,}, {17 , 16}};
        int B[][] = {{9, 2}, {7, 1}};
        //C[][] = {{181, 38}, {265, 50}}
        
        int col_A= A[0].length;
        int row_B= B.length;
        
        
        if(col_A!=row_B){
            System.out.println("multiplication can't be happen ");
            return;
        }
        
        int row_A= A.length;
        int col_B= B[0].length;
        
        int res[][]= new int[row_A][col_B];
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                for(int k=0;k<2;k++){
                    res[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        
        System.out.println(Arrays.deepToString(res));
	}
}
