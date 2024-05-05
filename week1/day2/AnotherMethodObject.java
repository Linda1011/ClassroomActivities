package week1.day2;

public class AnotherMethodObject {

	public static void main(String[] args) {
		
		LearnMethods lm=new LearnMethods();
		lm.addNumber(10, 20);
		lm.browser();
		
		String br=lm.browser("Opera");
		System.out.println(br);
		
		boolean js=lm.isJavaplatformIndependent();
		System.out.println(js);

	}

}
