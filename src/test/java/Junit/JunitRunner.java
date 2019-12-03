
package Junit;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Features", glue = {
		"Step_Defination" }, monochrome = true, tags = {"@AllBuyFrontOffice,@AllSellFrontOffice"}, plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:output/report.html" })

public class JunitRunner {
	@AfterClass
	public static void teardown() {

		Reporter.loadXMLConfig(new File("./extend-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows os");
		Reporter.setTestRunnerOutput("T24 Projects Output");
	}
}
