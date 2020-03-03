package by.htp.task.linprog;


/* найдите площадь кольца, внутренний радиус которого равен r а внешний  R (R>r)
 * 
 * 
 */
public class Task23 {
		public static void main(String[] args) {
			double r,r1,s,s1;
		final	double pi = 3.14;
			
			r = 11.5;
			r1 = 13.4;
			s = pi * r * r /2; //площадь малого круга
			s1 = pi * r1 * r1 / 2; // площадь большого круга
			System.out.println("площадь кольца равна "+s);
			System.out.println("площадь кольца равна "+s1);
			s =s1 - s; //площадь кольца 
			System.out.println("площадь кольца равна "+s);	
}
}
