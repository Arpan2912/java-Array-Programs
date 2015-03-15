class MatixDiagonal {

	public static void printDiagnolly(int[][] matrix, int rowSize, int colSize){
		
		for(int i = 0; i < rowSize; i++){
			for (int j=i,col=0; j >= 0; j--, col++ ) {
					System.out.print( "m["+j+"]["+col+"]"+matrix[j][col] +" ");
			}
			System.out.println("");
		}

		for(int i = 1; i < colSize; i++){
			for (int j=i,row=rowSize-1; j < colSize; j++, row--) {
				System.out.print(matrix[row][j]+" ");	
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		int[][] matrix = new int[][]{
			{ 1, 2, 3, 4, 5},
			{ 6, 7, 8, 9, 10},
			{11, 12, 13,14, 15},
			{16, 17, 18, 19, 20}
		};
		int rowSize = matrix.length;
		int colSize = matrix[0].length;
		printDiagnolly(matrix, rowSize, colSize);
	}
}