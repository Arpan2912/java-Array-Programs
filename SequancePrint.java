class SequancePrint {

	static void sequanceprint(int[][] a, int rowSize, int colSize) {

		for(int i = 0; i < colSize; i++){
			for (int j=i,col=0; j >= 0; j--, col++ ) {
				System.out.print( "m["+j+"]["+col+"]"+" ");
				//System.out.print(matrix[j][col] +" ");
			}
			System.out.println("");
		}

		for(int i = 1; i < rowSize; i++){
			for (int j=i,row=colSize-1; j < rowSize; j++, row--) {
				System.out.print( "v["+row+"]["+j+"]"+" ");	
			}
			System.out.println("");
		}


	}

	public static void main(String[] args) {
		int[][] matrix = new int[][]{
			{ 1, 2, 3, 4, 5},
			{ 6, 7, 8, 9, 10},
			{11, 12, 13,14, 15},
			{16, 17, 18, 19, 20},
			{21, 22, 23, 24, 25}
		};

			/*{ 1, 2, 3},
			{4, 5, 6 },
			{7, 8, 9 }*/

			/*{ 1, 2, 3, 4, 5},
			{ 6, 7, 8, 9, 10},
			{11, 12, 13,14, 15},
			{16, 17, 18, 19, 20},
			{21, 22, 23, 24, 25}*/
		int rowSize = matrix.length;
		int colSize = matrix[0].length;
		sequanceprint(matrix, rowSize, colSize);
	}
}