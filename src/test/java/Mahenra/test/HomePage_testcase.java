package Mahenra.test;

import org.testng.annotations.Test;

import Core.TestBase;
import Mahendra.main.HomePage;

public class HomePage_testcase extends TestBase{
	HomePage home;
	@Test
	public void clickableaction() {
		home = new HomePage(driver);
	String text=home.offers.getText();
		System.out.println(text);
		
	}
	

}
