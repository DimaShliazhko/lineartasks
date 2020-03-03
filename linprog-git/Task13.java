package by.htp.task.linprog;

/* заданы координаты трех вершин треугольника (x1,y1), (x2,y2), (x3,y3). Найти его перимент и площадь.
 * 
 * 
 * 
 */

public class Task13 {
	public static void main(String[] args) {
		double x1,x2,x3,y1,y2,y3,p,s,temp1,temp2,temp3,d1,d2;
		x1=2;
		x2=3;
		x3=4;
		
		y1=3;
		y2=6;
		y3=3;
		
		d1 = Math.pow(  x2-x1 ,2  );
		d2 = Math.pow(  y2-y1 ,2  );
		temp1 =  Math.sqrt(d1 + d2);/// длина первой стороны
		
		
		d1 = Math.pow(  x3-x1 ,2  );
		d2 = Math.pow(  y3-y1 ,2  );
		temp2 =  Math.sqrt(d1 + d2);/// длина второй стороны
		
		d1 = Math.pow(  x3-x2 ,2  );
		d2 = Math.pow(  y3-y2 ,2  );
		temp3 =  Math.sqrt(d1 + d2);/// длина третьей стороны
		
		p = temp1 + temp2 + temp3; // периметр треугольника
		System.out.println("Периметр треугольника равен "+p);
		
		/// вычисление площади треугольника, используем формулу герона
		double pp;// полупериметр
		pp = 0.5 * p;
		s = Math.sqrt(   pp * (pp - temp1) * (pp - temp2) * (pp - temp3) );
		
		System.out.println("Площадь треугольника равна "+s);
		
		
	}

}
