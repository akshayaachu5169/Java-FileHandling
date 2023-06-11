package textFileTest;

import java.io.File;
import java.io.IOException;

public class TextFileTest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f = new File("C:\\SeleniumPractiseWorkSpace2\\B1_FileHandlingTest\\files\\sample3.properties");
if(!f.exists()) {
	System.out.println("file not created");
	f.createNewFile();
}else {
	System.out.println("file already exsists");
}
	}

}
