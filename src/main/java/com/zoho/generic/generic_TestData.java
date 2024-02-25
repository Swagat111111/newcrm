package com.zoho.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class generic_TestData {
	public  String path="C:\\Users\\sagar\\Downloads\\crm2.0.xlsx";
	public String  getpropertydata(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\sagar\\Downloads\\crm.property");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	public String getExelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	public void setExeldata(String sheetname,int row,int cell,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		wb.close();
	}
	public void select1(WebElement element, String value)
	{
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public void select2(WebElement element, int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public void select3(WebElement element, String visibility)
	{
		Select s=new Select(element);
		s.selectByVisibleText(visibility);
	}
}
