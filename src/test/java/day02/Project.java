package day02;

public class Project extends Framework{

	public static void main(String[] args) {
		startReport("demoapplication");
		startTest("demo", "testing application");
		browser("edge");
		appUrl("https://accounts.google.com/signup");
		typeIn("//input[@name='firstName']", "testA","firstName");
		typeIn("//input[@name='lastName']", "testA","lastName");
		clickIn("//input[@type='checkbox']","showPassword");
		clearAll("//input[@name='firstName']","firstName");
		endTest();
		endReport();
	}

}