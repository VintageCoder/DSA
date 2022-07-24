package Practice;

import java.util.ArrayList;

public class SubarrayGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> str = new ArrayList<Integer>();
		int arr[]= {1,2,3,4};
		int n=4;
		int s=0;
		int sum=arr[0];
        int left=0;
        int right=0;
        for(int j=0;j<n;j++) {
        	System.out.print(arr[j]);
        }
        System.out.println();
        if (sum==s) {
        	 System.out.println(1);
        }
        while(right<n-1 ){
        	System.out.println("Print fIRST"+sum);
 	    	   	
            if(sum + arr[right+1]<=s) {
            	sum+=arr[right+1];
            	right++;
            	
            }else{
                sum-=arr[left];
                left++;
            if(left>right) {
            	right++;
            	sum+=arr[right];
            }

               
            }
            if(sum==s){ 
                str.add(left+1);
                str.add(right+1);
                for(int j=left;j<right+1;j++) {
                	System.out.print(arr[j]+" -----------");
                }
                System.out.println(str);
               
                break;
            }
            System.out.println("Print LAST "+sum);
     
    
        }
        str.add(-1);
        System.out.println(str);
    }

}
