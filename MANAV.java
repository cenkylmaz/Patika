import java.util.Scanner;

public class ManavKASA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double armut = 2,14;
        double elma = 3,67;
        double domates = 1,11;
        double muz = 0,94;
        double patlican = 5,00;

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

        double toplam = (armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlican * patlicanKilo );
    }
}
