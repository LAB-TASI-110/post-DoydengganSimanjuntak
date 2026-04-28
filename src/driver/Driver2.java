package driver;

import java.util.Scanner;
import model.Model2;

public class Driver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input jumlah data
        int N = sc.nextInt();

        int[] data = new int[N];

        // input stok
        for (int i = 0; i < N; i++) {
            data[i] = sc.nextInt();
        }

        // input kategori
        int kategori = sc.nextInt();

        Model2 gudang = new Model2(data, N);

        int hasil = gudang.hitungKategori(kategori);

        System.out.println(hasil);
    }
}