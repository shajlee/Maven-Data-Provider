package Multiple;

import org.testng.annotations.Test;

public class testcasesformydata_Practice {
	
	@Test(dataProviderClass = DataProviderHolder.class, dataProvider = "getDataPractice")
	public void launchUrl(String username, String password, int rollNumber, String browser) {
	}
	@Test(dataProviderClass = DataProviderHolder.class, dataProvider = "getDataPractice")
	public void login(String username, String password, int rollNumber, String browser) {
	}
	@Test(dataProviderClass = DataProviderHolder.class, dataProvider = "getDataPractice")
	public void logOut(String username, String password, int rollNumber, String browser) {
	}
	
}


	
	


