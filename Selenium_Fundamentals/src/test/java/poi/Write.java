package poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {
	
	public static void main(String[] args) throws Exception{
		
		File fl = new File(System.getProperty("user.dir")+"/Data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(fl);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.createSheet("Sheet2");
		sheet.createRow(0).createCell(0).setCellValue("bete mauj kar di");
		
		FileOutputStream fos = new FileOutputStream(fl);
		wb.write(fos);
		fos.close();
		
	}

}
