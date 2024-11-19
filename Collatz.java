public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String mode = args[1];

		for (int i = 1; i <= seed; i++) {
			int currentSeed = i;
			int numOfTimes = 1;
		
		if ((mode.equals("v")) || (mode.equals("V"))) {
			System.out.print(currentSeed + " ");

			if (currentSeed == 1) {
				currentSeed = (currentSeed * 3) + 1;
				System.out.print(currentSeed + " ");
				numOfTimes++;
			}

		while (currentSeed != 1) {
			if (currentSeed % 2 == 0) {
				currentSeed =  currentSeed / 2;
				System.out.print(currentSeed + " ");
				numOfTimes++;
			} else {
				currentSeed = (currentSeed * 3) + 1;
				System.out.print(currentSeed + " ");
				numOfTimes++;
			}
		} 
			System.out.println("(" + numOfTimes + ")");
			System.out.println("Every one of the first " +  numOfTimes + " hailstone sequences reached 1.");
		
		}  else if ((mode.equals("c")) || (mode.equals("C"))) {
			System.out.println("Every one of the first " +  seed + " hailstone sequences reached 1.");
		}
	}
	}
}
