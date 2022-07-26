package Practice;

public class MidSum {
	public static int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
        int arr[]=new int[n*2];
        int fv=0;
        int sv=0;
        for(int i=0;i<n*2;i++){
        	System.out.println(fv+" "+sv+" value of i :"+i);
            if(sv==n || (fv!=n && ar1[fv]<ar2[sv]) ){
                arr[i]=ar1[fv];
                fv++;
            }else{
                arr[i]=ar2[sv];
                
                sv++;
            }
        }
        return arr[n-1]+arr[n];
        
    }
	public static void main(String[] args) {
		int n=3;
		int ar1[]= {5,6,11};
		int ar2[]= {4,7,9};
		System.out.print(MidSum.findMidSum(ar1,ar2,n));
	}

}
