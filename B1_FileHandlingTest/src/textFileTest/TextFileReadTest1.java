package textFileTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReadTest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\SeleniumPractiseWorkSpace2\\B1_FileHandlingTest\\files\\sample4.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		// System.out.println(br.readLine());
		String x = " ";
		while (( x= br.readLine()) != null) {
			System.out.println(x);
		}
	}

}
