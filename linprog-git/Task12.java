package by.htp.task.linprog;

/*
 * вычислить расстояние между двумя точками с данными координатами (x1,y1)  и (x2,y2)
 * 
 */

public class Task12 {
	
	public static void main (String [] ars) {
		double x1,x2,y1,y2, d;
		x1 = 3;
		x2 = 1.5;
		y1 = 4;
		y2 = -2.5;
		double d1 = Math.pow(  x2-x1 ,2  );
		double d2 = Math.pow(  y2-y1 ,2  );
		

		d =  Math.sqrt(d1 + d2);
		System.out.println ("расстояние между точками равно "+d);
	}
}
