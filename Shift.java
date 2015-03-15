class Shift {

	static void shift(int arr[]){ 
		int temp;
		for(int i=0; i < arr.length -1; i++){
		
			for(int j=i+1; j < arr.length; j++){

				if( ( arr[i] >= 0 ) || (arr[j] >= 0) ){ 
				if( arr[i] > arr[j]) {					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				}
			}
		}
		System.out.println( " sorted array " );
		for (int i=0; i< arr.length ; i++) {
			System.out.print( arr[i] + ", ");
		}
	}

	public static void main(String... s) {

		Shift.shift(new int[]{-1, 2, 3, -2,4, 5, 6, 7, 1, -3, 0, -4, -5});
	}
}