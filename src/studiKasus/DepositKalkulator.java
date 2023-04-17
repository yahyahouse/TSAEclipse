package studiKasus;

import java.util.Scanner;

public class DepositKalkulator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah deposito awal: ");
        double depositAmount = input.nextDouble();

        System.out.print("Masukkan tingkat suku bunga dalam persen: ");
        double bungaDep = input.nextDouble();

        System.out.print("Masukkan jumlah Bulan: ");
        int bulanDep = input.nextInt();

        deposit(depositAmount,bulanDep,bungaDep);
    }

    public static void deposit(double depositAmount, int bulanDep, double bungaDep){
        double hasil = depositAmount +bulanDep*((depositAmount*bungaDep)/12);
        System.out.println("Hasil: "+hasil);
    }
}
