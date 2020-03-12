package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement roomnos;
	
	@FindBy(name="datepick_in")
	private WebElement checkInDate;
	
	@FindBy(id="datepick_out")
	private WebElement checkOutDate;
	
	
	@FindBy(id="adult_room")
	private WebElement adultcountRoom;
	
	@FindBy(id="child_room")
	private WebElement childCountRoom;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	@FindBy(id="Reset")
	private WebElement reset;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultcountRoom() {
		return adultcountRoom;
	}

	public WebElement getChildCountRoom() {
		return childCountRoom;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getReset() {
		return reset;
	}
	
	
	

}
