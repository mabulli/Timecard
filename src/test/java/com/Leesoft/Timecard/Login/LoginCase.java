package com.Leesoft.Timecard.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;


public class LoginCase {
  @BeforeClass
  public void openbrowser() {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.cricbuzz.com/");
  }
}
