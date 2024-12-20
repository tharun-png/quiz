package Tharun;
import java.util.Scanner;
public class str {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a="good";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b+=a.charAt(i);
		}
		System.out.println(b);
	}
}
