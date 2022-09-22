package com.flipkart.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XlUtils {
	
	public String[][] getData(String sheetname) throws EncryptedDocumentException, IOException {
		File path=new File(System.getProperty("user.dir")+"\\data\\Logindata.xslx");
		FileInputStream readfile=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(readfile);
		Sheet sheet=wb.getSheet(sheetname);
		int totalrowcount=sheet.getLastRowNum();
		System.out.println(totalrowcount);
		Row rowcells=sheet.getRow(0);
		int totalcells=rowcells.getLastCellNum();
		String testdata[][]=new String[totalrowcount][totalcells];
		DataFormatter format=new DataFormatter();
		for(int i=1;i<=totalrowcount;i++) {
			for(int j=0;j<totalcells;j++) {
				testdata[i-1][j]=format.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}
		return testdata;
	}

}
