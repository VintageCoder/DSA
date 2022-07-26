package Recursion;

import java.util.Stack;

public class SortArray {
	static void sortedInsert(Stack<Integer> s, int x)
    {
        // Base case: Either stack is empty or newly
        // inserted item is greater than top (more than all
        // existing)
        if (s.isEmpty() || x > s.peek())
        {
            s.push(x);
            return;
        }
 
        // If top is greater, remove the top item and recur
        int temp = s.pop();
        sortedInsert(s, x);
 
        // Put back the top item removed earlier
        s.push(temp);
    }
	
	public static Stack<Integer> sortStack(Stack<Integer> s){
		
		if(!s.isEmpty() ) 	{
			int num=s.pop();
			System.out.println("Stack :"+ s+" Num :"+num);
			sortStack(s);
			sortedInsert(s, num);
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> input = new Stack<Integer>();
		input.add(34);
		input.add(3);
		input.add(31);
		input.add(98);
		input.add(92);
		input.add(23);

// This is the temporary stack
		Stack<Integer> tmpStack=sortStack(input);
		System.out.println("Sorted numbers are: " +tmpStack);
	}

}
