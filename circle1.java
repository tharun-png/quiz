package Tharun;

public class circle1 {
	abstract  class shapes{
		abstract void collect();
		abstract void calculate();
		abstract void display();
	}
	class circle{
		void collect(){
			double radius=4;
			double pi=3.14;
			double area;
	}
		void calculate(){
		area=pi*radius*radius;
	}
		void display(){
			System.out.println("area of circle is:"+area);

	}
	}
	class rectangle{
		void collect(){
			int base;
			int len=10;
			int bre=20;
	}
		void calculate(){
			base=len*bre;
	}
		void display(){
		System.out.println("area of rectangle:"+base);
	}
	}
	class triangle{
		void collect(){
			int ar;
			int length=12;
			int breadth=13;
	}
		void calculate(){
			ar=1/2*length*breadth;
	}
		void display(){
			System.out.println("area of triangle:"+ar);
	}
	}
	class area1{
		public static void main(String[] args){
			circle c=new circle();
			c.collect();
			c.calculate();
			c.display();

			rectangle r=new rectangle();
			r.collect();
			r.calculate();
			r.display();

			triangle t=new triangle();
			t.collect();
			t.calculate();
			t.display();
	}
	}
			

}
