package studiKasus;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertMataUang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Jumlah Uang");
        long jumlah = scan.nextLong();
        USD(jumlah);
    }

    public static void USD(long jumlahRupiah){
        DecimalFormat df = new DecimalFormat("#.##");
        long rupiah = 14570;
        double usd = (double) jumlahRupiah /rupiah;
        System.out.println(jumlahRupiah+" Rupiah = "+df.format(usd)+" USD");
    }
}
