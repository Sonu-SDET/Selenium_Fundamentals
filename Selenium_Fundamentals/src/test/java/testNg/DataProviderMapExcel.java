package testNg;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMapExcel {
	
	@DataProvider(name="myData")
	public Object[][] saveData() throws Exception{
		
		File fl = new File(System.getProperty("user.dir")+"/Data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(fl);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		Object[][] data = new Object[sheet.getLastRowNum()][1];
		
		for(int i=1;i<=sheet.getLastRowNum();i++) {
			
			Map<Object,Object> map = new HashMap<Object,Object>();
			
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
				
				map.put(sheet.getRow(0).getCell(j).getStringCellValue(), sheet.getRow(i).getCell(j).getStringCellValue());
				
			}
			data[i-1][0]=map;
		}
		return data;
	}
	
	
	
	@Test(dataProvider="myData")
	public void showData(Map<Object,Object> map) {
		System.out.print(map.get("Firstname")+" | ");
		System.out.print(map.get("LastName")+" | ");
		System.out.print(map.get("Gender")+" | ");
		System.out.println(map.get("City"));
	}

}
