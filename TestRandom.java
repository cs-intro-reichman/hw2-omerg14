public  class  TestRandom {
	public static void main(String[]  args) {
		int num = Integer.parseInt(args[0]);
		int i = 0;
		int numOfTimesOver = 0;
		int numOfTimesUnder = 0;
		
		while (i < num) {
			double num1 = Math.random();
			i++;
			if (num1 > 0.5) {
				numOfTimesOver++;
			} else {
				numOfTimesUnder++;
			}
		}

		double Ratio = (double) numOfTimesOver / numOfTimesUnder;
		System.out.println("> 0.5: " + numOfTimesOver + " times");
		System.out.println("<= 0.5: " + numOfTimesUnder + " times");

		if (numOfTimesUnder != 0) {
			System.out.println("Ratio: " + Ratio);
		}
	}
}
