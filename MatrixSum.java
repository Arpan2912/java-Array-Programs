class MatrixSum {
	
	static void matrixsum(int x[][]) {

		//int result[][] = new int[x.length][x[0].length];
		int rawsum=0, colsum =0, diasum =0;
		int raw[] = new int[x.length], col[] = new int[x.length];
		for (int i=0; i < x.length ; i++) {
			for (int j=0; j < x[0].length ; j++) {
				rawsum += x[i][j];
				colsum += x[j][i];
				if(i == j){
					diasum += x[i][j];
				}
			}
			raw[i] = rawsum;
			col[i] = colsum;
			rawsum = 0;
			colsum = 0;
		}
		System.out.println( " \n " );
		for (int i=0; i < x.length ; i++ ) {

			for (int j=0; j < x[0].length ; j++) {
				System.out.print( " " + x[i][j] +"  |  " );
				if(j+1 >= x[0].length)
					System.out.println( "=  " +raw[i] );
				
			}

			for (int k=x.length -1; k >= 0  ; k--) {
				if(i+1 >= x.length)
					System.out.print( " " + col[k] + " |");
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

		MatrixSum.matrixsum(x);

	}
}