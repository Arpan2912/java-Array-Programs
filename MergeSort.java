class MergeSort {
	
	static void mergesort(int x[], int y[]) {
		
		int z[] = new int[x.length + y.length];
		int c = 0, temp;

		for (int i=0 ; i<x.length ; i++ ) {
			z[c] = x[i];
			c++;
		}

		for (int i=0; i<y.length ; i++ ) {
			z[c] = y[i];
			c++;
		}

		for(int i=0; i < z.length -1; i++){
		
			for(int j=i+1; j < z.length; j++){

				if( z[i] < z[j]) {
					
					temp = z[i];
					z[i] = z[j];
					z[j] = temp;
				}
			}
		}

		for (int i=0; i<z.length ; i++ ) {
			System.out.println( z[i] );
		}
	}

	public static void main(String... s) {
		MergeSort.mergesort(
			new int[] {1, 60, 62},
			new int[] {45, 23, 17}
		);
	}
}