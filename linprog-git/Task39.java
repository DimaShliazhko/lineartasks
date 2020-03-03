package by.htp.task.linprog;

/*
 * дано действительное число x. не пользуясь никакими другими арифмитическими операциями кроме 
 * умножения , сложения , вычитания вычислите за минимальное число операций
 * 
 * 2x^4-3x^3+4x^2-5x+6
 * 
 */

public class Task39 {

	
public static void main(String[] args) {
	
	int x, rez;
	x = 2;
	rez =  x*(x*(x*(2*x-3)+4)-5)+6  ;
	//rez = 2*x*x*x*x-3*x*x*x+4*x*x-5*x+6;
	
	System.out.println(rez);
}
}
