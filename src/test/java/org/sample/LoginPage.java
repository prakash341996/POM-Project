package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtUser;
	
	@FindBy(id="password")
	private WebElement txtPwd;
	
	@FindBy(id="login")
	private WebElement logInBtn;
	
	public WebElement getTxtUser() {
		return txtUser;
	}
	public WebElement getTxtPwd() {
		return txtPwd;
	}
	public WebElement getLogInBtn() {
		return logInBtn;
	}
	
	

}
