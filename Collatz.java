public class Collatz {
    public static void main(String args[]) {
        int seed = Integer.parseInt(args[0]);
        String mode = args[1];

        if ((mode.equals("v")) || (mode.equals("V"))) {
            for (int i = 1; i <= seed; i++) {
                int currentSeed = i;
                int numOfTimes = 1;

				System.out.print(currentSeed + " ");
				
				if (currentSeed == 1) {
					currentSeed = (currentSeed * 3) + 1;
					System.out.print(currentSeed + " ");
					numOfTimes++;
				}

                while (currentSeed != 1) {
                    if (currentSeed % 2 == 0) {
                        currentSeed = currentSeed / 2;
                    } else {
                        currentSeed = (currentSeed * 3) + 1;
                    }
                    System.out.print(currentSeed + " ");
                    numOfTimes++;
                }

                System.out.println("(" + numOfTimes + ")");
            }
            System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
        }

        if ((mode.equals("c")) || (mode.equals("C"))) {
            System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
        }
    }
}
