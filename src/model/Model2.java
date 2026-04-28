package model;

public class Model2 {
    private int[][] rak;
    private int size;

    public Model2(int[] data, int N) {
        size = (int) Math.sqrt(N);
        rak = new int[size][size];

        int index = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rak[i][j] = data[index++];
            }
        }
    }

    // hitung total berdasarkan kategori (baris)
    public int hitungKategori(int kategori) {
        int total = 0;

        for (int j = 0; j < size; j++) {
            total += rak[kategori][j];
        }

        return total;
    }
} 