package Business_Methods;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.commons.collections4.map.HashedMap;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.codoid.products.exception.FilloException;

import Utilities.Browserconfig;
import Utilities.DataProvider;
import Utilities.Reports;
import cucumber.api.java.Before;

public class Basesetupdriver extends Browserconfig {
	public static Properties prop;
	public static WebDriver driver;
	public static DataProvider obj = new DataProvider();
	public static String testCaseID="TC_1";
	public static String sheetName="Sheet1";

	public static HashMap<String, String> excelHashMapValues = new HashMap<String, String>();

	
	public void ReadPropertyfile_and_OpenBrowser() throws IOException, Exception {
		
		 prop = new Properties();
		 BufferedReader reader = new BufferedReader(new
		 FileReader("PropertiesList/Config.properties"));
		 prop.load(reader);
		 BufferedReader reader_1 = new BufferedReader(new FileReader(prop.getProperty("roles")));
		 prop.load(reader_1);
		 BufferedReader reader_2 = new BufferedReader(new FileReader(prop.getProperty("DB_Data")));
		 prop.load(reader_2);
		 BufferedReader reader_3 = new BufferedReader(new FileReader(prop.getProperty("Directory")));
		 prop.load(reader_3);
		 System.out.println(prop);
		
		driver = choosebrowser("chrome", "http://10.1.1.5:9089/BrowserWeb/servlet/BrowserServlet");
		excelHashMapValues = obj.extractExcelData(testCaseID, sheetName);
		Reports.reportGeneration("C:\\Users\\koushicks\\Documents\\DemoFrame-master\\DemoFrame-master\\DemoFrame-master\\Attachment\\");
		
	}

}
