package Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_class {
	public static String getTD(int row,int cell) throws Throwable 
	{
		FileInputStream fis=new FileInputStream("D:\\Software Testing\\Selenium\\Kite.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		String data = sh.getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

	public static void CaptureScreenshot(WebDriver driver, String TCID) throws Throwable 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\Software Testing\\Automation Testing\\Screenshot\\TC_Screenshot\\"+TCID+".jpg");
		FileHandler.copy(src, dest);
	}
	
	
	public static void captureScreenshot_Fail (WebDriver driver,String Ak) {
		
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			            File src = ts.getScreenshotAs(OutputType.FILE);
			            
			            File dest= new File("D:\\Software Testing\\Automation Testing\\Screenshot\\TC_Screenshot\\TC_Fail.jpg");
			    		 
			            FileHandler.copy(src, dest);
			            System.out.println("ScreenShot has taken");
		     }
		catch(Exception e) {
			
			System.out.println("Exception while taking screenshot" + e.getMessage());
			
			}
		
		
		
		
		
	}
}
