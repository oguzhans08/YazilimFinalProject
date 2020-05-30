package tr.edu.medipol.yazarac.RestWebServisOrnek;

 

public class Ogrenci {

 

    private String isim;
    private int numara;
    
    public Ogrenci(String isim, int numara) {
        super();
        this.isim = isim;
        this.numara = numara;
    }

 

    public String getIsim() {
        return isim;
    }

 

    public int getNumara() {
        return numara;
    }

 

}