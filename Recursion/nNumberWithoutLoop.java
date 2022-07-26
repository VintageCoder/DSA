package Recursion;

public class nNumberWithoutLoop {
	   
	  public void printNos(int N)
	    {
	        //Your code here
	        if(N>0){
	            printNos(N-1);
	            System.out.print(N+" ");
	            
	        }
	        return;
	        // System.out.print(printNos(N--));
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nNumberWithoutLoop obj=new nNumberWithoutLoop();
		obj.printNos(12);

	}

}
