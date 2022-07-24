package Practice;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int array[]={1, 2, 3, 5};
		  int sum=n*(n+1);
	        sum=sum/2;
	        System.out.println("sum : "+sum);
	        for(int i=0;i<n-1;i++){
	        	 System.out.print(sum);
	            sum-=array[i];
	            System.out.print(sum+" "+array[i]);
	        }
	        System.out.print(sum);
	}

}
