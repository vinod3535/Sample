package dataDrivenFramework;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_AllType_DataFrom_Excel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("D:\\Selenium\\TestCases.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		DataFormatter df = new DataFormatter();
		String Cellvalue = df.formatCellValue(sh.getRow(4).getCell(1));
		System.out.println(Cellvalue);
	}

}
