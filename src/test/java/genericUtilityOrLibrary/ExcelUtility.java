package genericUtilityOrLibrary;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this class is generic class for excel
 * @author admin
  */
public class ExcelUtility {

	/**
	 * this is generic method for read data from excel
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws Exception
	 */
	public String getDataFromExcel(String sheetname,int rownum,int cellnum) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(IconstantUtility.Excelpath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetname);
		DataFormatter df = new DataFormatter();
		 String data = df.formatCellValue(sh.getRow(rownum).getCell(cellnum));
		return  data;
	}

}
