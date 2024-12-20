import java.util.Scanner;
 public class Quiapp{
	public static boolean Answer(char f,int i) {
		char[] a={'n','a','b','b','c','d','a','c','a','d','b'};
		if(f==a[i]) {
			System.out.println("correct");
		}
		else {
			System.out.println("wrong");
		}
		return false;
	}
	public static void disp(String str1,String str2,double count) {
		System.out.println("..your results details..");
		System.out.println(str2);
		System.out.println(str1);
		double per=count/10.0*100;
	}
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Quiz"); 
		String str1=new String();
		System.out.println("Enter the name ");
		String str2=sc.next();
		System.out.println("Enter the Roll no ");
		String str=sc.next();
		System.out.println("are you ready to participate y/n");
		char a=sc.next().charAt(0);
		if(a=='y') {
		System.out.println("all the best");	
		}
		else {
			System.out.println("exit(0)");
		}
		System.out.println("rules");
		System.out.println("Start first with 4 operations and 2 lines");
		System.out.println("remember the lines can be used only once");
		System.out.println("If the user gives the wrong answer and exam will be over");
	int i=1;
	double count=0;
	if(a==1) {
		System.out.println("correct");
	}
	else {
		System.out.println("wrong");
	}
	while(i<11) {
		switch(i) {
			case 1:
				System.out.println("how many variables in java?");
				System.out.println("a)3"+"\t\t"+"b)4"+"\n"+"c)2"+"\t\t"+"d)5");
				char x=sc.next().charAt(0);
				if(x=='a'||x=='b'||x=='c'||x=='d') {
					if(Answer(x,i)) {
						count++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
					}
				
				
			case 2:
				System.out.println("how many types of loops in java?");
				System.out.println("a)3"+"\t\t"+"b)4"+"\n"+"c)2"+"\t\t"+"d)5");
				char y=sc.next().charAt(0);
				if(y=='a'||y=='b'||y=='c'||y=='d') {
					if(Answer(y,i)) {
						count++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
					}
			case 3:
				System.out.println("how many types osf conditionala statemanents?");
				System.out.println("a)3"+"\t\t"+"b)4"+"\n"+"c)2"+"\t\t"+"d)5");
				char z=sc.next().charAt(0);
				if(z=='a'||z=='b'||z=='c'||z=='d') {
					if(Answer(z,i)) {
						count++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
					}
			case 4:
				System.out.println("how many oparaters in java?");
				System.out.println("a)3"+"\t\t"+"b)4"+"\n"+"c)8"+"\t\t"+"d)5");
				char r=sc.next().charAt(0);
				if(r=='a'||r=='b'||r=='c'||r=='d') {
					if(Answer(r,i)) {
						count++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
					}
				
			case 5:
				System.out.println("types of arethemetic operations?");
				System.out.println("a)3"+"\t\t"+"b)4"+"\n"+"c)8"+"\t\t"+"d)5");
				char e=sc.next().charAt(0);
				if(e=='a'||e=='b'||e=='c'||e=='d') {
					if(Answer(e,i)) {
						count++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
					}
			
			case 6:
				System.out.println("how many types of strings in java?");
				System.out.println("a)2"+"\t\t"+"b)4"+"\n"+"c)8"+"\t\t"+"d)5");
				char h=sc.next().charAt(0);
				if(h=='a'||h=='b'||h=='c'||h=='d') {
					if(Answer(h,i)) {
						count++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
					}
			case 7:
				System.out.println("types of polymorphism?");
				System.out.println("a)3"+"\t\t"+"b)4"+"\n"+"c)2"+"\t\t"+"d)5");
				char u=sc.next().charAt(0);
				if(u=='a'||u=='b'||u=='c'||u=='d') {
					if(Answer(u,i)) {
						count++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
					}
				
			case 8:
				System.out.println("how many members in static key word?");
				System.out.println("a)3"+"\t\t"+"b)4"+"\n"+"c)2"+"\t\t"+"d)5");
				char l=sc.next().charAt(0);
				if(l=='a'||l=='b'||l=='c'||l=='d') {
					if(Answer(l,i)) {
						count++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
					}
				
			case 9:
				System.out.println("how many types of chain in constructers in java? ");
				System.out.println("a)3"+"\t\t"+"b)4"+"\n"+"c)6"+"\t\t"+"d)2");
				char s=sc.next().charAt(0);
				if(s=='a'||s=='b'||s=='c'||s=='d') {
					if(Answer(s,i)) {
						count++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
					}
			
			case 10:
				System.out.println("how many rules in interface in java?");
				System.out.println("a)15"+"\t\t"+"b)16"+"\n"+"c)19"+"\t\t"+"d)2");
				char d=sc.next().charAt(0);
				if(d=='a'||d=='b'||d=='c'||d=='d') {
					if(Answer(d,i)) {
						count++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}				
		}
	}
	}
	}