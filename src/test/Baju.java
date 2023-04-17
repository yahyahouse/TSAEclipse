package test;

import java.util.Scanner;

public class Baju {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukan suhu: ");
        int degrees = input.nextInt();

        System.out.print("Masukan waktu (Morning/Afternoon/Evening): ");
        String timeOfDay = input.next();

        // Rekomendasi berdasarkan input
        String recommendation = "";
        if (degrees>= 42){
            recommendation = "Stay indoors";
        } else if (degrees >= 25 && timeOfDay.equalsIgnoreCase("Morning") ||
                degrees >= 18 && timeOfDay.equalsIgnoreCase("Afternoon")) {
            recommendation = "Outfit = T-shirt and Shoes = Sandals";
        } else if (degrees >= 25 && timeOfDay.equalsIgnoreCase("Afternoon")) {
            recommendation = "Outfit = Swim Suit and Shoes = Barefoot";
        } else if (timeOfDay.equalsIgnoreCase("Evening" )||
                degrees >= 18 && timeOfDay.equalsIgnoreCase("Morning")||
                degrees >= 10 && timeOfDay.equalsIgnoreCase("Afternoon")) {
            recommendation = "Outfit = Shirt and Shoes = Moccasins";
        } else if (degrees >= 10 && timeOfDay.equalsIgnoreCase("Morning")) {
            recommendation = "Outfit = Sweatshirt and Shoes = Sneakers";
        } else {
            recommendation = "Stay indoors";
        }
        System.out.println(recommendation);
    }
}

