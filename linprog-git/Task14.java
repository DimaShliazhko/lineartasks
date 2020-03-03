package by.htp.task.linprog;

/*
 *  вычислить длину окружности и площадь круга одного и того же радиуса R
 * 
 */

public class Task14 {

	public static void main(String[] args) {
		
		double r,l,s;
		r = 3;
		final double pi = 3.1415926536;
		
		l = 2 * pi * r;
		s= pi * r * r;
		
		System.out.println("Длина окружности равна "+l);
		
		System.out.println("Площадь круга равна " +s);
	}
	
	
}
