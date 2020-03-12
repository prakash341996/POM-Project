package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookConformPage extends BaseClass{
	public BookConformPage() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy (id="order_no")
	private WebElement orderNo;
	
	@FindBy (id="search_hotel")
	private WebElement searchHotelBtn;
	
	@FindBy(id="My Itinerary")
	private WebElement myItineraryBtn;
	
	@FindBy (id="logout")
	private WebElement logout;

	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getSearchHotelBtn() {
		return searchHotelBtn;
	}

	public WebElement getMyItineraryBtn() {
		return myItineraryBtn;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
	}