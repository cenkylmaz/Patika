package hafta2Ödev;

import java.util.Scanner;

public class Üsalma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ÜS alınacak sayı giriniz: ");
        int n = sc.nextInt();

        System.out.println("Üs olacaka sayı giriniz: ");
        int m = sc.nextInt();

        int i = 1 ;
        while (i <= m) {
            System.out.println(i);
            i++;

        }
    }
}
