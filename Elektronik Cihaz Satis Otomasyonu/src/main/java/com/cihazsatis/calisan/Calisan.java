package com.cihazsatis.calisan;

import com.cihazsatis.cihaz.Cihaz;

public class Calisan {
    private String isim;
    private String pozisyon;

    public Calisan(String isim, String pozisyon) {
        this.isim = isim;
        this.pozisyon = pozisyon;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }

    public void satisYap(Cihaz cihaz, Musteri musteri) {
        System.out.println(isim + " adlı çalışan " + musteri.getIsim() + " adlı müşteriye " + cihaz.getModel() + " satışı yaptı.");
    }
}
