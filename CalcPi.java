
public class CalcPi {
	public static void main(String [] args) { 
	   int num = Integer.parseInt(args[0]);
	   double sum = 0;
	   double sum2 = 0;
	   for (int i = 1; i <= num * 2; i += 4) {
			sum = sum + ((double) 1 / i);	
	   }
	   for (int j = 3; j < num * 2; j += 4) {
			sum2 = sum2 - ((double) 1 / j);
	   }

	   double pi = (sum + sum2) * 4;
	   System.out.println("pi according to Java: " + Math.PI);
	   System.out.println("pi, approximated: " + pi);
	}
}
