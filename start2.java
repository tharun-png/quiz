class abc{
	public void print_a1(){
		System.out.println("c");
}
}
class b extends abc{
	public void print_a3(){
		System.out.println("java");
}
}
class c extends abc{
	public void print_a4(){
		System.out.println("python");

}
}
class d extends abc{
	public void print_a5(){
		System.out.println("R");
}
}

class start2{
	public static void main(String[] args){
		b e=new b();
		e.print_a1();
		e.print_a3();
		c f=new c();
		f.print_a1();
		f.print_a4();
		d g=new d();
		g.print_a1();
		g.print_a5();
}
}