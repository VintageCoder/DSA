package Recursion;

import java.util.Stack;

public class PopMidStack {
	
	public static void delete(Stack<Integer> s,int mid,int count ) {
		
		int x=s.pop();
//		System.out.println(s);
		if (count==mid-1) return;
		delete(s,mid,count+1);
		s.push(x);
	}
	
	
	public static void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        int mid=(sizeOfStack/2)+1;
        int count=1;
        delete(s, mid, count);
         
        
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
//		s.add(5);
//		s.add(23);

		deleteMid(s,6);
		System.out.println("Deleted Stack: " +s);

	}

}
