package Recursion;

public class nQueen {
	
	private static boolean checkQueen(int arr[][],int row, int N) {
		// TODO Auto-generated method stub
		if (row==arr.length) return true;
		for(int col=0;col<N;col++) {
			if(check(arr,row,col,N)) {
				arr[row][col]=1;
			
			if(checkQueen(arr,row+1,N)) {
				printSolution(arr,N);
				return true;
			}
			arr[row][col]=0;
			
			}
		}
			
		
//		checkQueen(arr,row+1);
		
		return false;
	}

	private static boolean check(int[][] arr, int row, int col,int N) {
		// TODO Auto-generated method stub
		 int i, j;
		 
	        /* Check this row on left side */
	        for (i = 0; i < N; i++) {
	            if (arr[i][col] == 1)  return false;
	        }
	 
	        /* Check upper diagonal on left side */
	        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
	            if (arr[i][j] == 1)  return false;
	        }
	 
	        /* Check lower diagonal on left side */
	        for (i = row, j = col; j >= 0 && i < N; i++, j--) {
	            if (arr[i][j] == 1) return false;
	        }
	        return true;
	}
	private static void printSolution(int board[][],int N)
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                                 + " ");
            System.out.println();
        }
        System.out.println("----------------------------");
    }

	
	
	
	public static void main(String[] args) {
		int arr[][]= {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		System.out.print(checkQueen(arr,0,4));
		
		
	}

}
