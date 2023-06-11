package excelFileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileEmptyTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\SeleniumPractiseWorkSpace2\\B1_FileHandlingTest\\files\\emptyExcel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Home");
		int row = sheet.getLastRowNum()+1;
		int cell = sheet.getRow(0).getLastCellNum();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cell; j++) {
				if(sheet.getRow(i).getCell(j)!=null) {//incase of NullPointerException
				if (sheet.getRow(i).getCell(j).getCellType() == Cell.CELL_TYPE_STRING) {
					String data = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(data + " ");
				} else {
					int data = (int) sheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(data + " ");
				}
				}
			}
			System.out.println();
		}
		
		
	}

}
