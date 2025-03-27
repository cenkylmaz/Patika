import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Km verisni giriniz:  ");
        double km = scanner.nextDouble();
        double price = 10 + (km * 2.20);
        if (price < 20) price = 20;
        //if (price < 20 ) price = 20
        System.out.println("Taksimetre: " + price);

    }
}
