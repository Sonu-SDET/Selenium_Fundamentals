package poi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteTextFile {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fo = new FileOutputStream(new File(System.getProperty("user.dir")+"/Data/Messages.txt"));
		
		String message = "Welcome to the world of automation";
		
//		Method 1:- 
//		
//		char[] ch = message.toCharArray();
//
//		for(char hc:ch) {
//			fos.write((byte) hc);
//		}
//		
//		Method 2:- 
//		
//		byte[] b = message.getBytes();
//		
//		fos.write(b);
		
		fo.close();

	}

}
