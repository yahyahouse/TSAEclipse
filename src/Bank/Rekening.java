package Bank;

import java.util.Scanner;

public class Rekening {
    private double saldo;
    public Rekening(){
        this.saldo=0;
    }

    public void menu (String pilihan, double saldoAwal){
        Scanner scan = new Scanner(System.in);
        boolean stop = false;
        Rekening rekening = new Rekening(saldoAwal);
        while (stop!=true) {
            switch (pilihan) {
                case "1":
                    rekening.cekSaldo();
                    break;
                case "2":
                    System.out.println("Berapa uang yang ingin ditabung: ");
                    double jumlah = scan.nextDouble();
                    rekening.menabung(jumlah);
                    break;
                case "3":
                    System.out.println("Berapa uang yang ingin ditarik: ");
                    double jumlahT = scan.nextDouble();
                    rekening.tarikTunai(jumlahT);
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Masukan Pilihan yang benar");
                    stop=true;
            }
            scan.close();
        }
    }

    public Rekening (double saldoAwal) {
        saldo= saldoAwal;

    }

    public void menabung(double jumlahSetoran) {
        saldo = saldo + jumlahSetoran;
        lanjutAtauTidak();
    }

    public void tarikTunai(double tarikTunai) {
        if(tarikTunai<saldo) {
            saldo = saldo - tarikTunai;
            lanjutAtauTidak();
        }else {
            System.out.println("Saldo anda tidak mencukupi "+saldo);
            lanjutAtauTidak();
        }
    }

    public void cekSaldo() {
        lanjutAtauTidak();


    }
    public void lanjutAtauTidak(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisa Saldo Anda Sekarang "+saldo);
        System.out.println("Lanjut Transaksi ? Y/N");
        String pilih=  scan.nextLine();
        if(pilih.equals("Y")||pilih.equals("y")){
            System.out.println("Pilihlah Pilihan anda: \n1. Cek Saldo\n2. Setor Tunai\n3. Tarik tunai\n\n0. Exit");
            String pilih2 = scan.nextLine();
            menu(pilih2,getSaldo());
        }else {
            System.exit(0);
        }
        scan.close();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
