package studiKasus;

public class Section3 {
    public static final double tax = 0.05;
    public static final double tip = 0.15;
    public static void main(String[] args) {
        double person1 = 10;
        System.out.println("Person 1: "+(person1*(1+tax+tip)));
    }

}
