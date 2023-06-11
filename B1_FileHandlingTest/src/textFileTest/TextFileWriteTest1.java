package textFileTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriteTest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\SeleniumPractiseWorkSpace2\\B1_FileHandlingTest\\files\\sample3.txt");
		if (!f.exists()) {
			System.out.println("file not created");
			f.createNewFile();
		} else {
			System.out.println("file already exsists");
		}

//System.out.println(f.canRead());
		FileWriter fw = new FileWriter(f);
//		fw.write("Vcentry1");
//		
//		fw.write("Vcentry2");
//		fw.write("Vcentry3");
//		fw.close();
BufferedWriter bw = new BufferedWriter(fw);
bw.write("Vcentry1");
bw.newLine();
bw.write("Vcentry2");
bw.newLine();
bw.write("Vcentry3");
bw.newLine();
bw.close();
	}

}
