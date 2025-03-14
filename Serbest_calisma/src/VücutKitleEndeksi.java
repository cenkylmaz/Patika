
import java.util.Scanner;

public class VücutKitleEndeksi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input weight in Kilogram:  ");
        double weight =sc.nextDouble();
        System.out.println("Input height in Metre:  ");
        double height =sc.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("The Body Mass Index(BMI) is  " + BMI + ("kg / m2 "));



    }
}
