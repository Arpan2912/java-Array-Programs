class LCM {

	static void lcm(int a, int b) {

		if (a > b) // check whether a is big or b is big
        {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }
        for (int i = 1; i <= big; i++) {
            if (((big * i) % small) == 0) {
                int lcm = big * i; // condition to calculate the LCM of two
                                    // numbers
                System.out.println("The least common multiple is " + (lcm));
                // print the LCM of two numbers
                break;
            }
        }

	}
	public static void main(String[] args) {
		LCM.lcm(15, 25);
	}
}