class abc{
	public void print_a1(){
		System.out.println("c");
}
	public void print_a2(){
		System.out.println("c++");
}
}
class b extends abc{
	public void print_a3(){
		System.out.println("java");
}
}
class c extends b{
	public void print_a4(){
		System.out.println("python");
}
}
class start1{
	public static void main(String[] args){
		c d=new c();
		d.print_a1();
		d.print_a2();
		d.print_a3();
		d.print_a4();
}
}