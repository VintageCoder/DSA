package Recursion;

public class SudokoSolverMain {
	static int[] findSpace(int grid[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
               if(grid[i][j]==0){
                   int[] ans = new int[2];
                   ans[0]=i;
                   ans[1]=j;
                   return ans;
                   
               } 
            }
        }
        int ans[]=null;
        return ans;
    }
    public static boolean check(int B[][],int a,int b,int ind){
        for(int i=0;i<9;i++){
            if (B[i][b]==ind) return false;
            if (B[a][i]==ind) return false;
        }
        int x=a/3;
        x=x*3;
        int y=b/3;
        y=y*3;
        for (int i=x;i<x+3;i++){
            for (int j=y;j<y+3;j++){
                if (B[i][j]==ind) return false;
            }
        }
        return true;
    }
    
    static boolean SolveSudoku(int grid[][])
    {
        // add your code here
        int a,b;
        if((findSpace(grid))==null) {
        	return true;
        }
        int ans[]=findSpace(grid);
        a=ans[0];
        b=ans[1];
//        System.out.println(a+ ": a and b :"+b);
        for(int i=1;i<10;i++){
            if(check(grid,a,b,i)){
                grid[a][b]=i;   
                
           if(SolveSudoku(grid)) return true;
           grid[a][b]=0;
            }
        } 
        return false;
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println("");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grid[][] = 
				{{3 ,0 ,6 ,5 ,0 ,8 ,4 ,0 ,0},
				 {5 ,2, 0, 0, 0, 0 ,0 ,0 ,0},
			     {0 ,8 ,7 ,0 ,0 ,0 ,0 ,3 ,1},
				 {0 ,0 ,3 ,0 ,1 ,0 ,0 ,8 ,0},
				 {9, 0, 0, 8 ,6 ,3 ,0 ,0 ,5},
				 {0 ,5, 0, 0, 9, 0, 6, 0, 0},
				 {1, 3, 0, 0, 0, 0,2, 5, 0},
				 {0 ,0 ,0 ,0 ,0 ,0 ,0 ,7 ,4},
				 {0 ,0, 5, 2, 0, 6, 3, 0, 0}};
		SolveSudoku(grid);
		printGrid(grid);

	}

}
