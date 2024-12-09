package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class writedata 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int noOfLinks=links.size();
		FileInputStream fil=new FileInputStream("./testdata/FlipkartLinks.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fil);
		XSSFSheet sheet=book.createSheet("Sheet1");
		for(int i=0;i<noOfLinks;i++)
		{
			WebElement link=links.get(i);
			 String txt = link.getText();
			 XSSFRow row=sheet.createRow(i);
			 XSSFCell cel1=row.createCell(0);
			cel1.setCellValue(txt);
		}
		book.close();
		fil.close();
	}
}
