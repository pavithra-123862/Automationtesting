package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Multipledata 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fil=new FileInputStream("./testdata/FacebookCredentials.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fil);
		XSSFSheet sheet=book.getSheet("Sheet1");
		int lr = sheet.getLastRowNum();
		for( int i=0;i<=lr;i++)
		{
			XSSFRow row=sheet.getRow(i);
			XSSFCell cel=row.getCell(0);
			String celval = cel.getStringCellValue();
			XSSFCell cel2=row.getCell(1);
			String celval2 = cel2.getStringCellValue();
			System.out.println(celval+" "+" "+celval2);
		}
		book.close();
		fil.close(); 
			
	}
}

