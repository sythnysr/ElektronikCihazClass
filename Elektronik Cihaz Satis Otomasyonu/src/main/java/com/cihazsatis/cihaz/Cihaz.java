package com.cihazsatis.cihaz;

public class Cihaz {
    private String marka;
    private String model;
    private double fiyat;

    public Cihaz(String marka, String model, double fiyat) {
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }

    // Getter ve Setter metodları
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }


}
