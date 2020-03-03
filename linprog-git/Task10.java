package by.htp.task.linprog;
/*
 * вычислить значение выражения по формуле (все переменные 
 * принимают действительные значения)
 * ((sin x + cos y) / (cos x - sin y)  * tg xy 
 * 
 * 
 */


public class Task10 {
	
	public static void main (String [] ars) {  
		double x, y, rez;
		x = 2;
		y = 5;
		double rez1 = Math.sin (x) + Math.cos (y);
		double rez2 = Math.cos (x) - Math.sin (y);
		
		
		rez = (rez1 / rez2)  * ( Math.tan (x * y)); 
		
		System.out.println("Значение выражения равно "+rez);
	}

}
