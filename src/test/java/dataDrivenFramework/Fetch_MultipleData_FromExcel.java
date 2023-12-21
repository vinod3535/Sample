package dataDrivenFramework;

import java.io.FileInputStream;
 

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_MultipleData_FromExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("D:\\Selenium\\TestCases.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		DataFormatter df = new DataFormatter();
		for(int i=0;i<=sh.getLastRowNum();i++) {
			Row r = sh.getRow(i);
			for(int j=0;j<=r.getLastCellNum();j++) {
				String cellvalue = df.formatCellValue(r.getCell(j));
				System.out.println(cellvalue);
			}
				
		}
	}

}
