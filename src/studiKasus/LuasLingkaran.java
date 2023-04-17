package studiKasus;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Jari jari");
        int jari = scanner.nextInt();
        luas(jari);
    }

    public static void luas(int jariJari){
        DecimalFormat df = new DecimalFormat("#.##");
        double pi = 3.14;
        double hasil = jariJari*pi;
        System.out.println("luas lingkaran dengan jari-jari "+jariJari+" adalah "+df.format(hasil));

    }
}
