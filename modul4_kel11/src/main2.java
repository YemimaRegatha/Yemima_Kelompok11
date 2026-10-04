import java.util.Scanner;

public class main2 {


    public static String getNamaToko() {
        return "Toko Pakaian Maju Jaya";
    }


    public static int hitungTotalHarga(int harga, int jumlah) {
        return harga * jumlah;
    }


    public static void cetakStruk(String namaBarang, int jumlah, int totalAwal, double diskon, double totalAkhir) {
        System.out.println("\n========== STRUK PEMBAYARAN ==========");
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Jumlah Beli  : " + jumlah);
        System.out.println("Total Awal   : Rp " + totalAwal);
        System.out.println("Diskon       : Rp " + (int) diskon);
        System.out.println("--------------------------------------");
        System.out.println("Total Bayar  : Rp " + (int) totalAkhir);
        System.out.println("======================================");
    }


    public static void tampilkanPenutup() {
        System.out.println("Terima kasih telah berbelanja di toko kami!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char ulang = ' ';

        System.out.println("=== WELCOME TO " + getNamaToko().toUpperCase() + " ===");

        do {
            System.out.println("\nMenu Pilihan Barang:");
            System.out.println("1. Kaos Polos  (Rp 50.000)");
            System.out.println("2. Kemeja      (Rp 120.000)");
            System.out.println("3. Jaket       (Rp 200.000)");

            System.out.print("Pilih menu (1-3): ");
            int pilihan = scanner.nextInt();

            String namaBarang = "";
            int hargaBarang = 0;

            if (pilihan == 1) {
                namaBarang = "Kaos Polos";
                hargaBarang = 50000;
            } else if (pilihan == 2) {
                namaBarang = "Kemeja";
                hargaBarang = 120000;
            } else if (pilihan == 3) {
                namaBarang = "Jaket";
                hargaBarang = 200000;
            } else {
                System.out.println("Pilihan tidak valid!");
                continue;
            }

            System.out.print("Masukkan jumlah barang yang dibeli: ");
            int jumlah = scanner.nextInt();

            int totalHarga = hitungTotalHarga(hargaBarang, jumlah);

            double diskon = 0;
            if (totalHarga >= 200000) {
                diskon = 0.15 * totalHarga;
            } else if (totalHarga >= 100000) {
                diskon = 0.05 * totalHarga;
            }

            double totalAkhir = totalHarga - diskon;


            cetakStruk(namaBarang, jumlah, totalHarga, diskon, totalAkhir);

            System.out.print("\nApakah ingin bertransaksi lagi?: ");

            ulang = scanner.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        tampilkanPenutup();

        scanner.close();
    }
}