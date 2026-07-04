package uas;

public class MotorSport extends Motor {
    private int cc;

    public MotorSport(String kode,
                      String merk,
                      double harga,
                      int cc) {

        super(kode, merk, "Sport", harga);
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    @Override
    public void tampilData() {

        super.tampilData();

        System.out.println("CC         : " + cc + " CC");
    }
}