
// Write an algorithm such that if an element in an NxN matrix
// is 0, its entire row and column are set to zero

public class ZeroMatrix {
	
	public static void setRowZero(int matrix[][], int row){
		for(int i = 0; i < matrix[row].length; i++)
			matrix[row][i] = 0;
	}
	
	public static void setColumnZero(int matrix[][], int column){
		for(int i = 0; i < matrix.length; i++)
			matrix[i][column] = 0;
	}
	
	public static void zeroMatrix(int matrix[][]){
		int n = matrix.length;
		boolean isZero[][] = new boolean[n][n];
		
		for(int i = 0; i < isZero.length; i++){
			for(int j = 0; j < isZero[i].length; j++){
				isZero[i][j] = false;
			}
		}
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				if(matrix[i][j] == 0)
					isZero[i][j] = true;
			}
		}
		
		for(int i = 0; i < isZero.length; i++){
			for(int j = 0; j < isZero[i].length; j++){
				if(isZero[i][j]){
					setRowZero(matrix, i);
					setColumnZero(matrix, j);
				}
			}
		}
		
	}
	
	public static void printMatrix(int [][] matrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int test1 [][] = {{1, 2, 3, 4}, 
				{5, 0, 7, 8}, 
				{9, 10, 11, 12}, 
				{13, 14, 15, 16}};
		
		printMatrix(test1);
		System.out.println();
		zeroMatrix(test1);
		printMatrix(test1);
		System.out.println();
		
		int test2 [][] = {{1, 0, 3, 4}, 
				{5, 6, 7, 8}, 
				{9, 10, 0, 12}, 
				{13, 14, 15, 16}};
		
		printMatrix(test2);
		System.out.println();
		zeroMatrix(test2);
		printMatrix(test2);

	}

}
