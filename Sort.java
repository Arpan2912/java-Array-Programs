class Sort {

	static void sort(int arr[]){ 
		int temp;
		for(int i=0; i < arr.length -1; i++){
		
			for(int j=i+1; j < arr.length; j++){

				if( arr[i] < arr[j]) {					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println( " sorted array " );
		for (int i=0; i< arr.length ; i++) {
			System.out.print( arr[i] + ", ");
		}
	}

	public static void main(String... s) {

		Sort.sort(new int[]{-1, 2, 3, -2, 1, -3, 0 });
	}
}