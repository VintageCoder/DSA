package Practice;

public class equilibriumPoint {
	public static void main(String[] args) {

        // Your code here
		int arr[]= {4 ,42 ,27 ,16 ,28 ,3 ,4, 5, 9 ,3 ,31, 5 ,5 ,29 ,10 ,18 ,35 ,35, 33, 19, 41, 23, 8 ,32, 9 ,5 ,8, 18, 35, 13, 6 ,7 ,6, 10, 11, 13 ,37 ,2 ,25, 7, 28, 43};
		int n=42;
        if(n==1) System.out.print(1);
        int left=0;
        int right=n-1;
        long sum_left=arr[0];
        long sum_right=arr[n-1];
        
        while(left<right){
        	System.out.println(left+" "+right+"->"+sum_left+" "+sum_right);
            if(sum_left==sum_right && right-left==2){
//                return left+1;
                System.out.print(left+2);
                break;
            }
            if(sum_left<sum_right){
               left++; 
               sum_left+=arr[left];
            }else{
                right--;
                sum_right+=arr[right];
            }
        
        }
//        return -1;
        System.out.print("done");
    }

}
