class LowerTriangle {
	
	static void lowertriangle(int a[][]) {
		
		int result[] = new int[a.length + a[0].length];
		int count = 0;
		//below column 0
		for (int r = 0; r < a.length; r++) {
			//System.out.println (a[r][0]);
			result[count] = a[r][0];
			count++;
		}

		// the last row
		for (int c = 1; c < a.length; c++) {
			//System.out.println (a[a.length-1][c]);
			result[count] = a[a.length-1][c];
			count++;
		}

		//diagonal
		for (int r = a.length-2; r > 0; r--) {
			//System.out.println (a[r][r]);
			result[count] = a[r][r];
			count++;
		}
		//print lower Triangle
		//find min and max
		//and sum of them
		int max = result[0], min = result[0],  total =0;
		for (int i=0; i < result.length ; i++) {

			if(result[i] > max){
				max = result[i];
			}
			if(result[i] < min){
				min = result[i];
			}
			total += result[i];
			System.out.println( result[i] );
		}

		System.out.println( " min value is:  "+min );
		System.out.println( " max value is:  "+max );
		System.out.println( "  and total is: "+total );

	}
	public static void main(String[] args) {
		LowerTriangle.lowertriangle(new int[][]{
			{1,2,3},
			{4,5,6},
			{7,8,9}
		});
	}
}