import java.util.Scanner;

public class kasirsederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data disimpan langsung di array
        String[] nama = {"Raditya", "Vabyano", "Yemima", "Steven"};
        String[] makanan = {"Ayam Geprek", "Nasi Goreng", "Bubur", "Cireng"};
        int[] harga = {12000, 15000, 10000, 2000};
        int[] porsi = {2, 3, 2, 5};

        boolean ulang = true;


        while (ulang) {

            System.out.println("==========================================");
            System.out.println("            IDENTITAS KELOMPOK            ");
            System.out.println("==========================================");
            System.out.println("Nama Anggota 1 : Raditya");
            System.out.println("Nama Anggota 2 : Vabyano");
            System.out.println("Nama Anggota 3 : Yemima");
            System.out.println("Nama Anggota 4 : Steven");
            System.out.println("==========================================\n");


            System.out.print("Masukkan nama pembeli: ");
            String cariNama = input.next();

            boolean ketemu = false;

            System.out.println("\n------------------------------------------");
            System.out.println("Rincian Pembelian:");


            for (int i = 0; i < 4; i++) {
                if (nama[i].equalsIgnoreCase(cariNama)) {
                    int totalBayar = harga[i] * porsi[i];

                    System.out.println("Nama    : " + nama[i]);
                    System.out.println("Makanan : " + makanan[i]);
                    System.out.println("Harga   : Rp " + harga[i]);
                    System.out.println("Porsi   : " + porsi[i]);
                    System.out.println("Total   : Rp " + totalBayar);

                    ketemu = true;
                }
            }

            if (ketemu == false) {
                System.out.println("Nama tidak ditemukan!");
            }

            System.out.println("------------------------------------------");


            System.out.print("Cari nama lain?: ");
            String pilihan = input.next();

            if (pilihan.equals("n") || pilihan.equals("N")) {
                ulang = false;
                System.out.println("Program selesai. Terima kasih!");
            }
            System.out.println(); // Baris kosong pembatas
        }

        input.close();
    }
}
