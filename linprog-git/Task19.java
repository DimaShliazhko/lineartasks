package by.htp.task.linprog;

/*
 * дана сторона равностороннего треугольника. найти площадь этого треугольника, 
 * его высоту, радиусы вписанной и описанной окружностей
 * 
 */

public class Task19 {
	
	
	public static void main(String[] args) {
		double a , s,r1,r2 ;
		a = 11;
		
		
		s = Math.sqrt(3) * a * a / 4 ;// площадь правильного треугольника равна
		r1 =  Math.sqrt  ((4 *s) /  (3 *  Math.sqrt(3) )); // радиус описанной окружности
		r2 =   Math.sqrt (s / (3 *  Math.sqrt(3))); //радиус вписанной окружности
		
		System.out.println(" площадь правильного треугольника равна " +s);
		System.out.println(" радиус описанной окружности " +r1);
		System.out.println(" радиус вписанной окружности " +r2);
	}

}
