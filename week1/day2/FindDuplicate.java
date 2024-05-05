package week1.day2;

public class FindDuplicate {

	public static void main(String[] args) {
		
		int[] age= {17,32,45,34,32,34,55,17};
		int size=age.length;
		
		System.out.println("Duplicate values are: ");
		//outer loop
		for(int i=0; i<size; i++) {
			
		//inner loop
			for(int j=i+1; j<size; j++) {
				if(age[i]==age[j]) {
					System.out.println(age[j]);
				}
			}
		}

	}

}
