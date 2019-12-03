package Business_Methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.codoid.products.exception.FilloException;

import Object_Repository.AuthoriseOverride;
import Object_Repository.Loginpage;
import Object_Repository.Middleorder;
import Object_Repository.Modelbankpage;
import Object_Repository.Openorder;
import Object_Repository.SecTrade;
import Utilities.Commonmethods;
import Utilities.ExcelRead;
import Utilities.Reports;

public class SellOrder extends Basesetupdriver {

	String OrderNumber = "";
	String ParentWindow = "";
	int minWait = 1000, medWait = 5000, maxWait = 13000;

	public static Map<String, String> mp = new HashMap<String, String>();
	ExcelRead read = new ExcelRead();

	public void Login(String arg1, String arg2) throws Throwable, Throwable {
		System.out.println("Front office - Maker");
		Reports.CreateTest("Login Page");
		ParentWindow = Basesetupdriver.driver.getWindowHandle();
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Loginpage.username),
				read.readexcel().getField("Username"));
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Loginpage.password),
				read.readexcel().getField("Password"));
	}

	public void signIn() throws InterruptedException {
		Commonmethods.click(Basesetupdriver.driver.findElement(Loginpage.signine));
		Thread.sleep(medWait);
		Basesetupdriver.driver.switchTo().alert().dismiss();
		Thread.sleep(minWait);
		System.out.println("Front office - Maker Login : Successful");
	}

	public void newOrderInitiation() throws InterruptedException, AWTException {
		Reports.CreateTest("New Order Page");
		Basesetupdriver.driver.switchTo().window(ParentWindow);
		Thread.sleep(medWait);
		String text = "SEC.OPEN.ORDER";

		Basesetupdriver.driver.switchTo().frame(1);
		Basesetupdriver.driver.switchTo().activeElement().sendKeys("SEC.OPEN.ORDER \n ");

		Thread.sleep(medWait);

		Set<String> parentwindow = driver.getWindowHandles();
		int cnt = 0;
		for (String newwindow : parentwindow) {
			driver.switchTo().window(newwindow);
			cnt = cnt + 1;
		}
		Thread.sleep(minWait);
		Commonmethods.click(Basesetupdriver.driver.findElement(Openorder.newdeal));
		Thread.sleep(medWait);
		System.out.println("Initiate New Order : Successful");
		String value = Basesetupdriver.driver.findElement(Modelbankpage.text3).getText();
		System.out.println("New Order Number : "+value);
		mp.put("frontOfficeNum", value);
	}

	public void orderDetails() throws Throwable, Throwable {
		Thread.sleep(minWait);
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Openorder.orderdate),
				read.readexcel().getField("orderdate"));
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Openorder.ordertype),
				read.readexcel().getField("ordertype"));
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Openorder.transactioncode),
				read.readexcel().getField("transactioncode1"));
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Openorder.custnumber),
				read.readexcel().getField("custnumber"));
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Openorder.nonominal),
				read.readexcel().getField("nonominal"));
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Openorder.depository),
				read.readexcel().getField("depository"));
		Commonmethods.selectByValue(Basesetupdriver.driver.findElement(Openorder.dealstatus),
				read.readexcel().getField("dealstatus"));
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Openorder.securityno),
				read.readexcel().getField("securityno"));
		Thread.sleep(minWait);
		System.out.println("Enter Sell Order Details : Successful");
	}

	public void orderValidate() throws InterruptedException {
		Commonmethods.click(Basesetupdriver.driver.findElement(Openorder.validate));
		Thread.sleep(medWait);
		OrderNumber = Commonmethods.GetText(Basesetupdriver.driver.findElement(Openorder.ordernum));
		System.out.println("Validate Order Details : Successful");
	}

	public void commitFrontOffice() throws InterruptedException, AWTException {
		Commonmethods.click(Basesetupdriver.driver.findElement(Openorder.commit));
		Thread.sleep(medWait);
		try {
			Commonmethods.click(Basesetupdriver.driver.findElement(AuthoriseOverride.acceptoverride));
		} catch (Exception e) {
			System.out.println("Override not available");
		}
		System.out.println("Front office - Maker commit the deal : Successful");
		Basesetupdriver.driver.close();
		Set<String> parentwindow1 = Basesetupdriver.driver.getWindowHandles();
		int cnt1 = 0;
		for (String newwindow1 : parentwindow1) {
			Basesetupdriver.driver.switchTo().window(newwindow1);
			cnt1 = cnt1 + 1;
		}

		Basesetupdriver.driver.switchTo().frame(1);

		Thread.sleep(medWait);
		Basesetupdriver.driver.navigate().refresh();
		Thread.sleep(medWait);
		System.out.println("Front office - Maker Logout : Successful");
		System.out.println("------------------------------------------------------------");
	}

	public void frontOfficeApproverLogin() throws Throwable, Throwable {
		System.out.println("Front office - Checker");
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Loginpage.username),
				read.readexcel().getField("Username1"));
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Loginpage.password),
				read.readexcel().getField("Password1"));
		Commonmethods.click(Basesetupdriver.driver.findElement(Loginpage.signine));
		Thread.sleep(minWait);
		System.out.println("Front office - Checker Login : Successful");
		Thread.sleep(minWait);
		Basesetupdriver.driver.switchTo().alert().dismiss();
		Thread.sleep(medWait);
	}

	public void enterFrontOfficeTxnNum() throws AWTException, InterruptedException {

		String frontOfficeNum = mp.get("frontOfficeNum");

		Basesetupdriver.driver.switchTo().frame(1);
		Basesetupdriver.driver.switchTo().activeElement().sendKeys("SEC.OPEN.ORDER A " + frontOfficeNum + " \n ");
		Thread.sleep(medWait);
		System.out.println("Enter Order Number : Successful");
	}

	public void approveFrontOfficeTxn() throws InterruptedException {
		Set<String> parentwindow5 = driver.getWindowHandles();
		int cnt5 = 0;
		for (String newwindow5 : parentwindow5) {
			driver.switchTo().window(newwindow5);
			cnt5 = cnt5 + 1;
		}

		Basesetupdriver.driver.manage().window().maximize();

		Thread.sleep(medWait);
		Commonmethods.click(Basesetupdriver.driver.findElement(AuthoriseOverride.authoricesdeal));
		Thread.sleep(medWait);
		System.out.println("Front office - Checker authorize the deal : Successful");
		Basesetupdriver.driver.close();
		Thread.sleep(medWait);

		Set<String> parentwindow1 = Basesetupdriver.driver.getWindowHandles();
		int cnt1 = 0;
		for (String newwindow1 : parentwindow1) {
			Basesetupdriver.driver.switchTo().window(newwindow1);
			cnt1 = cnt1 + 1;
		}

		Thread.sleep(medWait);
		Basesetupdriver.driver.navigate().refresh();
		Thread.sleep(medWait);
		System.out.println("Front office - Checker Logout : Successful");
		System.out.println("------------------------------------------------------------");
	}

	public void approveSellFrontOfficeTxn() throws InterruptedException {
		Set<String> parentwindow5 = driver.getWindowHandles();
		int cnt5 = 0;
		for (String newwindow5 : parentwindow5) {
			driver.switchTo().window(newwindow5);
			cnt5 = cnt5 + 1;
		}

		Basesetupdriver.driver.manage().window().maximize();

		Thread.sleep(medWait);
		Commonmethods.click(Basesetupdriver.driver.findElement(AuthoriseOverride.authoricesdeal));
		Thread.sleep(medWait);
		System.out.println("Front office - Checker authorize the deal : Successful");
		Basesetupdriver.driver.close();
		Thread.sleep(medWait);

		Set<String> parentwindow1 = Basesetupdriver.driver.getWindowHandles();
		int cnt1 = 0;
		for (String newwindow1 : parentwindow1) {
			Basesetupdriver.driver.switchTo().window(newwindow1);
			cnt1 = cnt1 + 1;
		}

		Thread.sleep(medWait);
		Basesetupdriver.driver.navigate().refresh();
		Thread.sleep(medWait);
		System.out.println("Front office - Checker Logout : Successful");
		System.out.println("------------------------------------------------------------");
		Basesetupdriver.driver.quit();
		System.out.println("Sell Order processed : Successful");
		System.out.println("Process completed");
		System.out.println("############################################################");
	}

	// Middle Office

	public void middleOfficeInitiation() throws FilloException, Throwable {
		System.out.println("Middle office - Maker");
		Reports.CreateTest("Middle Office");
//		Basesetupdriver.driver.get("http://10.1.1.5:9089/BrowserWeb/servlet/BrowserServlet");
		Thread.sleep(medWait);
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Loginpage.username),
				read.readexcel().getField("Username1"));
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Loginpage.password),
				read.readexcel().getField("Password1"));
		Commonmethods.click(Basesetupdriver.driver.findElement(Loginpage.signine));
		Thread.sleep(minWait);
		System.out.println("Middle office - Maker Login : Successful");

		Basesetupdriver.driver.switchTo().alert().dismiss();
		Thread.sleep(medWait);
	}

	public void middleOfficeCommand() throws AWTException, InterruptedException {
		String middleOfficeCommand = "SC.EXE.SEC.ORDERS";
		Basesetupdriver.driver.switchTo().frame(1);
		Basesetupdriver.driver.switchTo().activeElement().sendKeys("SC.EXE.SEC.ORDERS \n ");
		Thread.sleep(medWait);
		System.out.println("Enter the Middle Office Initiation command : Successful");

		Set<String> parentwindow = driver.getWindowHandles();
		int cnt = 0;
		for (String newwindow : parentwindow) {
			driver.switchTo().window(newwindow);
			cnt = cnt + 1;
		}
		Thread.sleep(medWait);

		String transactionNumber = mp.get("frontOfficeNum");
		Basesetupdriver.driver.switchTo().frame(1);
		Thread.sleep(minWait);
		Basesetupdriver.driver.switchTo().activeElement().sendKeys(transactionNumber + " \n ");
		Thread.sleep(medWait);
		System.out.println("Enter the Front Office Number : Successful");
	}

	public void enterDetails() throws Throwable, Throwable {
		Set<String> parentwindow9 = driver.getWindowHandles();
		int cnt9 = 0;
		for (String newwindow9 : parentwindow9) {
			driver.switchTo().window(newwindow9);
			cnt9 = cnt9 + 1;
		}

		Basesetupdriver.driver.manage().window().maximize();
		Thread.sleep(maxWait);
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Middleorder.brokerno1),
				read.readexcel().getField("brokerno1"));
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Middleorder.brokertype1),
				read.readexcel().getField("brokertype1"));
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Middleorder.price1),
				read.readexcel().getField("price1"));
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Middleorder.deliveryinstr),
				read.readexcel().getField("deliveryinstr"));
		System.out.println("Middle office - Maker enter the details : Successful");
	}

	public void commitMiddleOffice() throws InterruptedException, AWTException {
		Commonmethods.click(Basesetupdriver.driver.findElement(Middleorder.commitTheDeal));
		Thread.sleep(medWait);
		try {
			Commonmethods.click(Basesetupdriver.driver.findElement(Middleorder.acceptOverrides));
		} catch (Exception e) {
			System.out.println("No accept Overrides ");
		}
		System.out.println("Middle office - Maker commit the deal : Successful");
		Thread.sleep(medWait);
		Basesetupdriver.driver.close();
		Set<String> parentwindow10 = driver.getWindowHandles();
		int cnt10 = 0;
		for (String newwindow10 : parentwindow10) {
			driver.switchTo().window(newwindow10);
			cnt10 = cnt10 + 1;
		}
		Basesetupdriver.driver.navigate().refresh();
		System.out.println("Middle office - Maker Logout : Successful");
		Thread.sleep(medWait);
		System.out.println("------------------------------------------------------------");
	}

	public void middleOfficeApproverLogin() throws Throwable, Throwable {
		System.out.println("Middle office - Checker");
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Loginpage.username),
				read.readexcel().getField("Username"));
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Loginpage.password),
				read.readexcel().getField("Password"));
		Commonmethods.click(Basesetupdriver.driver.findElement(Loginpage.signine));
		Thread.sleep(minWait);
		System.out.println("Middle office - Checker Login : Successful");
		Thread.sleep(minWait);
		Basesetupdriver.driver.switchTo().alert().dismiss();
		Thread.sleep(minWait);
	}

	public void enterMiddleOfficeTxnNum() throws AWTException, InterruptedException {
		String frontOfficeNum = mp.get("frontOfficeNum");
		String text3 = "SC.EXE.SEC.ORDERS A " + frontOfficeNum;
		Basesetupdriver.driver.switchTo().frame(1);
		Basesetupdriver.driver.switchTo().activeElement().sendKeys("SC.EXE.SEC.ORDERS A " + frontOfficeNum + " \n ");
		Thread.sleep(medWait);
		System.out.println("Enter Order Number : Successful");
	}

	public void executeMiddleOffice() throws InterruptedException {
		Set<String> parentwindow11 = driver.getWindowHandles();
		int cnt11 = 0;
		for (String newwindow11 : parentwindow11) {
			driver.switchTo().window(newwindow11);
			cnt11 = cnt11 + 1;
		} 
		
		Basesetupdriver.driver.manage().window().maximize();
		Thread.sleep(medWait);
		Commonmethods.click(Basesetupdriver.driver.findElement(AuthoriseOverride.authoricesdeal));
		Thread.sleep(medWait);
		System.out.println("Middle Office - Checker authorize the deal : Successful");
	}

	public void fetchSecurityTxnNum() throws AWTException, InterruptedException {
		String transactionNumber1 = mp.get("frontOfficeNum");
		Basesetupdriver.driver.switchTo().frame(1);
		Basesetupdriver.driver.switchTo().activeElement().sendKeys(transactionNumber1);

		Set<String> parentwindow10 = Basesetupdriver.driver.getWindowHandles();
		int cnt10 = 0;
		for (String newwindow10 : parentwindow10) {
			Basesetupdriver.driver.switchTo().window(newwindow10);
			cnt10 = cnt10 + 1;
		}

		Commonmethods.click(Basesetupdriver.driver.findElement(Middleorder.viewAContract));
		Thread.sleep(maxWait);
		String middleOfficeAuthorizationNum = Commonmethods
				.GetText(Basesetupdriver.driver.findElement(Middleorder.secTradeId_1_1));
		Thread.sleep(medWait);
		System.out.println("Security Transaction Number : " + middleOfficeAuthorizationNum);
		mp.put("middleOfficeNum", middleOfficeAuthorizationNum);
		Thread.sleep(medWait);
		Basesetupdriver.driver.close();
		Thread.sleep(medWait);

		Set<String> parentwindow11 = Basesetupdriver.driver.getWindowHandles();
		int cnt11 = 0;
		for (String newwindow10 : parentwindow11) {
			Basesetupdriver.driver.switchTo().window(newwindow10);
			cnt11 = cnt11 + 1;
		}

		Thread.sleep(medWait);
		Basesetupdriver.driver.navigate().refresh();
		Thread.sleep(medWait);
		System.out.println("Middle office - Checker Logout : Successful");
		System.out.println("------------------------------------------------------------");
	}

	// ----------Back Office--------

	public void backOfficeInitiation() throws FilloException, Throwable {
		System.out.println("Back office - Maker");	

		String backOfficeCommand = "SEC.TRADE";

		System.out.println("Front office - Checker");
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Loginpage.username),
				read.readexcel().getField("Username"));
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Loginpage.password),
				read.readexcel().getField("Password"));
		Commonmethods.click(Basesetupdriver.driver.findElement(Loginpage.signine));
		Thread.sleep(minWait);
		
		System.out.println("Back office - Maker Login : Successful");

		Basesetupdriver.driver.switchTo().alert().dismiss();
		Thread.sleep(medWait);

		Basesetupdriver.driver.switchTo().frame(1);
		Basesetupdriver.driver.switchTo().activeElement().sendKeys("SEC.TRADE \n ");

		Thread.sleep(medWait);

	}

	public void enterSecurityTxnNum() throws AWTException, InterruptedException {
		Set<String> parentwindow17 = driver.getWindowHandles();
		int cnt17 = 0;
		for (String newwindow17 : parentwindow17) {
			Basesetupdriver.driver.switchTo().window(newwindow17);
			cnt17 = cnt17 + 1;
		}

		Basesetupdriver.driver.manage().window().maximize();
		Thread.sleep(minWait);
		String middleOfficeNum = mp.get("middleOfficeNum");
		
		Basesetupdriver.driver.switchTo().frame(1);
		Basesetupdriver.driver.switchTo().activeElement().sendKeys(middleOfficeNum + " \n ");

		Thread.sleep(medWait);
		System.out.println("Enter Security Transaction Number : Successful");

	}

	public void commitBackOffice() throws InterruptedException, AWTException { //
		Thread.sleep(1000); 
		Thread.sleep(medWait);
		Commonmethods.click(Basesetupdriver.driver.findElement(SecTrade.commitTheDeal));
		Thread.sleep(medWait);

		try {
			Commonmethods.click(Basesetupdriver.driver.findElement(SecTrade.acceptOverrides));
		} catch (Exception e) {
			System.out.println("No accept Overrides ");
		}
		System.out.println("Back Office - Maker commit the deal : Successful");
		Thread.sleep(medWait);
		Basesetupdriver.driver.close();
		Thread.sleep(maxWait);

		Set<String> parentwindow11 = Basesetupdriver.driver.getWindowHandles();
		int cnt11 = 0;
		for (String newwindow10 : parentwindow11) {
			Basesetupdriver.driver.switchTo().window(newwindow10);
			cnt11 = cnt11 + 1;
		}

		Thread.sleep(medWait);
		Basesetupdriver.driver.navigate().refresh();
		Thread.sleep(medWait);
		System.out.println("Back office - Maker Logout : Successful");
		System.out.println("------------------------------------------------------------");
	}

	public void executeBackOffice() throws Throwable, Throwable {
		Set<String> parentwindow26 = driver.getWindowHandles();
		int cnt26 = 0;
		for (String newwindow22 : parentwindow26) {
			driver.switchTo().window(newwindow22);
			cnt26 = cnt26 + 1;
		}
		System.out.println("Back office - Checker");
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Loginpage.username),
				read.readexcel().getField("Username1"));
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(Loginpage.password),
				read.readexcel().getField("Password1"));
		Commonmethods.click(Basesetupdriver.driver.findElement(Loginpage.signine));
		Thread.sleep(minWait);
		System.out.println("Back office - Checker Login : Successful");
		Thread.sleep(minWait);
		Basesetupdriver.driver.switchTo().alert().dismiss();
		Thread.sleep(minWait);

		Reports.CreateTest("Back Office Authentication");
		String middleOfficeNum = mp.get("middleOfficeNum");
		String backOfficeAuthorization = "SEC.TRADE A " + middleOfficeNum;

		Basesetupdriver.driver.switchTo().frame(1);
		Basesetupdriver.driver.switchTo().activeElement().sendKeys("SEC.TRADE A " + middleOfficeNum + " \n ");
		Thread.sleep(medWait);

		Set<String> parentwindow22 = driver.getWindowHandles();
		int cnt22 = 0;
		for (String newwindow22 : parentwindow22) {
			driver.switchTo().window(newwindow22);
			cnt22 = cnt22 + 1;
		}

		Basesetupdriver.driver.manage().window().maximize();
		Thread.sleep(medWait);
		Commonmethods.click(Basesetupdriver.driver.findElement(SecTrade.authorisesADeal));
		Thread.sleep(minWait);
		System.out.println("Back Office - Checker authorize the deal : Successful");
		Thread.sleep(medWait);
		Basesetupdriver.driver.close();

		Set<String> parentwindow11 = Basesetupdriver.driver.getWindowHandles();
		int cnt11 = 0;
		for (String newwindow10 : parentwindow11) {
			Basesetupdriver.driver.switchTo().window(newwindow10);
			cnt11 = cnt11 + 1;
		}

		Thread.sleep(medWait);
		Basesetupdriver.driver.navigate().refresh();
		Thread.sleep(medWait);
		System.out.println("Back Office - Checker Logout : Successful ");
		System.out.println("------------------------------------------------------------");
		Basesetupdriver.driver.quit();
		System.out.println("Process completed");
		System.out.println("############################################################");
	}
}
