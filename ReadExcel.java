package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		//to read the data form excel file
		XSSFWorkbook wb = new XSSFWorkbook("./exceldata/sampledata.xlsx");
		//to get the work book sheet
		XSSFSheet sheet = wb.getSheet("sheet1");
		//to get total row count
		
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Row Count : "+lastRowNum);
		
		XSSFRow row = sheet.getRow(1);
		int lastCellNum = row.getLastCellNum();
		System.out.println("Column Count :"+lastCellNum);
		
//		XSSFCell cell = row.getCell(1);
//		String stringCellValue = cell.getStringCellValue();
//		System.out.println(stringCellValue);
		
		for (int i = 1; i <= lastRowNum; i++) {   // to get all the datas by iteration
//			XSSFRow row2 = sheet.getRow(i);
			for (int j = 1; j < lastCellNum; j++) {
//				XSSFCell cell3 = row2.getCell(j);
//				String cellValue = cell3.getStringCellValue();
//				System.out.println(cellValue);
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
			}
		}
		
		wb.close();

	}

}
