package exceloperations;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkingWithDateCells
{
	public static void main(String[] args) throws IOException
	{
		//create a blank workbook
		XSSFWorkbook workbook = new  XSSFWorkbook();
		
		//create a blank sheet
		XSSFSheet sheet = workbook .createSheet("Date formats");
		
		//Date in number format
		XSSFCell cell = sheet.createRow(0).createCell(0);
		cell.setCellValue(new Date());
		
		FileOutputStream fos = new FileOutputStream(".\\datafiles\\dateformats.xlsx");
		workbook.write(fos);
		workbook.close();
		
		System.out.println("done!!");
	}
}
