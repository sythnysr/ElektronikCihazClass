package com.cihazsatis.cihaz;

public class Bilgisayar extends Cihaz {
    private int pilKapasitesi;

    public Bilgisayar(String marka, String model, double fiyat, int pilKapasitesi) {
        super(marka, model, fiyat);
        this.pilKapasitesi = pilKapasitesi;
    }

    public int getPilKapasitesi() {
        return pilKapasitesi;
    }

    public void setPilKapasitesi(int pilKapasitesi) {
        this.pilKapasitesi = pilKapasitesi;
    }

    // İç sınıf: com.cihazsatis.cihaz.Dizustu
    public static class Dizustu extends Bilgisayar {
        private double ekranBoyutu;

        public Dizustu(String marka, String model, double fiyat, int pilKapasitesi, double ekranBoyutu) {
            super(marka, model, fiyat, pilKapasitesi);
            this.ekranBoyutu = ekranBoyutu;
        }

        public double getEkranBoyutu() {
            return ekranBoyutu;
        }

        public void setEkranBoyutu(double ekranBoyutu) {
            this.ekranBoyutu = ekranBoyutu;
        }
    }

    // İç sınıf: com.cihazsatis.cihaz.Masaustu
    public static class Masaustu extends Bilgisayar {
        private boolean hariciEkranKartı;

        public Masaustu(String marka, String model, double fiyat, int pilKapasitesi, boolean hariciEkranKartı) {
            super(marka, model, fiyat, pilKapasitesi);
            this.hariciEkranKartı = hariciEkranKartı;
        }

        public boolean isHariciEkranKartı() {
            return hariciEkranKartı;
        }

        public void setHariciEkranKartı(boolean hariciEkranKartı) {
            this.hariciEkranKartı = hariciEkranKartı;
        }
    }
}
