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
class start{
	public static void main(String[] args){
		b d=new b();
		d.print_a1();
		d.print_a2();
		d.print_a3();
}
}