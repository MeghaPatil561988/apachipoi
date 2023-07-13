package exceloperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadingExcel
{
	public static void main(String[] args) throws IOException 
	{
         String excelFilePath = ".\\datafiles\\countries.xlsx";
         FileInputStream inputstream=new FileInputStream(excelFilePath);
         XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
         XSSFSheet sheet=workbook.getSheetAt(0); 
   }
}
