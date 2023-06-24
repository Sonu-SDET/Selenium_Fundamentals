package testNg;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups="regression")
	public void verifyLogin(Method m) {
	System.out.println(m.getName());
	}
	
//	<systemPropertyVariables> 
//	<propertyName>${username}</propertyName>
//	<propertyName>${password}</propertyName>	
//	</systemPropertyVariables>
	
	@Test(alwaysRun=true)
	public void userCreation(Method m) {
		System.out.println(m.getName());
	}
	
	
	@Test
	public void deleteUser(Method m) {
		System.out.println(m.getName());
	}
	
	
	@Test
	public void updateUser(Method m) {
		System.out.println(m.getName());
	}
	
	
	
	@Test(groups="regression")
	public void verifyLogout(Method m) {
		System.out.println(m.getName());
	}
	

}
