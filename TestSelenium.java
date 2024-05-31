package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSelenium {
@Test(priority='0')
public static void testLoginLoad() {
	// TODO Auto-generated method stub
	WebDriver driver;
	System.setProperty("webdriver.gecko.driver","C:\\WebDriver\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.saucedemo.com/v1/");
	System.out.println("priority1");
}
@Test(priority='1')
public static void testLoadAbout() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/");
	System.out.println("priority2");
}
@Test(priority='1')
public static void testLoadProduct() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabss.com/products");
	System.out.println("priority3");
}
@Test(priority='1')
public static void testLoadProductCross() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/cross-browser-testing");
	System.out.println("priority4");
}
@Test(priority='1')
public static void ProductMobileAppTest() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/mobile-testing");
	System.out.println("priority5");
}
@Test(priority='1')
public static void ProductLowCodeTest() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/low-code-testing");
	System.out.println("priority6");
}
@Test(priority='1')
public static void ProductErrorReporting() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/error-reporting");
	System.out.println("priority7");
}
@Test(priority='1')
public static void ProductSauceInSights() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/sauce-insights");
	System.out.println("priority8");
}
@Test(priority='1')
public static void ProductTestOrchestration() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/test-orchestration");
	System.out.println("priority9");
}
@Test(priority='1')
public static void ProductApiTesting() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/api-testing");
	System.out.println("priority10");
}
@Test(groups={"Group1"})
public static void ProductVisualTesting() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/visual-testing");
	System.out.println("Group1");
}
@Test(groups="Group2")
public static void ProductSaucePerformance() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/sauce-performance");
	System.out.println("Group2");
}
@Test(groups={"Group3"})
public static void ProductSupportedBrowsers() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/supported-browsers-devices");
	System.out.println("Group3");
	
}
@Test(groups={"Group4"})
public static void ProductPlatformConfigurator() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/platform-configurator");
	System.out.println("Group4");	}
@Test(groups={"Group5"})
public static void ProductDemoTours() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/demo-tours");
	System.out.println("Group5");
}
@Test(groups={"Group6"})
public static void SolutionEnterprise() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/enterprise");
	System.out.println("Group6");
}
@Test(groups={"Group7"})
public static void SolutionTeams() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/developers");
	System.out.println("Group7");
}
@Test(groups={"Group8"})
public static void SolutionCi() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://docs.saucelabs.com/ci/");
	System.out.println("Group8");
}
@Test(groups={"Group9"})
public static void SolutionDebugging() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/solutions/intelligent-software-debugging");
	System.out.println("Group9");
}
@Test(groups="Group10")
public static void SolutionMobileBetaTesting() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/mobile-testing/app-betas");
	System.out.println("Group10");
}
@Test
@Parameters({"val1"})
public static void SolutionScalableTestAutomation() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/solutions/scalable-test-automation");
	System.out.println("The final output display1");
}
@Test
@Parameters({"val1"})
public static void SolutionVisualTesting() {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://saucelabs.com/products/visual-testing");
	System.out.println("The final output display2");
}

	@Test
	@Parameters({"val1"})
	public static void SolutionTestOrchestration() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://saucelabs.com/products/test-orchestration");
		System.out.println("The final output display3");
	}
	@Test
	public static void SolutionCiCd() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://docs.saucelabs.com/basics/integrations-overview/#cicd-tools");
		System.out.println("The final output display4");
	}
	@Test
	public static void SolutionAutomationTool() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://docs.saucelabs.com/basics/integrations-overview/#automation-tools");
	}
	@Test
	public static void SolutiontestReporting() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://docs.saucelabs.com/basics/integrations-overview/#test-reporting-and-management");
		System.out.println("The final output display5");
	}
	
	@Test
	@Parameters({"val1"})
	public static void SolutionLowCodenoCodemodel() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://docs.saucelabs.com/basics/integrations-overview/#low-codeno-codemodel-based-test-case-generation");
		System.out.println("The final output display6");
	}
	@Test
	@Parameters({"val1"})
	public static void Solutionaccessibility() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://docs.saucelabs.com/basics/integrations-overview/#accessibility");
		System.out.println("The final output display7");
	}
	@Test
	@Parameters({"val1"})
	public static void SolutionApiManagement() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://docs.saucelabs.com/basics/integrations-overview/#api-management-and-testing");
		System.out.println("The final output display8");
	}
	@Test
	@Parameters({"val1"})
	public static void Pricing() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://saucelabs.com/pricing");
		System.out.println("The final output display9");
	}
	@Test
	@Parameters({"val1"})
	public static void DevelopersDoc() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://docs.saucelabs.com/");
		System.out.println("The final output display10");
	}
	@Test
	@Parameters({"val1"})
	public static void DevelopersChangelog() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://changelog.saucelabs.com/en");
	}
	@Test
	@Parameters({"val1"})
	public static void DevelopersSeleniumquickstart() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://docs.saucelabs.com/web-apps/automated-testing/selenium/quickstart/");
	}
	@Test
	@Parameters({"val1"})
	public static void DevelopersAppium() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://docs.saucelabs.com/mobile-apps/automated-testing/appium/quickstart/");
	}
	@Test
	public static void DevelopersMobileAppTesting() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://docs.saucelabs.com/mobile-apps/");
	}
	@Test
	public static void DevelopersSupportCenter() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://support.saucelabs.com/s/?language=en_US");
	}
	@Test
	@Parameters({"val1"})
	public static void DevelopersFaqs() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://saucelabs.com/resources/faqs");
	}
	@Test
	@Parameters({"val1"})
	public static void DevelopersCypress() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://docs.saucelabs.com/web-apps/automated-testing/cypress/quickstart/");
	}
	@Test
	@Parameters({"val1"})
	public static void DevelopersPlaywrite() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://docs.saucelabs.com/web-apps/automated-testing/playwright/quickstart/");
	}
	@Parameters({"val1"})
	@Test
	public static void DevelopersOrchestrate() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://docs.saucelabs.com/orchestrate/");
	}
	
}
