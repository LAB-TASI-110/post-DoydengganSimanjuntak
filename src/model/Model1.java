package model;

public class Model1 {
    private String kode;
    private int beratButet;
    private int beratUcok;

    public Model1(String kode, int beratButet) {
        this.kode = kode;
        this.beratButet = beratButet;

        // Perbedaan ukuran dus (asumsi): Ucok lebih ringan 1 kg
        this.beratUcok = beratButet - 1;
        if (this.beratUcok < 1) {
            this.beratUcok = 1;
        }
    }

    // Ongkir per kg
    public int getHargaPerKg() {
        if (kode.equals("MDN")) return 10000;
        if (kode.equals("JKT")) return 15000;
        if (kode.equals("BLG")) return 12000;
        return 0;
    }

    public int getTotalBerat() {
        return beratButet + beratUcok;
    }

    public int getTotalOngkir() {
        return getTotalBerat() * getHargaPerKg();
    }

    // Promo (asumsi dari soal): diskon jika berat >= 10 kg
    public String getPromo() {
        if (getTotalBerat() >= 10) {
            return "Diskon 10%";
        }
        return "Tidak ada";
    }

    public int getTotalBayar() {
        int total = getTotalOngkir();
        if (getTotalBerat() >= 10) {
            total = (int)(total * 0.9);
        }
        return total;
    }

    public void printStruk() {
        System.out.println("===== STRUK PEMBAYARAN =====");
        System.out.println("Kota Tujuan      : " + kode);
        System.out.println("Berat Butet      : " + beratButet + " kg");
        System.out.println("Berat Ucok       : " + beratUcok + " kg");
        System.out.println("Total Berat      : " + getTotalBerat() + " kg");
        System.out.println("Total Ongkir     : Rp " + getTotalOngkir());
        System.out.println("Promo            : " + getPromo());
        System.out.println("Total Bayar      : Rp " + getTotalBayar());
        System.out.println("============================");
    }
}