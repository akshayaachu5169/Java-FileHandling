package propertiesFileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
//import java.util.Iterator;
import java.util.Properties;
//import java.util.Set;

public class PropertiesFileTest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f = new File("C:\\SeleniumPractiseWorkSpace2\\B1_FileHandlingTest\\files\\sample3.properties");
FileInputStream fis = new FileInputStream(f);
Properties prop = new Properties();
prop.load(fis);
//System.out.println(prop);
//Set keys= prop.keySet();
//Iterator it =keys.iterator();
//while(it.hasNext()) {
//	String key = (String) it.next();
//	System.out.println(key + "="  +prop.get(key));
//}
Enumeration e = prop.keys();
while(e.hasMoreElements()) {
	String key = (String) e.nextElement();
	System.out.println(key + "=" + prop.get(key));
}
	}

}
