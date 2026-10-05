import java.util.Scanner;

public class PengkondisianIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int i = input.nextInt();

        if (i >= 75) {
            System.out.println("OKE KAMU LULUS");
        } else {
            System.out.println("BELAJAR LAGI DEK");

        }


    }
}
