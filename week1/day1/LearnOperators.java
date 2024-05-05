package week1.day1;

public class LearnOperators {

	public static void main(String[] args) {
		
		int a=5, b=10;
		
		System.out.println("Sum = "+ (a+b));
		System.out.println("Multiplication = "+ (a*b));
		System.out.println("Incrementing a ="+ (a+=3));//a=a+3; 5+3=8
		System.out.println("Is a>b -"+(a>b));//8>10 - false
		System.out.println("Comparison by logical and operator -"+ ((a<b) && (b<a))); //8<10 && 10<8 - false
		System.out.println("Comparison by logical or operator -"+ ((b<a)||(a<b)));
		System.out.println("Assign and increment b- "+(b++)); //b=10+1
		System.out.println("Assign and decrement a- "+(a--)); //a=8-1
		System.out.println("Increment and assign a -"+(++a));//a=7+1=8;
		System.out.println("Increment and assign b -"+(++b));//b=11+1=12
		
	}

}
