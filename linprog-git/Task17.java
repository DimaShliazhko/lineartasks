package by.htp.task.linprog;

/*даны два числа. Найти среднее арифметическое 
 *кубов этих чисел и среднее геометрическое модулей этих чисел 
 * 
 * 
 */

public class Task17 {
	
	public static void main(String[] args) {
		
		int a,b; //два наших числа
		double rez;
		a = -3;
		b = 4;
		
		rez = (Math.pow(a, 3) + Math.pow(b, 3)) / 2; /// среднее арифмитическое кубов чисел A и b 
		
		
		System.out.println("среднее арифмитическое кубов чисел a и b "+rez);
		
		
		rez = Math.pow(    (Math.abs(a) * Math.abs(b)   )   , 1.0/3);
		System.out.println(" среднее геометрическое модулей чисел a и b "+rez);
				
		
	}

}
