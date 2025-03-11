import java.util.Scanner;

public class Pratik2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Apartmanın yarıçapını giriniz: ");

        double radius = scanner.nextDouble();
        double pi = 3.14;

        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;

        double area2 =Math.PI*radius* radius;
        double circumference2 = 2 * Math.PI * radius;

        System.out.println("Dairenin alanları: " + area + " - " + area2);
        System.out.println("Dairenin çevresi: " + circumference + " - " + circumference2);



    }
}
