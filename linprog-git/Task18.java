package by.htp.task.linprog;
/*
 * Дана длина ребра куба. найти площадть грани, площадь полной поверхности
 * и объем этого куба
 * 
 */
public class Task18 {

	
	public static void main(String[] args) {
		
		double h, s;
		h = 10; 
		s = h*h;
		System.out.println("Площадь грани куба равна "+s);
		s = s*6;
		System.out.println("Площадь полной поверхности равна "+s);
		s = Math.pow(h, 3);
		System.out.println("Объем куба равен "+s);
	}
}
