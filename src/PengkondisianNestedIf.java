import java.util.Scanner;

public class PengkondisianNestedIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai: ");
        int i = input.nextInt();
        if (i >= 75) {
            if (i >= 90) {
                System.out.println("Canggih Ya Kamu");
            } else {
                System.out.println("Boleh Lah");
            }
        } else {
            System.out.println("E for Engineer");
        }


    }
}





