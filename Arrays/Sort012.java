package Practice;

public class Sort012 {
	public static void main(String[] args) {
		int n=5;
		int a[]= {0 ,2 ,1 ,2 ,0};
		int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            if (a[i]==0){
                count0+=1;
            }else if (a[i]==1){
                count1+=1;
            }else{
                count2+=1;
            }
        }
        for( int i=0;i<count0;i++){
            System.out.print(0+" ");
        }
        for(int j=0;j<count1;j++){
             System.out.print(1+" ");
        }
        for(int k=0;k<count2;k++){
             System.out.print(2+" ");
        }
	}

}
