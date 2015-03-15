class MatrixAdd {
	
	static void matrixadd(int x[][], int y[][]) {

		int result[][] = new int[x.length][x[0].length];

		for (int i=0; i < x.length ; i++) {
			for (int j=0; j < x[0].length ; j++) {

				result[i][j] = x[i][j] + y[i][j];
			}
		}


		for (int i=0; i < x.length ; i++) {
			for (int j=0; j < x.length ; j++) {
				
				System.out.print( result[i][j]+"  " );
			}

			System.out.println( "  " );
		}
	
	}

	public static void main(String[] args) {
		
		int[][] x = new int[][]{
			{1, 2, 5},
			{5, 8, 6},
			{7, 3, 4}
		};

		int[][] y = new int[][]{
			{1, 2, 5},
			{5, 8, 6},
			{7, 3, 4}
		};

		MatrixAdd.matrixadd(x, y);

	}
}