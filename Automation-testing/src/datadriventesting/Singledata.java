package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorksheetDocument;

public class Singledata 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		FileInputStream fil=new FileInputStream("./testdata/FacebookCredentials.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(1);
		XSSFCell cell=row.getCell(0);
		String val=cell.getStringCellValue();
		//System.out.println(val);
		XSSFRow row1 = sheet.getRow(1);
		XSSFCell cel1 = row.getCell(1);
		String val1 = cel1.getStringCellValue();
		//System.out.println(val1);
		
		
	Thread.sleep(1000);
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys(val);
	driver.findElement(By.id("pass")).sendKeys(val1);
	
	
	
	
	}
}
