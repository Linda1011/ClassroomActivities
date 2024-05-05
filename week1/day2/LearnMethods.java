package week1.day2;

public class LearnMethods {
	
	public void browser() {
		System.out.println("Chrome");
	}
	
	private int noOfBicycles() {
		return 2;
	}
	
	public void addNumber(int a, int b) {
		System.out.println(a+b);
	}
	
	public String browser(String name) {
		return name;
	}
	
	//default access modifier
	
	boolean isJavaplatformIndependent() {
		return true;
	}
	
	public static void main(String[] args) {
		
		//ClassName object=new ClassName();
		LearnMethods lm=new LearnMethods();
		lm.addNumber(4, 7);
		lm.browser();
		
		int nb = lm.noOfBicycles();
		System.out.println(nb);
		
		String br=lm.browser("Edge");
		System.out.println(br);
		
		boolean js=lm.isJavaplatformIndependent();
		System.out.println(js);
	}

}
