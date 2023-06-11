package logFileTest;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFileTest1 {

	public static Logger log = LoggerFactory.getLogger(LogFileTest1.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
PropertyConfigurator.configure("C:\\SeleniumPractiseWorkSpace2\\B1_FileHandlingTest\\lib\\log4j.properties");
	log.info("am info2");
	log.error("am erro3");
	
	
	}

}
