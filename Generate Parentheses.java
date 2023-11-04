class Solution {
    public List<String> generateParenthesis(int n) {
      ArrayList<String> res= solve("",n,n,new ArrayList<String>());
			return res;
    }
    private static ArrayList<String> solve(String output,int open,int close,ArrayList<String> temp){
	    if(open==0 && close==0){
	        temp.add(output);
	        return temp;
	    }
	    if(open!=0){
	        String op1 = output + "(";
            solve(op1, open - 1, close, temp);
	    }
	    if(close>open){
	        String op2 = output + ")";
            solve(op2, open, close - 1, temp);
	    }
	    return temp;
	}
}
