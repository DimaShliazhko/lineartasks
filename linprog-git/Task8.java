package by.htp.task.linprog;

/*
 *  вычислить значение выражения по формуле (все переменные принимают 
 *  действительное значение) ((b+sqrt(b^2+4ac))/2a)-a^3c+b^-2
 * 
 * 
 */

public class Task8 {

	public static void main (String [] ars) {
		double a,b,c,rez;
		 a = 2;
		 b = 2;
		 c = 2;
		 rez = ((b + Math.sqrt (    Math.pow (b,2) + 4*a*c    )) / 2 * a ) - (Math.pow(a,3) * c) + (Math.pow(b,-2)) ; 
		
		
		System.out.println("Значение выражения равно "+rez);
		
	}
	
}
