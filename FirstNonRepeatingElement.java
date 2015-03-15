class FirstNonRepeatingElement {

	static void firstnonrepeatingelement(int x[]){
		int i, j;
		boolean flag = false;
		for (i=0; i<x.length ; i++) {
			flag = false;

			for (j=0; j<  i ; j++) {
				if( x[i] != x[j] ) {
					flag = true;
					break;
				}
			}

			if(flag) {
				System.out.println( " non "+x[i] ); 
				break;
			}
		}



	}

	public static void main(String[] args) {
		FirstNonRepeatingElement.firstnonrepeatingelement(new int[]{
			1, 56, 1, 3, 4, 5
		});
	}
}