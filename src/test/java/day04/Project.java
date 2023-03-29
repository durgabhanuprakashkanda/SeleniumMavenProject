 package day04;

public class Project extends Framework{

	public static void main(String[] args) throws Exception {
		startReport("demoapplication");
		startTest("demo", "testing application");
		browser("edge");
		appUrl("https://accounts.google.com/signup");
		typeIn("firstName");
		typeIn("lastName");
		clickIn("showPassword");
		clearAll("firstName");
		endTest();
		endReport();
	}

}
