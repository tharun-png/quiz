abstract class a{
	void takeoff(){
		System.out.println("a tookoff");
}
	abstract void fly();
		void land(){
			System.out.println("a landed");
}
}
class b extends a{
	void fly(){
		System.out.println("b tookoff");
}
}
class launch1{
	public static void main(String[] args){
		b c=new b();
		c.takeoff();
		c.fly();
		c.land();
		a ref=new a(){
		void fly()
{
			System.out.println("plane flew");
}
};
		ref.fly();
}
}