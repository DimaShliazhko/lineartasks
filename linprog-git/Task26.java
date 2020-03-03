package by.htp.task.linprog;

/*
 * 
 * найти площадь треугольника, две стороны которого равны a  и  b и угол между ними y 
 * 
 */

public class Task26 {
	
	public static void main(String[] args) {
		
		double a,b,y,s;
		a = 20;
		b = 12.3;
		y = 30;// угол в градусах
		
		s = a * b * 0.5 * Math.sin(   y * 3.14 / 180 );
		
		
		System.out.println("площадь треугольника равна "+s );
	}

}
