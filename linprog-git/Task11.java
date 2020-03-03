package by.htp.task.linprog;

/*
 * 
 * вычислить периметр и площадь прямоугольного треугольника по длинам a и b двух катетов
 * 
 */

public class Task11 {
	
	public static void main (String [] ars) {
		double p,s,a,b;
		a = 1.5;
		b= 3.5;
		s= 0.5 * (a*b);
		double g; /// гипотенуза треугольника
		
		g = Math.sqrt(   Math.pow(a,2) + Math.pow(b,2)   ) ;
		
		p = a + b + g ;
		
		System.out.println ("перимерт равер = "+p+" площадь равна "+s);
		
		
	}

}
