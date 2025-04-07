package hafta2Ödev;

import java.util.Scanner;

public class Asalsayı {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int a = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(a + "Sayısı asaldır ");

        }else{
            System.out.println(a + "Sayısı asal değildir");
        }

    }
}
