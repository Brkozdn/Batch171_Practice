package day_04;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_Files {



    // Desktop(masaustu)'da bir text dosyası olusturun
    // Desktop(masaustu)'da text dosyasının olup olmadıgını test edin


    @Test
    public void test01() {

        // Desktop(masaustu)'da bir text dosyası olusturun



        // Desktop(masaustu)'da text dosyasının olup olmadıgını test edin


        //         "C:\Users\BURAK           \Desktop\text.txt"

        // Assert.assertTrue(Files.exists(Paths.get("C:\\Users\\BURAK\\Desktop\\text.txt")));

        String farkliKisim = System.getProperty("user.home");
        System.out.println("FARKLI KISIM: " + farkliKisim);
        String ortakKisim = "\\Desktop\\text.txt";
        System.out.println("ORTAK KISIM: " + ortakKisim);

        String dosyaYolu = farkliKisim + ortakKisim;

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

    }
}
