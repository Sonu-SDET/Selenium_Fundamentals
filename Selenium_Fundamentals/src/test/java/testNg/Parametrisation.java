package testNg;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

class Parametrisation {
	
	@Parameters({"username","password"})
	@Test
	public void getData(@Optional ("admin") String username, @Optional ("Test@123") String password) {
		
		System.out.println(username);
		System.out.println(password);
		
	}

}
