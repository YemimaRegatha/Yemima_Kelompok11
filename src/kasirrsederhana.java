import java.util.Scanner;

public class kasirrsederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String[] nama = {"Raditya", "Vabyano", "Yemima", "Steven"};
        String[] makanan = {"Ayam Geprek", "Sate", "Bakso", "Mie"};
        int[] harga = {20000, 15000, 10000, 7000};
        int[] porsi = {5, 4, 2, 3};

        boolean ulang = true;

        System.out.println("=============================");
        System.out.println("          IDENTITAS          ");
        System.out.println("=============================");
        System.out.println("Nama anggota 1 : Bisma");
        System.out.println("Nama anggota 2 : Yano");
        System.out.println("Nama anggota 3 : Atha");
        System.out.println("Nama anggota 4 : Stevem");
        System.out.println("=============================\n");


        while (ulang) {
            System.out.print("Nama Pembeli : ");
            String cariNama = input.next();

            boolean ketemu = false;

            System.out.println("\n------------------------------------------");
            System.out.println("Rincian Pembelian : ");

            for (int a = 0; a < 4; a++) {
                if (nama[a].trim().equalsIgnoreCase(cariNama)) {
                    int totalBayar = harga[a] * porsi[a];

                    System.out.println("Nama    : " + nama[a]);
                    System.out.println("Makanan : " + makanan[a]);
                    System.out.println("Harga   : Rp " + harga[a]);
                    System.out.println("Porsi   : " + porsi[a]);
                    System.out.println("Total   : Rp " + totalBayar);

                    ketemu = true;
                }
            }

            if (!ketemu) {
                System.out.println("Tidak ditemukan");
            }

            System.out.println("-------------------------------------");

            System.out.print("Cari nama lain? : ");
            String pilihan = input.next();

            if (pilihan.equalsIgnoreCase("n")) {
                ulang = false;
                System.out.println("Program selesai. Terima kasih!");
            }
            System.out.println();
        }

        input.close();
    }
}