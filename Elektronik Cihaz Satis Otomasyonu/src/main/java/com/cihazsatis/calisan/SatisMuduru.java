package com.cihazsatis.calisan;

import com.cihazsatis.cihaz.Cihaz;

public class SatisMuduru extends Calisan {
    public SatisMuduru(String isim) {
        super(isim, "Satış Müdürü");
    }

    @Override
    public void satisYap(Cihaz cihaz, Musteri musteri) {
        System.out.println(getIsim() + " adlı Satış Müdürü " + cihaz.getModel() + " adlı cihazı " + musteri.getIsim() + " adlı müşteriye sattı.");
    }

    public void iadeAl(Cihaz cihaz, Musteri musteri) {
        System.out.println(getIsim() + " adlı Satış Müdürü " + musteri.getIsim() + " adlı müşteriden " + cihaz.getModel() + " adlı cihazı iade aldı.");
    }
}
