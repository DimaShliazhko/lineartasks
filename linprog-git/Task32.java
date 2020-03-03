package by.htp.task.linprog;


/* текущее показание электронных часов m ч (0 <= m <= 23) n мин (0 <= n <= 59)
 *  k сек (0 <= k <= 59) 
 * какое время будут показывать часы через p ч q мин t сек
 * 
 * 
 */
public class Task32 {
	public static void main(String[] args) {
		
	
	
	long m,n,k; // текущее показание часов
	 m = 7;
	 n = 58;
	 k = 36;
	 
	 long p,q,t; // время через
	 p = 123;
	 q =443 ;
	 t = 748;
	 
	 /// переведем все время в секунды
	 
	 long s;
	 s = ( p *3600) + ( q  * 60) + t;
	 System.out.println(s);

	 	// переведем в часы, минуты , сеунды
	 long p1,q1,t1; // время через
	 
	 p1 = s / 3600;			// количество часов
	 System.out.println(p1);
	 q1 = (s - (p1 * 3600)) / 60; /// количество минут
	 System.out.println(q1);
	 
	 t1 = s  - (p1 *3600) - (q1* 60);  //количество сеунд
	 System.out.println(t1);
	 
	// переписываем время и рассчитывает показания часов
	 
	 m = (m + p1)  ;
	 n = (n + q1);
	 k = (k + t1);
	 System.out.println("часы будут показывать "+m+ " часов "+n+" минут "+k+" секунд");
	 
	long k1,n1,m1;  //храним остатки от деления
	 
	 k1 = k % 60;	// секунды
	 System.out.println(k1); 
	 n1 = (n + (k / 60)) % 60; // минуты
	 System.out.println(n1);
	 m1 = (m + (n / 60)) % 24; //часы
	 System.out.println(m1);
	 
	 System.out.println("часы будут показывать "+m1+ " часов "+n1+" минут "+k1+" секунд");
	}
	
	 

}
