package Multiple;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class dataproviderholder_practice {
	
	@DataProvider
	
	public static Object[][] getDataPractice(Method name){
	
		Object[][]data = new Object[3][4];
		data[0][0] = "username1";
		data[0][1] = "password1";
		data[0][2] = 12345;
		data[0][3] = "Chrome";
		
		data[1][0] = "username2";
		data[1][1] = "password2";
		data[1][2] = 123456;
		data[1][3] = "Firefox";
		
		data[2][0] = "username3";
		data[2][1] = "password3";
		data[2][2] = 1234567;
		data[2][3] = "Edge";
		
		return data;
		
	
	
		
	}

}
