package PomPack;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BasePack.BaseClass;

public class PomClass extends BaseClass {

	public static By Signin = By.xpath("//span[text()='Hello, sign in']");

	public void Signin() throws IOException {

		driver.findElement(Signin).click();
		
		TakeScreenShort(driver, "Screen1");

		
	}

	public static By User = By.xpath("//input[@type=\"email\"]");

	public void User() throws IOException {

		driver.findElement(User).sendKeys("Dharakasundar8@gmail.com");
		TakeScreenShort(driver, "Screen2");

	}

	public static By ClickContiue = By.xpath("//input[@id=\"continue\"]");


	public void ClickContiue() throws IOException {

		driver.findElement(ClickContiue).click();
		TakeScreenShort(driver, "Screen3");

	}
	public static By password = By.xpath("//input[@type=\"password\"]");

	public void password() throws IOException {

		driver.findElement(password).sendKeys("Gayathri1");
		TakeScreenShort(driver, "Screen4");

	}

	public static By ClickSigin = By.xpath("//input[@id=\"signInSubmit\"]");

	public void ClickSigin() throws IOException {

		driver.findElement(ClickSigin).click();
		TakeScreenShort(driver, "Screen5");
		quit();

	}
}
