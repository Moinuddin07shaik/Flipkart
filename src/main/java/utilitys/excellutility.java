package utilitys;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excellutility {
	
	public String excelread(String sheet,int Rownumber,int cellnumber) throws IOException {
		String path = System.getProperty("user.dir")
		        + "/src/test/resources/TestData/Flipkartdata.xlsx";


		
		FileInputStream read = new FileInputStream(path);
		XSSFWorkbook book = new XSSFWorkbook(read);
		XSSFSheet Sh = book.getSheet(sheet);
		XSSFRow Row = Sh.getRow(Rownumber);
		XSSFCell cell = Row.getCell(cellnumber);
		return cell.getStringCellValue();
		
	}

}
