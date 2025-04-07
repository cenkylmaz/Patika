package week1;

import java.util.Scanner;

public class MinMavSayı {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç adet sayı gireceksiniz:  ");
        int sayi = input.nextInt();

        int min = 0;
        int max = 0;
        int number;
        for (int i = 1; i <=sayi; i++) {
            System.out.println(i + ".bir sayi giriniz: ");
             number = input.nextInt();
            if (number < min || min == 0) {
                min = number;
            }
            if (number > max) {
                max = number;

            }
        } System.out.println("Girilen sayılar arasında en küçük sayı :  " + min);
        System.out.println("Girilen sayılar arasında en büyük sayı :  " + max);

    }
}