class FrequncyCounter {
	
	static void frequencycounter(int x[]) {
		int count;
		boolean flag = false;
		for (int i=0; i<x.length ; i++) {
			count = 0;

			for (int j=0; j<x.length ; j++ ) {
				if(x[i] == x[j]){
					count++;
					flag = true;
				}
			}

			if(flag == true && count > 1){
				System.out.println( " x["+i+"]="+x[i]+" occurs= "+count+" time" );
				continue;
			}
		}
	}

	public static void main(String[] args) {
		FrequncyCounter.frequencycounter(new int[]{
			1,22,5,5,-1,-1,-80
		});
	}
}