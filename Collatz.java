public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int numOfTimes = 1;
		if ((mode.equals("v")) || (mode.equals("V"))) {
			System.out.print(seed + " ");

			if (seed == 1) {
				seed = (seed * 3) + 1;
				System.out.print(seed + " ");
				numOfTimes++;
			}
			
		while (seed != 1) {
			if (seed % 2 == 0) {
				seed = seed / 2;
				System.out.print(seed + " ");
				numOfTimes++;
			} else {
				seed = (seed * 3) + 1;
				System.out.print(seed + " ");
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
