package test;

import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Premiere premiere screening, at a price of 12.00 USD\n" +
                "Normal standard screening, at a price of 7.50 USD.\n" +
                "Discount screening for children, and students at a reduced to a price of 5.00 USD.");
        System.out.print("Masukan Jenis Tiket  (Premiere/Normal/Discount): ");
        String jenisTiket = scanner.nextLine();

        System.out.print("Masukan jumlah baris : ");
        int rows = scanner.nextInt();

        System.out.print("Masukan jumlah kolom : ");
        int columns = scanner.nextInt();

        double price;
        if (jenisTiket.equalsIgnoreCase("Premiere")) {
            price = 12.00;
        } else if (jenisTiket.equalsIgnoreCase("Normal")) {
            price = 7.50;
        } else if (jenisTiket.equalsIgnoreCase("Discount")) {
            price = 5.00;
        } else {
            System.out.println("Masukan Jenis tiket yang benar");
            return;
        }

        double totalRevenue = price * rows * columns;

        System.out.printf("Total revenue for a full hall: %.2f USD", totalRevenue);
    }
}
