package by.htp.task.linprog;

/*
 *  найдите частное произведений четных и нечетных цифр четырехзначного числа
 * 
 */

public class Task36 {
	
	public static void main(String[] args) {
		
		double a = 1234;
		double m =1 ; //четные
		double n = 1 ; //нечетные
		
		double temp ; // результат
		//a = a % 10;
		System.out.println("исходное число "+a);
		for (int i = 0; i < 4; i++) {
			
			if (((a % 10) % 2) == 0) {
				
				m = m * (a % 10);
				System.out.println("Произведение четных цифр равно "+m);
				
			}
			else {
				n = n * (a % 10);
				System.out.println("Произведение нечетных цифр равно "+n);
				
				
			}
			a = Math.floor(a * 0.1);
			System.out.println(" Исходное число равно "+a);
			
		}
		
		/// находим частное произведений четных и нечетных цифр числа
		
		temp = m/n;
		System.out.println("частное произведений четных и нечетных цифр числа равно "+ temp);
		
	}

}
