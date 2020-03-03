package by.htp.task.linprog;

/*
 * 
 *  вычислите корни квадратного уравнения ax^2 + bx + c , с задаными 
 *  коэффициентами a,b,c ( предпологается что a не равно нулю ,
 *   дискриминант уравнения не отрицателен)  
 */

public class Task25 {

	
	public static void main(String[] args) {
		
		
		int a, b,c;
		a = 2;
		b= -7;
		c = 1;
		
		/// найдем дискриминант
		double d, x1,x2 ;
		d =    b * b - 4 * a * c ; 
		System.out.println(d);
		if (d >= 0) {
			
			
			
			x1 = (-b + Math.sqrt(d)) / 2*a;
			x2 = (-b - Math.sqrt(d)) / 2*a;
			System.out.println("первый корень равен "+x1);
			System.out.println("второй корень равен "+x2);

		}
		else {
			
			System.out.println("дискриминант отрицателен");
		}
		
	}
}
