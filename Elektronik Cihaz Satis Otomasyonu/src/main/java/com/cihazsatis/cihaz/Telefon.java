package com.cihazsatis.cihaz;

public class Telefon extends Cihaz {
    private double ekranBoyutu;

    public Telefon(String marka, String model, double fiyat, double ekranBoyutu) {
        super(marka, model, fiyat);
        this.ekranBoyutu = ekranBoyutu;
    }

    public double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(double ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }


}
