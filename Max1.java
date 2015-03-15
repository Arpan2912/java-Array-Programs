class Max1 {

	static int max1(int arr[][]){ 
		int max = arr[0][0];
		for(int i=0; i < arr.length; i++){
			for (int j = 0; j < arr[0].length ;j++ ) {

				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String... s) {
		int max = Max1.max1(new int[][]{ 
			{10, 25, 5}, 
			{9, 90, 5},
			{12, 5, 3}
		});
		
		System.out.println("Max value: "+max);
	}
}