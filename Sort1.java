class Sort1 {

	static void sort1(int arr[][]){ 
		int temp, newarr[] = new int[arr.length * arr[0].length], k =0;

		for(int i=0; i < arr.length; i++){		
			for(int j=0; j < arr.length; j++){
				newarr[k] = arr[i][j];
				k++;
			}
		}

		for(int i=0; i < newarr.length -1; i++){		
			for(int j=i+1; j < newarr.length; j++){
				if( newarr[i] < newarr[j]) {					
					temp = newarr[i];
					newarr[i] = newarr[j];
					newarr[j] = temp;
				}
			}
		}

		k=0;
		for(int i=0; i < arr.length; i++){		
			for(int j=0; j < arr.length; j++){
				arr[i][j] = newarr[k];
				k++;
			}
		}

		System.out.println( " sorted 2d array " );
		for (int i=0; i< arr.length ; i++) {
			for(int j=0; j < arr[0].length; j++){
				System.out.println( arr[i][j] );
			}
		}
	}

	public static void main(String... s) {

		Sort1.sort1(new int[][]{
			{1, 200, 5},
			{65, 17, 9},
			{40, 5, 96}
		});
	}
}