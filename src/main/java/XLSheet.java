

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class XLSheet
{
    public static void main ( String[] args) throws IOException
    {
       XSSFWorkbook workBook = new XSSFWorkbook();
       XSSFSheet sheet = workBook.createSheet("sheet1");

       Map<String, String> data = new TreeMap<String, String>();
       data.put("ID", "Name");
       data.put("1", "Aathi");
       data.put("2", "Thea");
       data.put("3", "Brindha");
       data.put("4", "Aathini");
       data.put("5", "Bharath");

       Set<String> keyset = data.keySet();
       int rowNum =1;

       for ( String key : keyset)
       {
           int cellNum = 1;
           Row row = sheet.createRow(rowNum);
           while(cellNum<=2) {

               Cell cell = row.createCell(cellNum);
               cell.setCellValue(data.get(key));
               cellNum++;
           }
           rowNum++;
       }
        try
        {
            FileOutputStream out = new FileOutputStream("C:/Users/bhara/Documents/Excelsheet/Customer Details.xlsx");
            workBook.write(out);
            out.close();
            System.out.println("File created");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

    }
}
