package Recursion;

import java.util.ArrayList;

public class SubseetSum {
	public static void subsetOp(ArrayList<Integer> arr,ArrayList<Integer> list,int N,int i,int current_sum){
        if(i==N) {
        	list.add(current_sum);
        	return ;
        }
        subsetOp(arr,list,N,i+1,current_sum);
        
        subsetOp(arr,list,N,i+1,current_sum+arr.get(i));
    }
    
    
    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        subsetOp(arr,list,N,0,0);
        return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(2);
		arr.add(3);
		System.out.print(subsetSums(arr,2));

	}

}
