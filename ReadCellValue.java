package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadCellValue {
	
	public static String[][] exceldata(String filename) throws IOException { // to read the datas change the void into string to return the value
		XSSFWorkbook wb = new XSSFWorkbook("./exceldata/"+filename+".xlsx"); // to call the filename from common 
		XSSFSheet sheet = wb.getSheet("sheet1");
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Row Count : "+lastRowNum);
		XSSFRow row = sheet.getRow(1);
		int lastCellNum = row.getLastCellNum();
		System.out.println("Column Count :"+lastCellNum);
		
		String[][] data = new String[lastRowNum][lastCellNum]; // to return the data as array
		for (int i = 1; i <= lastRowNum; i++) {  // starts from 1 to get the first data
			for (int j = 0; j < lastCellNum; j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
			data[i-1][j] = stringCellValue; // to push the data // to start index from 0 ,i-1
			}
		}
		wb.close();
		return data;
		
	}
}
		
