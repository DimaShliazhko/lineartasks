package by.htp.task.linprog;

/*
 * составте програму перевода радианной меры угла в градусы, минуты и секунды
 * 
 */

public class Task28 {

	public static void main(String[] args) {
		
		double r,g,m,s;
		r = 2;
		// перевод в градусы
		g = 180 *r / 3.14;
		System.out.println(r+ " радииан это "+g+" градусов");
		
		m = r * 60 * 180 / 3.14;
		System.out.println(r+ " радииан это "+m+" минут");
		
		s = m * 60;
		System.out.println(r+ " радииан это "+s+" секунд");
		
		

	}
	
}
