package almosaferproject;

import org.testng.annotations.BeforeTest;

public class mynewtest extends parameters {
	
	
	@BeforeTest
	
	public void MySetUp () {
	
	driver.get(URL);
driver.manage().window().maximize();
	
	}
	
	
	
}
