package alistirma;

public class alistirma2 {
	public static void main(String args[]) {
		double res = 0 ;
		for(double a = 1;a<Integer.MAX_VALUE;a++) {
			res = res + 1/(a*a);
		}
		double y = 6 * res ;
		System.out.println(Math.sqrt(y));
		

	}
}
