public class kasirsederhanaa {
            public static void main (String[] args) {

                System.out.println("==========================================");
                System.out.println("            IDENTITAS KELOMPOK            ");
                System.out.println("==========================================");

                String[][] dataMahasiswa = new String[][]{
                        {"Bisma", "21120126120010"},
                        {"Vabyano", "21120126120025"},
                        {"Yemima", "21120126120027"},
                        {"Steven", "21120126140180"}
                };

                for (int i = 0; i < dataMahasiswa.length; i++) {
                    System.out.println((i + 1) + ". Nama : " + dataMahasiswa[i][0] + " | NIM : " + dataMahasiswa[i][1]);
                }

                System.out.println("==========================================\n");

                String[] nama = {"Raditya", "Vabyano", "Yemima", "Steven"};
                String[] makanan = {"Ayam Geprek", "Sate", "Bakso", "Mie"};
                int[] harga = {20000, 15000, 10000, 7000};
                int[] porsi = {5, 4, 2, 3};

                System.out.println("==========================================");
                System.out.println("             DAFTAR PESANAN               ");
                System.out.println("==========================================");

                for (int i = 0; i < nama.length; i++) {
                    int total = harga[i] * porsi[i];
                    System.out.println("Pembeli : " + nama[i]);
                    System.out.println("Makanan : " + makanan[i]);
                    System.out.println("Harga   : Rp " + harga[i]);
                    System.out.println("Porsi   : " + porsi[i]);
                    System.out.println("Total   : Rp " + total);
                    System.out.println("------------------------------------------");
                }
            }
        }