package Recursion;

public class isLucky {
	  static boolean check(int n,int count){
//		  System.out.println(n+" "+count);
	       if(count>n) return true;
	        if(n%count==0) return false;
	        int np=n-n/count;
	  
	        return check(np,count+1);
	   }
	public static void main(String[] args) {
		int n=5;
		if (check(n,2)){
           System.out.println("Yess");
		}else {
			 System.out.println("No");
		}
	}

}
