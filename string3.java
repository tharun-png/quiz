package Tharun;

public class string3 {
	public static void main(String[] args) {
		String a="hello good morning";
		String b="AEIOUaeiou";
		int count=0;
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<b.length();j++) {
				if(a.charAt(i)==b.charAt(j)) {
					count++;
				}}}
				System.out.println("no of vowels:"+count);
			
		}
	
}

