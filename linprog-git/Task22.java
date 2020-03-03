package by.htp.task.linprog;

/*
 *дано натуральное число T, которое представляет длитольность прошедшего времени
 *в секундах. вывести данное значение длительности в часах, минутах,секундах в 
 *форме HHч MMмин SSс
 * 
 */

public class Task22 {
	
	public static void main(String[] args) {
		
		long t,h, m,s ;
		
		
		t = 15689;
		// находим количество часов
		h = t / 3600;
		// находим количество минут
		System.out.println(h);
		m = (t - (h * 3600))/ 60;
		System.out.println(m);
		s = t- (h * 3600) - (m * 60);
		System.out.println(s);
		System.out.println(t+ " это "+h+"ч "+m+"мин "+s+"c");
	}

}
