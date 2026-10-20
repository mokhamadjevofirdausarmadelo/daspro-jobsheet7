import java.util.Scanner;

public class TugasBioskop17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTiketTerjual = 0;
        double totalPendapatan = 0;
        int HARGA_TIKET = 50000;

        System.out.print("Masukkan jumlah tiket transaksi ke-1(0 untuk selesai): ");
        int jumlahTiket = sc.nextInt();

        for (int i = 1; jumlahTiket != 0; i++) {
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! masukan jumlah yang benar bang");
                i--;
            }

            if (jumlahTiket > 0) {
                double persenDiskon = (jumlahTiket > 10) ? 0.15 : (jumlahTiket > 4) ? 0.10 : 0.0;
                double nominalDiskon = jumlahTiket * HARGA_TIKET * persenDiskon;
                double totalHarga = (jumlahTiket * HARGA_TIKET) - nominalDiskon;

                totalTiketTerjual += jumlahTiket;
                totalPendapatan += totalHarga;

                System.out.println("Diskon (" + (int)(persenDiskon * 100) + "%): Rp " + nominalDiskon);
                System.out.println("Total harga transaksi ke-" + i + ": Rp " + totalHarga + "\n");
            }

            System.out.print("Masukkan jumlah tiket transaksi ke-" + (i + 1) + " (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();
        }

        System.out.println("Total tiket terjual  : " + totalTiketTerjual);
        System.out.println("Total pendapatan     : Rp " + totalPendapatan);

        sc.close();
    }
}