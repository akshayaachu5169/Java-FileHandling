package excelFileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCreateSheetTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File  f = new File("C:\\SeleniumPractiseWorkSpace2\\B1_FileHandlingTest\\files\\sampleCreate.xlsx");
	FileInputStream fis = new FileInputStream(f);
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.createSheet();
//	XSSFSheet sheet=  workbook.createSheet("Home3");
	fis.close();
	FileOutputStream fos = new FileOutputStream(f);
	//sheet.createRow(1).createCell(0).setCellValue("Akshaya");
	XSSFRow row = sheet.createRow(0);
	XSSFCell cell =row.createCell(0);
	cell.setCellValue("Aswin");//setcellValue creates an temp file
	workbook.write(fos);//write() writes in an original file
	fos.close();
	}

}
