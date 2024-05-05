package week1.day2;

public class LearnSwitchCase {

	public static void main(String[] args) {
		
		String browser="Opera";
		
		switch (browser) {
		case "Chrome":
			System.out.println("Chrome browser launched");
			break;
		case "IE":
			System.out.println("IE browser launched");
			break;
		case "Opera":
			System.out.println("Opera browser is launched");
			break;
		case "Safari":
			System.out.println("Safari browser is launched");
			break;
		case "Firefox":
			System.out.println("Firefox browser is launched");
			break;
		default:
			System.out.println("Edge browser is launched");
			break;
		}

	}

}
