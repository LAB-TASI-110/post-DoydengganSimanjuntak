package driver;

import java.util.Scanner;
import model.Model3;

public class Driver3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Daftar menu
        Model3[] daftarMenu = {
            new Model3("Nasi Goreng", 15000),
            new Model3("Mie Goreng", 12000),
            new Model3("Ayam Geprek", 18000),
            new Model3("Es Teh", 5000)
        };

        int pilihan;
        int total = 0;

        do {
            System.out.println("\n=== KAFETARIA IT DEL ===");
            for (int i = 0; i < daftarMenu.length; i++) {
                System.out.print((i + 1) + ". ");
                daftarMenu[i].displayMenu();
            }
            System.out.println("0. Selesai");

            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            if (pilihan > 0 && pilihan <= daftarMenu.length) {
                System.out.print("Jumlah: ");
                int jumlah = sc.nextInt();

                int subtotal = daftarMenu[pilihan - 1].getHarga() * jumlah;
                total += subtotal;

                System.out.println("Ditambahkan ke pesanan!");
            }

        } while (pilihan != 0);

        System.out.println("\n=== STRUK PEMBAYARAN ===");
        System.out.println("Total bayar: Rp " + total);
        System.out.println("Terima kasih!");

        sc.close();
    }
}