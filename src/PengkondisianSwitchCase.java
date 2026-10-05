import java.util.Scanner;

public class PengkondisianSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pilih buku (1-4): ");
        int angka = input.nextInt();

        switch(angka){
            case 1:
                System.out.println("Buku Sejarah");
                break;
            case 2:
                System.out.println("Buku Kimia");
                break;
            case 3:
                System.out.println("Buku Fisika");
                break;
            case 4:
                System.out.println("Buku Biologi");
                break;
            default:
                System.out.println("Belum Tersedia");
        }

        input.close();
    }
}





