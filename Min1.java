class Min1 {

	static int min1(int arr[][]){ 
		int min = arr[0][0];
		for(int i=0; i < arr.length; i++){
			for (int j = 0; j < arr[0].length ;j++ ) {

				if(arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		return min;
	}

	public static void main(String... s) {
		int min = Min1.min1(new int[][]{ 
			{10, 25, 5}, 
			{9, 90, 5},
			{12, 5, 3}
		});
		
		System.out.println("Max value: "+min);
	}
}