package testNg;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersBasic {

	@DataProvider(name="myData")
	public Object[][] getData() {
		Object[][] data = new Object[3][1];

		Map<Object,Object> map1 = new HashMap<Object,Object>();
		map1.put("username","sonu111");
		map1.put("password","sonu@111");
		map1.put("gender","male");
		map1.put("runnable","yes");

		data[0][0] = map1;


		Map<Object,Object> map2 = new HashMap<Object,Object>();
		map2.put("username","sonu222");
		map2.put("password","sonu@222");
		map2.put("gender","female");
		map2.put("runnable","no");
		data[1][0] = map2;


		Map<Object,Object> map3 = new HashMap<Object,Object>();
		map3.put("username","sonu333");
		map3.put("password","sonu@333");
		map3.put("gender","bipolar");
		map3.put("runnable","yesno");
		data[2][0] = map3;

		return data;
	}
	
	
	@Test(dataProvider="myData")
	public void showData(Map<Object,Object> map) {
		System.out.print(map.get("username")+" | ");
		System.out.print(map.get("password")+" | ");
		System.out.print(map.get("gender")+" | ");
		System.out.print(map.get("runnable"));
		System.out.println();
	}

}
