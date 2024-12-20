package Tharun;

class encapsulation {
	private String name;
	private String color;
	private int age;
	private int cost;
	private String breed;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setCost(int cost) {
		this.cost=cost;
	}
	public int getCost() {
		return cost;
	}
	public void setBreed(String breed) {
		this.breed=breed;
	}
	public String getBreed() {
		return breed;
	}
	
}
class demo{
	public static void main(String args[]) {
		encapsulation e=new encapsulation();
		e.setName("tommy");
		e.setColor("black");
		e.setAge(10);
		e.setCost(10000);
		e.setBreed("shitzu");
		
	}
}
	
