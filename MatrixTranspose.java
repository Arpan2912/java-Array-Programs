class MatrixTranspose {
	
	static void transpose(int x[][]) {

		int result[][] = new int[x.length][x[0].length];

		for (int i=0; i < x.length ; i++) {
			for (int j=0; j < x[0].length ; j++) {

				result[j][i] = x[i][j];
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
		
		MatrixTranspose.transpose(x);

	}
}