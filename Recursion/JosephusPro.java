package Recursion;

public class JosephusPro {
//	public static int check(int n,int sum,int k,int curr_sum){
//        curr_sum+=k;
//        System.out.println("Sum :"+sum+" Curr_sum :"+curr_sum);
//        if (sum<=n) return sum;
//        
//        if(curr_sum>n && k%2!=0){
//            curr_sum-=n;
//        }
//        if(curr_sum>n && k%2==0 ){
//           k+=1;
//        	curr_sum-=n;
//        }
//        sum-=curr_sum;
//        return check(n,sum,k,curr_sum);
//    }
   public static int josephus(int n, int k)
    {
	   if(n == 1){
	       return 1;
	   }
	   else{
	       return(josephus(n-1,k)+k-1)%n+1;
	   }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(josephus(17,16));

	}

}
