package utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelUtils {

	public static HashMap<String, String> readTestData(
			HashMap<String, String> data) throws Exception {

		Workbook w = Workbook.getWorkbook(new File(ConstantsUtils.TESTDATA));
		Sheet s = w.getSheet(0);
		int col = s.getColumns();
		for (int i = 0; i < col; i++) {
			String key = s.getCell(i, 0).getContents();
			String value = s.getCell(i, 1).getContents();
			data.put(key, value);
		}

		return data;

	}

}
