package Multiple;

import org.testng.annotations.Test;

public class TestCases_For_My_Data {
	
	@Test(dataProviderClass = DataProviderHolder.class, dataProvider = "getData")
	public void launchUrl(String username, String password, int rollNumber, String browser) {
	}
	@Test(dataProviderClass = DataProviderHolder.class, dataProvider = "getData")
	public void login(String username, String password, int rollNumber, String browser) {
	}
	@Test(dataProviderClass = DataProviderHolder.class, dataProvider = "getData")
	public void logOut(String username, String password, int rollNumber, String browser) {
	}
	
	}


