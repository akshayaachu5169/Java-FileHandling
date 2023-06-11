package excelFileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReadDataTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f = new File("C:\\SeleniumPractiseWorkSpace2\\B1_FileHandlingTest\\files\\sample excel.xlsx");
	FileInputStream fis = new FileInputStream(f);
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet("Home");
	int rows =sheet.getLastRowNum()+1;
int columns=sheet.getRow(0).getLastCellNum();

	for(int i=0; i<rows;i++) {
		for(int j =0;j<columns;j++) {
//			String data = sheet.getRow(i).getCell(j).getStringCellValue();//IllegalStateException-so format can be used
//			int data =sheet.getRow(i).getCell(j).getCellType();
//		sheet.getRow(i).getCell(j).setCellType(Cell.CELL_TYPE_STRING);//5.0-cannot be sure to which format it changes
//		 	String data = sheet.getRow(i).getCell(j).getStringCellValue();
//			System.out.print(data+ " ");
			if(sheet.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_STRING) {
			String data=sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(data + " ");
			}else {
				int data =(int) sheet.getRow(i).getCell(j).getNumericCellValue();
				System.out.print(data + " ");
			}
		}
		System.out.println();
	}
	}
//here it comes error, because though we pass a number as string, excel considers that as a numeric value

}


