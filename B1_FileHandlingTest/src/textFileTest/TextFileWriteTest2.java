package textFileTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriteTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f = new File("C:\\SeleniumPractiseWorkSpace2\\B1_FileHandlingTest\\files\\sample4.txt");
if(!f.exists()) {
	System.out.println("file not created");
	f.createNewFile();
}
else {
System.out.println("Already exsists");	
}
	FileWriter fw = new FileWriter(f,true);
	BufferedWriter bw =new BufferedWriter(fw);
	bw.write("Vcentry4");
	bw.newLine();
	bw.write("Vcentry5");
	bw.newLine();
	bw.write("Vcentry6");
	bw.newLine();
	bw.close();
	}

}
