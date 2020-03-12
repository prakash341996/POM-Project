package org.sample;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample extends BaseClass{
	public static void main(String[] args) {
		getdriver();
		//LoginPage
		LoginPage login =new LoginPage();
		loadurl("https://adactin.com/HotelApp/");
		type(login.getTxtUser(), "harihari");
		type(login.getTxtPwd(), "Hari@1967");
		click(login.getLogInBtn());
		//SearchHotel Page
		SearchHotelPage hotelSearch =new SearchHotelPage();
		selectbyIndex(hotelSearch.getLocation(), (2));
		selectbyIndex(hotelSearch.getHotel(), (3));
		selectbyIndex(hotelSearch.getRoomType(), (2));
		selectbyIndex(hotelSearch.getRoomnos(), (2));
		selectbyValue(hotelSearch.getAdultcountRoom(), "2");
		selectbyIndex(hotelSearch.getChildCountRoom(), (2));
		click(hotelSearch.getSearch());
		//SelectHotel Page
		SelectHotelPage selectHotel = new SelectHotelPage();
		click(selectHotel.getSelectHotel());
		click(selectHotel.getContinueBtn());
		//BookHotel Page
		BookHotelPage bookHotel= new BookHotelPage();
		type(bookHotel.getFirstName(), "Prakash");
		type(bookHotel.getLastName(), "H");
		type(bookHotel.getBillAddres(), "Chennai");
		type(bookHotel.getCreditCardNo(), "1234567890123456");		
		selectbyIndex(bookHotel.getCreditCardType(), (3));		
		selectbyIndex(bookHotel.getCardExpMonth(), (2));
		selectbyValue(bookHotel.getCardExpYr(), "2022");
		type(bookHotel.getCardCVV(), "345");
		click(bookHotel.getBookBtn());
		
		webdriverWait();		
		//Booking Confirmation Page
		BookConformPage bookingConform= new BookConformPage();
		getAttribute(bookingConform.getOrderNo());
		click(bookingConform.getLogout());
	}







	}
