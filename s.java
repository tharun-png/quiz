abstract class circle{
	abstract void a(int r){

}
}
abstract class rec{
	abstract void b(int l, int br){
}
}
abstract class tri{
	abstract void c(int le, int h){
}
}
class ref1 extends circle{
	void a(int r){
	final double pi=3.14;
	System.out.println("area of circle:"+pi*r*r);
}
}
class ref2 extends rec{
	void a(int l, int br){
	System.out.println("area of rectangle:"+(l*b));
}
}
class ref3 extends tri{
	void a(int le, int h){
	System.out.println("area of triangle:"+(0.5*l*h));
}
}
class s{
	public static void main(String[] args){
		int r=3,l=4,br=6,le=5,h=2;
		ref1 d=new ref1();
		d.circle();
		ref2 e=new ref2();
		e.rec();
		ref3 f=new ref3();
		f.tri();
}
}
		

