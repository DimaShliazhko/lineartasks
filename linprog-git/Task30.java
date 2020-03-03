package by.htp.task.linprog;

/*

 * три сопротивления соединены параллельно найдите общее сопротивлениe
 *
 *
 */


  class Task30 {
	  public static void main(String[] args) {
		  double r,r1,r2,r3;
		 
		
		r1 = 3;
		r2 = 4;
		r3 = 5;
		
		r = (1/r1) + (1/r2) + (1/r3);
		
		r = 1/r;
		  
		  System.out.println(" сопротивление цепи равно "+ r);
	}
 

}
