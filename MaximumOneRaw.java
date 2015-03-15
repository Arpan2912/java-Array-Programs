class MaximumOneRaw {
	
	static void maximumoneraw(int x[][]) {
		int count, max =0, raw = 0;
		for (int i=0; i <x.length ; i++) {
			count = 0;
			for (int j=0; j < x[0].length ; j++) {
				if (x[i][j] == 1) {
					count++;
				}
				System.out.print( x[i][j] + "   ");
			}
			if (count > max) {
				max = count;
				raw = i;
			}
			System.out.println( "  " );
		}
		System.out.println( "  " );
		System.out.println( "  " );
		System.out.println( max + " time found 1 at RAW "+ (raw+1) + " ( x["+raw+"] )" );
	}
	public static void main(String[] args) {
		MaximumOneRaw.maximumoneraw(new int[][]{
			{0,0,0,0,1},
			{1,0,0,1,1},
			{0,0,0,1,1},
			{1,0,1,1,1},
			{0,0,0,0,1},
		});
	}
}