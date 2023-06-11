package excelFileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileTest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\SeleniumPractiseWorkSpace2\\B1_FileHandlingTest\\files\\sample excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Home");//getSheet is preferred
		//XSSFSheet sheet  =workbook.getSheetAt(0);can use the index value and retrive the data for mutiple sheets
		int row = sheet.getLastRowNum() + 1;
		System.out.println(row);// rows are called by index value
		int columns = sheet.getRow(0).getLastCellNum();// columns value depends on row
		System.out.println(columns);
	}

}
