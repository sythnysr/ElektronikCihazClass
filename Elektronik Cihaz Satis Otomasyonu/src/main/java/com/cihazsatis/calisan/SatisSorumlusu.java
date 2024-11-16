package com.cihazsatis.calisan;

import com.cihazsatis.cihaz.Cihaz;

public class SatisSorumlusu extends Calisan {
    public SatisSorumlusu(String isim) {
        super(isim, "Satış Sorumlusu");
    }

    @Override
    public void satisYap(Cihaz cihaz, Musteri musteri) {
        System.out.println(getIsim() + " sadece satış yapabilir. " + cihaz.getModel() + " adlı cihazı sattı.");
    }
}
