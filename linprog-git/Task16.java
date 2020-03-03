package by.htp.task.linprog;

/*
 * найти произведение цифр заданного четырехзначного числа
 * 
 */

public class Task16 {
	
	public static void main(String[] args) {
		
		int a;
		a = 2345;
		double temp;
	
		double rez;
		rez = 1 ;
		for (int i = 1; i <= 4; i++ ) {
			
	    temp = (a) % 10; // храним остакок от деления
	    a = a / 10; ///храним целую часть
	    
	    System.out.println("остаток от деления " +temp);
	    System.out.println("целая часть "+a);
	    
	    rez = temp *rez; 
		System.out.println("произведение чисел числа равно "+rez);
		}
		
		
	}

}
