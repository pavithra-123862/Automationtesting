package datadriventesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorksheetDocument;

public class writesingledata 
{
	public static void main(String[] args) throws IOException 
	{
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet=book.createSheet("AutomtionFramework");
		XSSFRow row=sheet.createRow(0);
		XSSFCell cell=row.createCell(0);
		cell.setCellValue("Automationclass");
		FileOutputStream fil=new FileOutputStream("./testdata/Framework.xlsx");
		book.write(fil);
		book.close();
		fil.close();
	}
}
