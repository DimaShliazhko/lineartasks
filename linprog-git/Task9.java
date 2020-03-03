package by.htp.task.linprog;

/*  вычислить значение выражения по формуле (все переменные принимают 
 *  действительное значение) (a/c) * (b/d) - ((ab-c)/cd)
 * 
 * 
 */

public class Task9 {
	
	public static void main (String [] ars) {  
		double a,b,c,d,rez;
		a = 1;
		b = 2;
		c = 3;
		d = 4;
		rez = ( a / c ) * ( b / d ) - ((a * b - c) / c * d);
				 
		
		
		
		System.out.println("Значение выражения равно "+rez);
	}

}
