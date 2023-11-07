package practical5;

import jxl.Workbook;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateWriteExcelFile {

    private static final String EXCEL_FILE_LOCATION
            = "C:/Users/Asus/Desktop/STQA Practicals/Practical 5 - CreateWriteExcelFile/generatedExcelFile.xls";

    public static void main(String[] args) {
        WritableWorkbook writableWorkbook = null;
        try {
            writableWorkbook = Workbook.createWorkbook(new File(EXCEL_FILE_LOCATION));
            WritableSheet writableSheet = writableWorkbook.createSheet("Sheet 1", 0);
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    Number number = new Number(i, j, (i+10));
                    writableSheet.addCell(number);
                }
            }
            writableWorkbook.write();
        } catch (IOException | WriteException e) {
            throw new RuntimeException(e);
        } finally {
            if (writableWorkbook != null) {
                try {
                    writableWorkbook.close();
                } catch (WriteException | IOException e) {
                    Logger logger = Logger.getLogger(CreateWriteExcelFile.class.getName());
                    logger.log(Level.SEVERE, "Error while closing the workbook", e);
                }
            }
        }
    }
}