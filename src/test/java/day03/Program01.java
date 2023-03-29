package day03;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program01 {

	public static void main(String[] args) throws Exception {
		File src = new File(".\\src\\test\\resources\\DataSheet.xlsx");
		FileInputStream stream = new FileInputStream(src);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(stream);
		XSSFSheet sh = wb.getSheet("test");
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(1).getCell(0).getNumericCellValue());
		
		DataFormatter data = new DataFormatter();
		System.out.println(data.formatCellValue(sh.getRow(0).getCell(0)));
		System.out.println(data.formatCellValue(sh.getRow(1).getCell(0)));
		
		
		System.out.println(sh.getLastRowNum());//Index of Zero
		System.out.println(sh.getRow(0).getLastCellNum());//Index of One
		System.out.println(sh.getRow(1).getLastCellNum());
		
		
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			System.out.println(sh.getRow(i).getCell(0));
		}
		
		System.out.println("######################");
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			int cellCount=sh.getRow(i).getLastCellNum();
			
			for(int j=0;j<cellCount;j++)
			{
				System.out.println(data.formatCellValue(sh.getRow(i).getCell(j)));
			}
			System.out.println("Completed Row :- "+i);
		}
		
		
	}

}