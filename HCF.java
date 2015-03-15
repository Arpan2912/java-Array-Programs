class HCF {

	static void hcf(int x, int y) {

		int hcf = 0;
		int min = (x < y) ? x : y;

		for (int i=1; i<=min; i++) {

			if(x%i == 0 && y%i == 0)
				hcf = i;
		}

		System.out.println( "HCM of x="+x+", y="+y+", is= "+hcf );
	}
	public static void main(String[] args) {
		HCF.hcf(15, 25);
	}
}