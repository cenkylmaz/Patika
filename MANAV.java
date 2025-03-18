import java.util.Scanner;

public class MANAV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Armut = 2.14;
        double Elma = 3.67;
        double Domates = 1.11;
        double Muz = 0.94;
        double Patlican = 5.00;

        System.out.println("Armut kaç kilo ? :  ");
        double armutKilo = sc.nextDouble();
        System.out.println("Elma kaç  kilo ? :  ");
        double elmaKilo = sc.nextDouble();
        System.out.println("Domates kaç kilo ? :  ");
        double domatesKilo = sc.nextDouble();
        System.out.println("Muz kaç  kilo ? :  ");
        double muzKilo = sc.nextDouble();
        System.out.println("Patlican kaç kilo ? :  ");
        double patlicanKilo = sc.nextDouble();

        double toplam = (Armut * armutKilo) + (Elma * elmaKilo) + (Domates * domatesKilo) + (Muz * muzKilo) + (Patlican * patlicanKilo );
        System.out.println("Toplam ödemeniz gereken tutar:  " +  toplam + "tl");
    }
}
