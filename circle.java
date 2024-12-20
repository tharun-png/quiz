package Tharun;
import java.util.Scanner;
public class circle {
	double area;
	double radius;
	static double pie;
	{
		pie=3.14;
	}
	void Radius() {
		Scanner sc=new Scanner(System.in);
		System.out.println("radius:");
		radius=sc.nextDouble();
		System.out.println("pie:");
		pie=sc.nextDouble();
	}
	void calculate() {
		area=pie*radius*radius;
	}
	void display() {
		System.out.println("area is:"+area);
	}
}
class cr{
	public static void main(String[] args) {
	circle c=new circle();
	c.Radius();
	c.calculate();
	c.display();
}
}
