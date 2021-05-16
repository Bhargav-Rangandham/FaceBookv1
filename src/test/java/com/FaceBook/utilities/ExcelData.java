package com.FaceBook.utilities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelData {
	
	public static String getCellValue(String sheetname, int rownum, int columnnum) throws Exception {
	String CellValue = null;
	
	
	try {
	File src = new File("F:\\Selenium-WorkPlace\\FaceBookV1\\src\\test\\java\\com\\FaceBook\\Testdata\\Test Data.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sheet = wb.getSheet(sheetname);
	
	XSSFRow row = sheet.getRow(rownum);
	
	XSSFCell cell = row.getCell(columnnum);
	
	CellValue = cell.getStringCellValue();
	
	/*	
	String data = sheet.getRow(1).getCell(0).getStringCellValue();
	String data1 = sheet.getRow(1).getCell(1).getStringCellValue();
	System.out.println(data);
	System.out.println(data1);
	*/
	
	}
	catch(Exception e) {
		
		e.printStackTrace();
	}
	
	return CellValue;

	}


}


