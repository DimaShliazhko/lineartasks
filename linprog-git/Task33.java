package by.htp.task.linprog;

/*
 * 
 * вывести любой символ и определить его порядковый номер
 * , а так же указать предыдущий и последущий символы
 * 
 * 
 */

public class Task33 {

	
	public static void main(String[] args) {
		
		char x;
		int sim;
		x = 'b';
		sim = (int)x;
			
		System.out.println(x);
		System.out.println("код исходный символ "+sim);
		
		System.out.println("последующий символ "+(char)(sim+1));
		
		System.out.println("предыдущего символ "+(char)(sim-1));
	}
}
