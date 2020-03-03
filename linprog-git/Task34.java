package by.htp.task.linprog;

/*
 * дана величина A , выражающая объем информации в байтах перевести A в более 
 * крупные единицы измерения информации
 * 
 */

public class Task34 {
	
	public static void main(String[] args) {
		
		double b1,b,kb,kb1,mb,mb1,gb,gb1,tb,tb1,pb,pb1;
		b1 = 1024;
		b = 1125899906842624.0;
		kb = b / b1;
		System.out.println (b+" байт это "+kb+ " килобайт ");
		
		mb = b / (b1*b1);
		System.out.println (b+" байт это "+mb+ " мегабайт ");
		
		gb = b / (b1*b1*b1);
		System.out.println (b+" байт это "+gb+ " гигабайт ");
		
		tb = b / (b1*b1*b1*b1);
		System.out.println (b+" байт это "+tb+ " терабайт ");
		
		
		pb = b / (b1*b1*b1*b1*b1);
		System.out.println (b+" байт это "+pb+ " петабайт ");
		
		
	/*	System.out.println (b+ " байт это ");
		kb = Math.floor(b / b1) ; //
		kb1 = (b % b1) ;
		
		System.out.println (kb+" килобайт "+kb1+ " байт ");
		
		
		mb = Math.floor(b / (b1*b1)) ; //
		mb1 = (b % (b1*b1)) ;
		
		System.out.println (mb+" мегабайт "+mb1+ " байт ");
		
		
		gb = Math.floor(b / (b1*b1*b1)) ; //
		gb1 = (b % (b1*b1*b1)) ;
		
		System.out.println (mb+" мегабайт "+mb1+ " байт ");;
		
		//System.out.println(b+" "+kb+" "+mb+" "+gb+" "+tb+" "+pb);
		 * 
		 * */
		 
	}

}
