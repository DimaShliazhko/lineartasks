package by.htp.task.linprog;

/*
 * написать программу которая выводит на экран первые четыре степени числа пи
 * 
 * 
 */

public class Task15 {
	public static void main(String[] args) {
		double rez;
		rez=1;
		
		final double pi = 3.14;
		
		for (int i = 0;i < 4 ;i++ )
		{
			
			rez= Math.pow (pi,i);
			System.out.println("Число пи в " +i+ " -ой степени равно "+ rez );
			
		}
			
		
	}
	
	

}
