package week1.day2;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		int maxRange=20;
		
		System.out.println("Even Numbers are:");
		for(int i=1; i<=maxRange; i++) {
			
			if(i%2==0) {
				System.out.println(i);
			}
		}
		

	}

}
