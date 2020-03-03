package by.htp.task.linprog;

/* для данных областей составить линейную программу , которая печатает
 * true если точка с координатами (x,y)
 * принадлежит закрашенной области и false- в противном случае
 * 
 * 
 */

public class Task38 {
	
	public static void main(String[] args) {
		
		int x,y;
		x = 1;
		y = 1;
		
		// выполним пункт b для прямоугольников
		
		if (   ((x <= 2)  && (x >= -2) && (y >= 0) && (y <=4)  ) || ((x <= 5)  && (x >= -5) && (y >= -3) && (y <=0)  )   )
		{
			System.out.println("точка "+x+" "+y+" принадлежит плоскости");
		}
		else {
			System.out.println("точка "+x+" "+y+" не принадлежит плоскости");
		}
			
		/// выполним пункт a для треугольника
		
		// точки треугольника
		
		double x1,y1,x2,y2,x3,y3,d1,d2,d3,p,s;
		
		x1 = 4;
		y1 = 0 ;
		x2 = 0;
		y2 = 4;
		x3 = -4;
		y3 = 0;	
		
		// найдем длины сторон
		d1 = Math.sqrt(   Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)    );
		d2 = Math.sqrt(   Math.pow((x2-x3), 2) + Math.pow((y2-y3), 2)    );
		d3 = Math.sqrt(   Math.pow((x1-x3), 2) + Math.pow((y1-y3), 2)    );
		System.out.println("d1= "+d1+" d2= "+d2+" d3= "+d3);
		
		// найдем полупериметр треугольника
		
		p = (d1+ d2 + d3) / 2;
		System.out.println("p = "+p);
		
		// найдем площадь треугольника
	
		s = Math.sqrt(   p * (p-d1) * (p-d2)* (p-d3)  );
		System.out.println("s= "+s);
		// точка принадлежит трегольнику если сумма площадей трех треугольников,
		// которая она образует со сторонами треуголька  равна площади нашего основного треугольника
		
		/// уравнения прямых которые образует наша точка стороны треугольника
		
		double d11,d22,d33,p11,p22,p33,s1,s2,s3;
		d11 = Math.sqrt(   Math.pow((x1-x), 2) + Math.pow((y1-y), 2)    );
		d22 = Math.sqrt(   Math.pow((x2-x), 2) + Math.pow((y2-y), 2)    );
		d33 = Math.sqrt(   Math.pow((x3-x), 2) + Math.pow((y3-y), 2)    );
		
		System.out.println("d11= "+d11+" d22= "+d22+" d33= "+d33);
		
		
		/// найдем площади каждого образованного треугольника
		p11 = (d1+ d11 + d22) / 2;
		s1 = Math.sqrt(   p11 * (p11-d1) * (p11-d11)* (p11-d22)  );
		System.out.println("p11 = "+p11+" s1= "+s1);
		
		p22 = (d2+ d22 + d33) / 2;
		s2 = Math.sqrt(   p22 * (p22-d2) * (p22-d22)* (p22-d33)  );
		System.out.println("p22 = "+p22+" s2= "+s2);
		
		p33 = (d3+ d11 + d33) / 2;
		s3 = Math.sqrt(   p33 * (p33-d3) * (p33-d11)* (p33-d33)  );
		System.out.println("p33 = "+p33+" s3= "+s3);
		
		/// сравним площади
		//System.out.println();
		// чтобы пока не мучаться с погрешностью делаю такое условие , учитывая примерную погрешность
		if (  Math.abs((s -(s1+s2+s3))) <= 0.1 ) {
			System.out.println("точка лежит внутри треугольника");
			
		}
		else {
			System.out.println("точка не лежит внутри треугольника");
			
		}
		
		
		// решим задачу для полуокружностей
		
		// попробуем решить задачу тоже через площади и сравнивая их
		
		double so1,so2,r1,r2,r,sr;
		r1 = 4;
		r2 = 5;
		
		so1 = ((Math.PI *r1*r1) / 2) / 4;
		so2 = ((Math.PI *r2*r2) / 2) / 4;
		System.out.println("so1= "+so1+" so2= "+so2);
		
		// растояние до точки от центра координат
		
		r =  Math.abs( Math.sqrt(   Math.pow((0-x), 2) + Math.pow((0-y), 2)    ));
		System.out.println("r= "+r);
		sr = ((Math.PI *r*r) / 2) / 4; // площадь 1/4 окружности образованной точкой
		
		System.out.println("sr= "+sr);
		
		if ( ((x >= 0) && (y >= 0)  && (sr <= so1 ))  || (  ((x >= 0) && (y <= 0)  && (sr <= so2 ) )   )   ) {
			
			
			System.out.println("точка лежит внутри плоскости");
			
			
		}
		
		else {
			System.out.println("точка не лежит внутри плоскости");
			
		}
		
		
		
		
		
		
		
	}

}
