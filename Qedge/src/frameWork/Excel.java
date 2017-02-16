package frameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static String Readexcel(String FilePath,String Filename,String sheetname,int rowno,int Columnno) throws IOException
	{
		String x=FilePath+"\\"+Filename;
		FileInputStream FIS=new FileInputStream(x);
		XSSFWorkbook excelbook=new XSSFWorkbook(FIS);
		XSSFSheet sheet=excelbook.getSheet(sheetname);
		XSSFRow row=sheet.getRow(rowno);
		XSSFCell column=row.getCell(Columnno);
		
		try
		{
		 x=column.getStringCellValue().toString();
		
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			Double b=column.getNumericCellValue();
			int myInt = b.intValue();
			x=String.valueOf(myInt);
		}
		return x;
		
	}
	public static void Writeexcel(String FilePath,String Filename,String sheetname,int rowno,int Columnno,String data) throws IOException
	{
		String x=FilePath+"\\"+Filename;
		FileInputStream FIS=new FileInputStream(x);
		XSSFWorkbook excelbook=new XSSFWorkbook(FIS);
		XSSFSheet sheet=excelbook.getSheet(sheetname);
		XSSFRow row=sheet.getRow(rowno);
		XSSFCell cell=row.createCell(Columnno);
		cell.setCellValue(data);
		FileOutputStream fout=new FileOutputStream(new File(x));
		excelbook.write(fout);
		 fout.close();
	}
}
