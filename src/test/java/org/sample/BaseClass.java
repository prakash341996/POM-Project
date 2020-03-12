package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	//browser launch 
	public static   WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAKASH HARIBABU\\Eclipse ide\\Fresh\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		return driver;		
	}
	//get Url Method
	public static void loadurl(String url) {
		driver.get(url);
	}
	//Browser Maximize
	public static void maximize() {
		driver.manage().window().maximize();
	}
	//sendkey method
	public static void type(WebElement element, String name ) {
		element.sendKeys(name);		
	}
	//click
	public static void click(WebElement element) {
		element.click();

	}
	//getAttribute
	public static void getAttribute(WebElement element ) {

		System.out.println(element.getAttribute("value"));
	}
	public static void webdriverWait() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search_hotel")));
	}
	//get title Method
	public static void geTtitle() {
		driver.getTitle();
	}
	//close tab Method
	public static void close() {
		driver.close();
	}
	//get current URL Method
	public static void getcururl() {
		driver.getCurrentUrl();

	}
	//browser method 
	public static void kill() {
		driver.quit();
	}



	//URL navigation
	public static void naviUrl(String url) {
		driver.navigate().to(url);
	}
	//Next Page
	public static void nxtPg() {
		driver.navigate().forward();
	}
	//Previous Page
	public static void prevPg() {
		driver.navigate().back();
	}
	//Refresh Page
	public static void refPg() {
		driver.navigate().refresh();
	}
	//isDisplayed
	public static void isDisply(WebElement element) {

		System.out.println(element.isDisplayed());
	}
	///isSelected
	public static void isSele(WebElement element) {
		System.out.println(element.isSelected());
	}
	//isEnabled
	public static void isEnab(WebElement element) {
		System.out.println(element.isEnabled());
	}

	//findelement method
	public static void fndEleId(String id) {
		driver.findElement(By.id(id));		
	}
	public static void fndEleXpath(String name) {
		driver.findElement(By.xpath(name));		
	}
	//Window Handle
	public static void gtwindhand() {
		System.out.println(driver.getWindowHandle());
	}
	//Window Handles
	public static void gtwindhands() {
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println(allWindowsId);

	}
	//get page source
	public static void getpgesrc() {
		driver.getPageSource();
	}	
	//mouseOver Action
	public static void mouseOv(WebElement element) {
		new Actions(driver).moveToElement(element).perform();

	}
	//dragDrop Method
	public static void dragDrop(WebElement w) {
		new Actions(driver).dragAndDrop(w, w).build().perform();	
	}
	//contect click or right click
	public static void rightClick(WebElement w) {
		new Actions(driver).contextClick(w).perform();

	}
	//double click
	public static void doubleCl(WebElement w) {
		new Actions(driver).doubleClick(w).perform();

	}
	//action sendkeys
	public static void actsndkey(WebElement element, String keys) {
		new Actions(driver).sendKeys(element, keys);

	}
	//action click
	public static void actclick(WebElement element) {
		new Actions(driver).click(element);

	}
	//Select class methods Drop down

	public static void selectbyValue(WebElement element, String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public static void selectbyIndex(WebElement element, int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public static void getoptions(WebElement element ) {
		Select s=new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());

		}
	}	

	public static void getAllSelectedOpt(WebElement element) {
		Select s=new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement allSelected : allSelectedOptions) {
			System.out.println(allSelected.getText());
		}
	}
	public static void getFirstSelectedOpt(WebElement element) {
		Select s=new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();		
		System.out.println(firstSelectedOption.getText());
	}
	public static void isMuliple(WebElement element) {
		Select s=new Select(element);		
		System.out.println(s.isMultiple());
	}

	public static void dSelectByIndex(WebElement element, int index) {
		new Select(element).deselectByIndex(index);
	}
	public static void dSelectByValue(WebElement w, String value) {
		new Select(w).deselectByValue(value);
	}
	public static void dSelectByVisiTxt(WebElement w, String text) {
		new Select(w).deselectByVisibleText(text);
	}

	public static  void dSelectAll(WebElement w) {
		new Select(w).deselectAll();

	}

	public static void noti(WebElement w) {
		new Select(w).notify();
	}
	public static void notiAll(WebElement w) {
		new Select(w).notifyAll();		
	}

	//Robot Enter Key
	public static void Enter() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);		
	}
	//Robot Down Arrow Key
	public static void Down() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);		
	}
	//Robot Up Arrow
	public static void Up() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);		
	}
	//Robot Control + A
	public static void CtrlA() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}
	//Robot Copy
	public static void copy() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}
	//Robot Paste
	public static void paste() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}
	//robot select all text and copy 
	public static void ctrlAC() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}
	//robot select all text and Delete
	public static void ctrlADel() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
	}
	///Robot Tab key
	public static void tab() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	//Robot Control + Tab
	public static void ctrlTab() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}


	//simple Alert
	public static void smpAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
	//confim Alert Accept
	public static void  confimAlertacc() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	//confim Alert Dismiss
	public static void  confimAlertdis() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	//prompt Alert Accept
	public static void  promAlertacc( String value) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
		alert.accept();
	}
	//prompt Alert Dismiss
	public static void  promAlertDis( String value) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
		alert.dismiss();
	}


	//javaScript send key
	public static void jsSendkey(WebElement w, String value) {
		JavascriptExecutor js= (JavascriptExecutor) driver;		
		js.executeScript("arguments[0].setAttribute('value',' "+value+"')", w);
	}
	//javaScript high lighter
	public static void jsHighlighter(WebElement w, String value) {
		JavascriptExecutor js= (JavascriptExecutor) driver;	
		js.executeScript("arguments[0].setAttribute('style','background:green; border:2px solid red')", w);		
	}

	//Java script getAttribute
	public static void jsGetAttribute(WebElement w) {
		JavascriptExecutor js= (JavascriptExecutor) driver;	
		String getAttribute =(String) js.executeScript("arguments[0].getAttribute('value')", w);
		System.out.println(getAttribute);
	}	

	//Java script click

	public static void jsClick(WebElement w) {
		JavascriptExecutor js= (JavascriptExecutor) driver;	
		js.executeScript("arguments[0].click()", w);		
	}

	//Frame string 
	public static void framestr(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	//Frame index
	public static void frameind(int index) {
		driver.switchTo().frame(index);
	}
	//Frame WebElement
	public static void frameelem(WebElement eleme) {
		driver.switchTo().frame(eleme);
	}


	//out from Frame
	public static void frameout() {
		driver.switchTo().defaultContent();
	}
	//out from Parent frame 
	public static void frameoutpra() {
		driver.switchTo().parentFrame();
	}








}









