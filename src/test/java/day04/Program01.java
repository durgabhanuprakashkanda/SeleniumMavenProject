package day04;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program01 {
	
	
	public static void main(String[] args) throws Exception {
		System.out.println(getXpath("lastName"));
		System.out.println(getXpath("firstName"));
		System.out.println(getXpath("showPassword"));
		System.out.println(getData("lastName"));
		System.out.println(getData("firstName"));
	}

	public static String getXpath(String fieldName) throws Exception {
		File src = new File(".\\src\\test\\resources\\DataSheet.xlsx");
		FileInputStream stream = new FileInputStream(src);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(stream);
		XSSFSheet sh = wb.getSheet("demo");
		DataFormatter data = new DataFormatter();

		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			if(fieldName.equals(data.formatCellValue(sh.getRow(i).getCell(0))))
			{
				return(data.formatCellValue(sh.getRow(i).getCell(1)));
			}	
		}
		return null;
	}
	
	
	public static String getData(String fieldName) throws Exception {
		File src = new File(".\\src\\test\\resources\\DataSheet.xlsx");
		FileInputStream stream = new FileInputStream(src);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(stream);
		XSSFSheet sh = wb.getSheet("demo");
		DataFormatter data = new DataFormatter();

		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			if(fieldName.equals(data.formatCellValue(sh.getRow(i).getCell(0))))
			{
				return(data.formatCellValue(sh.getRow(i).getCell(2)));
				
			}
		}
		return null;
	}

}