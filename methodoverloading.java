package Tharun;

public class methodoverloading {
	void add(int x,int y) {
		System.out.println(i+j);
	}
	void add(int i) {
		System.out.println(2+i);
	}
class demo{
	methodoverload v=new overload();
	public static void main(String[] args) {
		int a=10;
		int b=15;
		v.add(a);
		v.add(a,b);
	}

}
}