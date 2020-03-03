package by.htp.task.linprog;

/*дано значение a , не используя никаких функций и никаких операций кроме умножения
 *  получить значение a^5 за три операции a^10 за четыре операции
 * 
 * 
 */

public class Task27 {
	
	
public static void main(String[] args) {
	int a,a1,a2,a3; 
	a =3;
	a1 = a*a;
	System.out.println(a1);
	a2 = a1*a1;
	System.out.println(a2);
	a3 = a2*a;
	System.out.println("a в 5 степени " +a3);
	a3 = a3*a3;
	System.out.println("a в 10 степени " +a3);
}

}
