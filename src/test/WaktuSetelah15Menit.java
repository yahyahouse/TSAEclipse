package test;

import java.util.Scanner;

public class WaktuSetelah15Menit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Masukan jam dan menit
        System.out.print("Masukan Jam (0-23): ");
        int hour = scanner.nextInt();
        System.out.print("Masukan Menit (0-59): ");
        int minute = scanner.nextInt();

        // Menghitung menit
        int newMinute = (minute + 15) % 60;
        int newHour = (hour + (minute + 15) / 60) % 24;

        // Ubah format menjadi string
        String result = String.format("%02d:%02d", newHour, newMinute);

        // Hasil
        System.out.println("The time in 15 minutes will be: " + result);
    }
}
