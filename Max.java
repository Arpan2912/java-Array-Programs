class Max {

	static int max(int arr[]){ 
		int max = arr[0];
		for(int i=0; i < arr.length; i++){
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String... s) {
		int max = Max.max(new int[]{10, 25, 5, 65, 7, 9, 4, 5, 96, 3 });
		
		System.out.println("Max value: "+max);
	}
}