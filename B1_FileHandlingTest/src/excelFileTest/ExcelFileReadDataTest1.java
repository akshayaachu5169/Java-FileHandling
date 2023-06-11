package excelFileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReadDataTest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\SeleniumPractiseWorkSpace2\\B1_FileHandlingTest\\files\\sample excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Home");
		int row = sheet.getLastRowNum() + 1;
		System.out.println(row);
		int columns = sheet.getRow(0).getLastCellNum();
		System.out.println(columns);
//	String data =sheet.getRow(1).getCell(2).getStringCellValue();
//	System.out.println(data);
//	String data1 =sheet.getRow(2).getCell(1).getStringCellValue();
//	System.out.println(data1);

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < columns; j++) {
				String datas = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(datas+ " ");
				
			}
			System.out.println();
		}
	}

}
