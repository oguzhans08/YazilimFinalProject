package tr.edu.medipol.yazarac.RestWebServisOrnek;

 

import java.util.*;
import org.springframework.web.bind.annotation.*;

 

@RestController
@RequestMapping(path="/ogrenci")
public class RestWebServis {

 

    private static List<Ogrenci> ogrenciListesi = new ArrayList<>();
    static {
        ogrenciListesi.add(new Ogrenci("Oğuzhan", 25));
        ogrenciListesi.add(new Ogrenci("Hayriye", 21));
        ogrenciListesi.add(new Ogrenci("Kerem", 23));
    }
    
    @GetMapping("/listele")
    public List<Ogrenci> listele(){
        return ogrenciListesi;
    }
    @PostMapping("/ekle")
    public Ogrenci Ekle(@RequestBody Ogrenci ogrenci){
    	ogrenciListesi.add(ogrenci);
		return ogrenci;
    }
    @PostMapping("/sil")
    public  Ogrenci sil(@RequestBody Ogrenci ogrenci){
        ogrenciListesi.add(ogrenci);
        return ogrenci;
    }
}
