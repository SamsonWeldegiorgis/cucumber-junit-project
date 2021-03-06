package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {


    @Test
    public void read_from_excel_file() throws IOException {

        String path ="SampleData.xlsx";

        File file = new File(path);

        // to read from excel we need to load it to FileInput stream
        FileInputStream fileInputStream = new FileInputStream(file);

        // workbook >sheet >row >cell

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        //<2> We need to get specific sheet from currently opened workbook
        XSSFSheet sheet = workbook.getSheet("Employees");

        // <3> Select row and cell
        // Print out Mary's cell
        // indexes start from 0

        System.out.println(sheet.getRow(1).getCell(0));

        // print out Developer
        System.out.println(sheet.getRow(3).getCell(2)); // Developer

        // Return the count of used cells only
        // Starts counting from 1
        int usedRows = sheet.getPhysicalNumberOfRows();
        System.out.println(usedRows);  // 5 rows

        // Returns the number from top cell to bottom cell
        // It doesn't care if the cell is empty or not
        // Starts couting from 0
        int lastUsedRow = sheet.getLastRowNum();
        System.out.println(lastUsedRow);

        // TODO : create a login to print from Vinod's name
        for(int rowNum= 0 ; rowNum < usedRows ; rowNum++ ){

            if(sheet.getRow(rowNum).getCell(0).toString().equals("Mansoor")) {
                System.out.println(sheet.getRow(rowNum).getCell(0));
            }
        }
     // TODO : Create a logic to print out Linda's jobID
     // check if the name is Linda  ---> Print out Job_ID of Linda

    for (int rowNum = 0 ; rowNum < usedRows ; rowNum ++) {

        if(sheet.getRow(rowNum).getCell(0).toString().equals("Linda")){
            System.out.println("Linda's job_ID is : " + sheet.getRow(rowNum).getCell(2));
        }
    }






    }

}
