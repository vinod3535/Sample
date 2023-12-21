package dataDrivenFramework;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FetchDataFromExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("D:\\Selenium\\TestCases.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		Row r=sh.getRow(2);
		Cell c=r.getCell(1);
		String value=c.getStringCellValue();
		System.out.println(value);
		
	}

}
