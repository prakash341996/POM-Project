package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement selectHotel;
	
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	@FindBy(id="cancel")
	private WebElement cancelBtn;
	
	
	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	
	

}
