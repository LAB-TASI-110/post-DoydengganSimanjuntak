package driver;

import java.util.Scanner;
import model.Model1;

public class Driver1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String kode = sc.nextLine();

            if (kode.equals("END")) {
                break;
            }

            int beratButet = Integer.parseInt(sc.nextLine());

            Model1 m = new Model1(kode, beratButet);
            m.printStruk();
        }

        sc.close();
    }
}