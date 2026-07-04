package uas;

import java.text.DecimalFormat;

public class Motor {

    private String kode;
    private String merk;
    private String tipeMotor;
    private double harga;

    public Motor(String kode,
                 String merk,
                 String tipeMotor,
                 double harga) {

        this.kode = kode;
        this.merk = merk;
        this.tipeMotor = tipeMotor;
        this.harga = harga;
    }

    public String getKode() {
        return kode;
    }

    public String getMerk() {
        return merk;
    }

    public String getTipeMotor() {
        return tipeMotor;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void tampilData() {

        DecimalFormat df = new DecimalFormat("#,###");

        System.out.println("Kode Motor : " + kode);
        System.out.println("Merk       : " + merk);
        System.out.println("Tipe       : " + tipeMotor);
        System.out.println("Harga      : Rp " + df.format(harga));
    }
}