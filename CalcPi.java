public class CalcPi {
	public static void main(String [] args) { 
	   int num = Integer.parseInt(args[0]);
	   int i = 0;
	   double sum = 0;
	   double sign = 1;
	   while (i < num) {
			double pi = sign * 1 / ((i*2)+1);
			sum += pi;
			sign = - sign;
			i++; 
	   } 

	   
	   System.out.println("pi according to Java: " + Math.PI);
	   System.out.println("pi, approximated:     " + (4 * sum));
	}
}
