package Recursion;

public class PowerNum {
	 public static long power(int N,int R)
	    {
	        //Your code here
		
		 if(R==0)
	          return 1;
	        if(R==1)
	          return N;
	          
	      //  ans=1000000007;
	        long ans=power(N,R/2);
	        System.out.println(N+" R :"+R+" Ans: "+ans);
	        ans=(ans*ans)%1000000007;
	        
	        if(R%2==0)
	        {
	            return ans%1000000007;
	        }
	        
	        return (ans*N)%1000000007; 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(power(5,4));

	}

}
