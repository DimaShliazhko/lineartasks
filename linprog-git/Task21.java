package by.htp.task.linprog;

/*
 * дант действительное число R вида nnn.ddd ( три цифрофых разряда в дробной и целой части)
 * поменять местами дробную и целую части числа и вывести полученное значение
 * 
 */

public class Task21 {
	
	public static void main(String[] args) {
		
		double r, temp2;
		double temp1;
		//int temp1;
		r = 789.698;
		System.out.println("исходное число " + r );
		//temp1 = r /1;
		temp2 = r % 1;
		System.out.println(temp2 );
		
		
		temp2 = Math.round (  temp2 * 10e2); /// выделяем дробную часть 
											//и переносим в
											//целую и округляем до ближайшего целого числа
										
		temp1 = (int) r ;
		temp1 = temp1 *10e-4;/// выделяем целую часть и переносим в дробную
		
		
		r = temp2 +temp1;
		System.out.println("результат "+ temp1 +  "  " + temp2 );
		System.out.println("результат " + r );
	}

}
