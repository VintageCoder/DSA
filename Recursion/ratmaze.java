package Recursion;

import java.util.ArrayList;

public class ratmaze {
	static boolean solvePath(int m[][],boolean vis[][],int n,int row,int col,ArrayList<String> list,String str){
        if(row==n || col==n || m[row][col]==0 || vis[row][col]){
            return false;
        }
        
        if(row==n-1 && col==n-1) {
        	System.out.println("Reached : "+str );
        	list.add(str);
        	return true;
        }
        
        vis[row][col]=true;
        if(solvePath(m,vis,n,row+1,col,list,str+"D")) {
//        	str=str + "D";
        	System.out.println("D :" +str);
        	return true;
        }
        if(solvePath(m,vis,n,row,col+1,list,str+"R")) {
//        	str+="R";
        	System.out.println("R :" +str);
        	return true;
        }
        vis[row][col]=false;
        return false;
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
    	ArrayList<String> list= new ArrayList<String>();
    	boolean vis[][]=new boolean[n][n];
    	String str="";
        if(!solvePath(m,vis,n,0,0,list,str)) {
        	list.add("-1");
        }
        return list;
    }
    public static void main (String[] args) {
    	int N = 4;
    		int	m[][] = {{1, 0, 0, 0},
    			         {1, 1, 0, 1}, 
    			         {1, 1, 0, 0},
    			         {0, 1, 1, 1}};
  
    	System.out.print(findPath(m,N));
    }

}
