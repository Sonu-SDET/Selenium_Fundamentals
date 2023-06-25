package poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadTextFile {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fi = new FileInputStream(new File(System.getProperty("user.dir")+"/Data/Messages.txt"));
		
		int value = 0;
		
		while((value = fi.read())!=-1){
			
			System.out.print((char) value);
		}
		
		fi.close();

	}

}
