class Union {

	static void union(int x[], int y[] ) {
		
		System.out.println( " First array " );
		for (int j=0; j < x.length ; j++ ) {
			System.out.print(x[j] + ", ");	
		}
		
		System.out.println( "  " );
		System.out.println( " Second array " );
		for (int j=0; j < y.length ; j++ ) {
			System.out.print(y[j]+ ", ");	
		}

		int union[] = new int[ x.length + y.length ];
		int count = 0;
		for (int i=0; i < x.length ; i++) {			
			for (int j=0; j < y.length ; j++ ) {
				if ( x[i] == y[j] ) {
					union[count] = x[i];
					count++;
				}else{
					continue;
				}
			}			
		}

		System.out.println( "  " );
		System.out.println( " Union of and array: " );
		for (int j=0; j < count ; j++ ) {
			System.out.print(union[j]+ ", ");
		}

	}

	public static void main(String... s) {
		Union.union(
			new int[]{ 10, 56, 38},
			new int[]{ 50, 56, 38}
		);
	}
}