package day_08;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C03_ReadExcel  {


    // Ulkeler dosyasındaki 3.satırdaki indexin, 3.sutunundaki indexinin
    // "Cezayir" oldugunu test eden method olusturunuz


    @Test
    public void test01() throws IOException {

        // Ulkeler dosyasındaki 3.satırdaki indexin, 3.sutunundaki indexinin
        // "Cezayir" oldugunu test eden method olusturunuz

        int satirNoIdx = 4;
        int sutunNoIdx = 2;

        String actuel = banaDataGetir(satirNoIdx,sutunNoIdx);
        String expected = "Andorra";

        Assert.assertEquals(expected,actuel);




    }

    public static String banaDataGetir(int satirNoIdx, int sutunNoIdx) throws IOException {

        FileInputStream fis = new FileInputStream("src/resources/ulkeler.xlsx");

        Workbook workbook = WorkbookFactory.create(fis);

        String istenenData = workbook.getSheet("Sayfa1").getRow(satirNoIdx).getCell(sutunNoIdx).toString();

        return istenenData;


    }
}
