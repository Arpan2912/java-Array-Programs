class Min {

	static int min(int arr[]){ 
		int min = arr[0];
		for(int i=0; i < arr.length; i++){
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String... s) {
		int min = Min.min(new int[]{10, 25, 5, 65, 7, 9, 4, 5, 96, 3 });
		
		System.out.println("Min value: "+min);
	}
}