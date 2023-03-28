package Bank;

import java.util.Scanner;

public class TestRekening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilihlah Pilihan anda: \n1. Cek Saldo\n2. Setor Tunai\n3. Tarik tunai\n\n0. Exit");
        String pilihan = scan.nextLine();
        double saldoAwal= 1000;
        Rekening rekening = new Rekening();
        rekening.menu(pilihan,saldoAwal);

    }

}
