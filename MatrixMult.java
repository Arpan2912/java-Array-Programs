class MatrixMult {
	
	static void matrixmulti(int x[][], int y[][]) {

		int result[][] = new int[x.length][x[0].length];
		int sum = 0, k;
		for (int i=0; i < x.length ; i++) {
			for (int j=0; j < x[0].length ; j++) {
				
				for (k=0; k< x.length ; k++) {
					sum = sum + x[i][k] * y[k][j];
				}
				result[i][j] = sum;
				sum = 0;
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

		MatrixMult.matrixmulti(x, y);

	}
}