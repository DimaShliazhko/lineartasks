package by.htp.task.linprog;

/*
 * даны натуральные числа M и N. вывести старшую цифру
 * дробной части  M/N и  младшую цифру целой части M/N
 * 
 * 
 */

public class Task35 {
	
	public static void main(String[] args) {
		
		double m,n,m1,n1;
		 m = 178990;
		 n=56;
		m1 = Math.floor(m/n); // целая часть
		n1 = m % n;// дробная часть
		System.out.println(m1);
		System.out.println(n1);
		m1 = m1 % 10;
		System.out.println("младшая цифра целой части "+m1);
		
		n1 = n1 % 10;
		System.out.println("старшая цифра дробной части "+n1);
		
		
	}

}
