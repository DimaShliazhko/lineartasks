package by.htp.task.linprog;

/* дано значение x. получить значения -2x+3x^2-4x^3   и 1+2x+3x^2+4x^3. 
 * позаботьтесь об экономии операций
 * 
 * 
 */

public class Task40 {

	public static void main(String[] args) {
		
		int x, rez;
		x=2;
		
		/// -2x+3x^2-4x^3
		//rez= x* (-2+3*x-4*x*x); 
		rez = -x * (x* (-3+4*x)+2);
		System.out.println(rez);
		
		//1+2*x+3*x^2+4*x^3
		
		//rez = 1+ 2*x+3*x*x+4*x*x*x;
		rez =  x * (x * (3+4*x)+2) +1 ;
		System.out.println(rez);
	}
}
