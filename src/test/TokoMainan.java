package test;

import java.util.Scanner;

public class TokoMainan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.println("Price of the trip");
        double tripPrice = input.nextDouble();
        System.out.println("Number of puzzles");
        int numPuzzles = input.nextInt();
        System.out.println("Number of talking dolls");
        int numDolls = input.nextInt();
        System.out.println("Number of teddy bears");
        int numBears = input.nextInt();
        System.out.println("Number of minions");
        int numMinions = input.nextInt();
        System.out.println("Number of trucks");
        int numTrucks = input.nextInt();

        // Harga
        double puzzlePrice = 2.60;
        double dollPrice = 3.00;
        double bearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2.00;

        double totalRevenue = (numPuzzles * puzzlePrice) +
                (numDolls * dollPrice) +
                (numBears * bearPrice) +
                (numMinions * minionPrice) +
                (numTrucks * truckPrice);

        // diskon 25% jika total barang berjumlah 50 atau lebih dari 50
        if (numPuzzles + numDolls + numBears + numMinions + numTrucks >= 50) {
            totalRevenue *= 0.75;
        }

        // Sewa Toko
        double rent = totalRevenue * 0.1;
        totalRevenue -= rent;

        // Mengecek apakah bisa pergi liburan
        if (totalRevenue >= tripPrice) {
            System.out.println("pendapatan "+totalRevenue);
            System.out.println("tiket perjalanan "+tripPrice);
            System.out.printf("Pendapatan Cukup,tersisa %.2f USD.", totalRevenue - tripPrice);
        } else {
            System.out.println("pendapatan "+totalRevenue);
            System.out.println("tiket perjalanan "+tripPrice);
            System.out.printf("Uang tidak cukup!, kurang %.2f USD.", tripPrice - totalRevenue);
        }
    }
}
