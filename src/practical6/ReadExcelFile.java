package practical6;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

public class ReadExcelFile {

    private static final String EXCEL_FILE_LOCATION
            = "C:/Users/Asus/Desktop/STQA Practicals/Practical 6 - ReadExcelFile/generatedExcelFile.xls";

    public static void main(String[] args) {
        Workbook workbook = null;

        try {
            workbook = Workbook.getWorkbook(new File(EXCEL_FILE_LOCATION));
            Sheet sheet = workbook.getSheet(0);
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    Cell cell = sheet.getCell(i, j);
                    System.out.println("Column " + (i+1) + " Row " + (j+1) + ": " + cell.getContents());
                }
            }
        } catch (IOException | BiffException e) {
            throw new RuntimeException(e);
        } finally {
            if (workbook != null) {
                workbook.close();
            }
        }
    }
}