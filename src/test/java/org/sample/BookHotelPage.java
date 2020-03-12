package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass{
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement billAddres;
	
	@FindBy(id="cc_num")
	private WebElement creditCardNo;
	
	@FindBy(id="cc_type")
	private WebElement creditCardType;
	
	
	@FindBy(id="cc_exp_month")
	private WebElement cardExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement cardExpYr;
	
	@FindBy(id="cc_cvv")
	private WebElement cardCVV;
	
	@FindBy(id="book_now")
	private WebElement bookBtn;
	
	@FindBy(id="cancel")
	private WebElement cancelBtn;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillAddres() {
		return billAddres;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getCardExpMonth() {
		return cardExpMonth;
	}

	public WebElement getCardExpYr() {
		return cardExpYr;
	}

	public WebElement getCardCVV() {
		return cardCVV;
	}

	public WebElement getBookBtn() {
		return bookBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

}








