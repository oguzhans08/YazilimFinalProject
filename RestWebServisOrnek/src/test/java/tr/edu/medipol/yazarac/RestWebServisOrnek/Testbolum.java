package tr.edu.medipol.yazarac.RestWebServisOrnek;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ogrenci")

public class Testbolum {
	// Kişileri Kontrol Testi
    @Test
    public void ListeKontrol() {
        //Given  - Koşullar - Ön Şartlar
    List<String> ogrenciler = new ArrayList<>();
         {
             String ogrenci1 ="Oğuzhan";
             String ogrenci2 ="Hayriye";
             String ogrenci3 ="Hüseyin";
             int Not =25;
            int Not2 = 21;
            int Not3 =23;
       //When

        ogrenciler.add(ogrenci1+Not);
        ogrenciler.add(ogrenci2+Not2);
        ogrenciler.add(ogrenci3+Not3);

      //Then - Kontrol
            assertEquals("Oğuzhan",ogrenci1);
            assertEquals("Hayriye",ogrenci2);
            assertEquals("Hüseyin",ogrenci3);
            

        }



    }
private void assertEquals(String string, String ogrenci1) {
        // TODO Auto-generated method stub

    }
@GetMapping("/ogrenciEkle/{ogrenciAdi}")
@Test
//OgrenciEkleTesti
//Given
public void   OgrenciEkle() {
    List<String> ogrenciler = new ArrayList<>();
     {
         String ogrenci1 ="Cenk";
         String ogrenci2 ="Salim";
         String ogrenci3 ="Özkan";
     }
     //When
     String yeniogrenci="Kerem";
     ogrenciler.add(yeniogrenci);
     //Then
     assertEquals(yeniogrenci,"Kerem");

}
@GetMapping("/ogrenciSil/{ogrenciAdi}")
@Test
public void OgrenciSil() {
//OgrenciSil Testi
    //Given
        List<String> ogrenciler = new ArrayList<>();
         {
             String ogrenci1 ="Oğuzhan";
             String ogrenci2 ="Hayriye";
             String ogrenci3 ="Hüseyin";

        //When

             ogrenciler.remove(ogrenci3);

        //Then
             assertEquals(ogrenci3,"Hüseyin");
         }


}

}
