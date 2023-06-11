package excelFileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f = new File("C:\\SeleniumPractiseWorkSpace2\\B1_FileHandlingTest\\files\\emptyExcel.xlsx");
	FileInputStream fis = new FileInputStream(f);
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
XSSFSheet	sheet =workbook.getSheet("Home");
fis.close();
FileOutputStream fos = new FileOutputStream(f);
sheet.getRow(2).getCell(2).setCellValue("Akshaya");
workbook.write(fos);
fos.close();
	
	}

}
