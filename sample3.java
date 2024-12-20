package Tharun;

public class sample3 {
	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=15;i++) {
			for(int j=15;j>=i;j++) {
				System.out.print(k+" ");
				k+=1;
			}
			System.out.println();
		}
	}

}
