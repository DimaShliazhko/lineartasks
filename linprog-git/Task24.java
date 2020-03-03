package by.htp.task.linprog;

/*
 * наидите площадь равнобедренной трапеции с основаниями a и b 
 * и углом i при большем основании a
 * 
 */

public class Task24 {
	
	public static void main(String[] args) {
		
		double a,b,h,s, i;
		i = 45; 
		a = 15.4;
		b = 10;
		// найдем сторону катета при угле i
		
		double a1;
		a1 = (a - b) / 2;
		System.out.println(a1);
		h =a1 * Math.tan(   i * 3.14 / 180);
		System.out.println(h); 
		s =  h * ( a + b ) / 2;
		System.out.println("площадь трапеции равна "+s);
		
	}

}
