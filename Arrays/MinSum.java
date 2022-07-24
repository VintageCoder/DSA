package Practice;

public class MinSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {6,7,5,2,-1,	2,6};
		int min=Integer.MAX_VALUE;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			if (min>sum) {
				min=sum;
			}
			if(sum>0) sum=0;
			
			
		}
		
		System.out.print(min);
	}

}
