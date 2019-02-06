package CommonMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Core.BaseClass;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class CommonReusableMethods extends BaseClass{
	
	public static void HoveronElement(By WebEle,String Elename)
	{
		A.moveToElement(Driver.findElement(WebEle)).perform();
		System.out.println("User is able to hover on " + Elename);
	}

	
	public static void Click(By WebEle, String Elename)
	{
		Driver.findElement(WebEle).click();
		System.out.println("User is able to click on " + Elename);
	}
	
	public void Wait() throws Exception
	{
		Thread.sleep(5000);
	}	
	
	public static void EnterText(By WebEle, String Text)
	{
		Driver.findElement(WebEle).sendKeys(Text);	
		System.out.println("User is able to enter text" + Text);
	}
	
	public static void ReadExcel(String TestCaseNumber) throws Exception, Exception
	{
		File f=new File(Pro.getProperty("Excel"));
		Workbook WB = Workbook.getWorkbook(f);
		Sheet S =WB.getSheet(0);
		
		int Rows = S.getRows();
		
		for(int i = 0;i<=Rows-1;i++)
		{
			if(S.getCell(0, i).getContents().toString().equals(TestCaseNumber))
			{
				EmailId_Excel = S.getCell(3, i).getContents().toString();
				Password_Excel =  S.getCell(2, i).getContents().toString();
				
					System.out.println("Excel read succesfully");		
			}
	}
}
}
