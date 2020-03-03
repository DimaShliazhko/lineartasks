package by.htp.task.linprog;


/*
 * найти в радианах и в градусах все углы треугольника со сторонами a,b,c
 * 
 */

public class Task29 {
	
	public static void main(String[] args) {
		
		double a,b,c,a1,b1,c1,s,p;
		a = 6 ;
		b = 8;
		c = 10;
		// найдем площадь треугольника
		
		p = (a+b+c) / 2; //полупериметр
		
		s = Math.sqrt  (p * (p - a) * (p - b) * (p - c) ) ;
		System.out.println(s);
		
		c1 = (2 * s)/ (a * b); /// синус гамма
		
		System.out.println(c1);
		c1 = Math.asin (c1);  /// угол гамма
		System.out.println("угол гамма в радианах "+c1);
		c1 = (c1 * 180)/ Math.PI;
		System.out.println("угол гамма в градусах "+c1);
		
		b1 = (2 * s)/ (a * c); /// синус бета
		
		System.out.println(b1);
		b1 = Math.asin (b1); 
				System.out.println("угол бета в радианах "+b1);  /// угол бета
		b1 = (b1 * 180)/ Math.PI;
		System.out.println("угол бета в градусах "+b1);
		
		
		a1 = (2 * s)/ (b * c); /// синус альфа
		
		System.out.println(a1);
		a1 = Math.asin (a1);  /// угол альфа
		System.out.println("угол альфа в  радианах "+a1);
		a1 = (a1 * 180)/ Math.PI;
		System.out.println("угол альфа в градусах "+a1);
	}
	

}
