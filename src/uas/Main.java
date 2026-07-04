package uas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Motor> daftarMotor = new ArrayList<>();

        int pilihan;

        do {

            System.out.println("\n==========================");
            System.out.println("      DEALER MOTOR");
            System.out.println("==========================");
            System.out.println("1. Tambah Motor");
            System.out.println("2. Tampilkan Motor");
            System.out.println("3. Ubah Harga Motor");
            System.out.println("4. Hapus Motor");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu : ");

            try {
                pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {

                    case 1:

                        System.out.print("Kode Motor : ");
                        String kode = input.nextLine();

                        System.out.print("Merk Motor : ");
                        String merk = input.nextLine();

                        System.out.print("Harga Motor : ");
                        double harga = input.nextDouble();

                        System.out.println("\nPilih Tipe Motor");
                        System.out.println("1. Motor Matic");
                        System.out.println("2. Motor Sport");
                        System.out.print("Pilihan : ");

                        int tipe = input.nextInt();

                        if (tipe == 2) {

                            System.out.print("CC Motor : ");
                            int cc = input.nextInt();

                            MotorSport motor =
                                    new MotorSport(
                                            kode,
                                            merk,
                                            harga,
                                            cc
                                    );

                            daftarMotor.add(motor);

                        } else {

                            Motor motor =
                                    new Motor(
                                            kode,
                                            merk,
                                            "Matic",
                                            harga
                                    );

                            daftarMotor.add(motor);
                        }

                        System.out.println("Data berhasil ditambahkan.");
                        break;

                    case 2:

                        if (daftarMotor.isEmpty()) {

                            System.out.println("Data motor kosong.");

                        } else {

                            System.out.println("\nDAFTAR MOTOR");

                            for (Motor m : daftarMotor) {

                                m.tampilData();

                                System.out.println("---------------------");
                            }
                        }

                        break;

                    case 3:

                        System.out.print("Masukkan Kode Motor : ");
                        String cariKode = input.nextLine();

                        boolean ditemukan = false;

                        for (Motor m : daftarMotor) {

                            if (m.getKode().equalsIgnoreCase(cariKode)) {

                                System.out.print("Harga Baru : ");
                                double hargaBaru = input.nextDouble();

                                m.setHarga(hargaBaru);

                                System.out.println("Harga berhasil diubah.");

                                ditemukan = true;
                                break;
                            }
                        }

                        if (!ditemukan) {
                            System.out.println("Motor tidak ditemukan.");
                        }

                        break;

                    case 4:

                        System.out.print("Masukkan Kode Motor : ");
                        String kodeHapus = input.nextLine();

                        boolean hapus = false;

                        for (int i = 0; i < daftarMotor.size(); i++) {

                            if (daftarMotor.get(i)
                                    .getKode()
                                    .equalsIgnoreCase(kodeHapus)) {

                                daftarMotor.remove(i);

                                System.out.println("Data berhasil dihapus.");

                                hapus = true;
                                break;
                            }
                        }

                        if (!hapus) {
                            System.out.println("Motor tidak ditemukan.");
                        }

                        break;

                    case 5:

                        System.out.println("Terima kasih.");
                        break;

                    default:

                        System.out.println("Menu tidak tersedia.");
                }

            } catch (Exception e) {

                System.out.println(
                        "Input salah! Masukkan data yang benar."
                );

                input.nextLine();
                pilihan = 0;
            }

        } while (pilihan != 5);

        input.close();
    }
}