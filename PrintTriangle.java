class PrintTriangle {

	static void print(int x[]) {

		for (int i=1; i<=x.length; i++) {

			for (int j=0; j < i; j++) {

				System.out.print( "  "+x[j] );		
			}	
			System.out.println( "  " );
		}
	}
	public static void main(String[] args) {
		PrintTriangle.print(new int[]{
			1,2,3,4,5
		});
	}
}