package week4;

import java.util.Scanner;

public class Artıkyılhesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yıl giriniz:  ");
        int year = input.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Artık yıldır ");
        }else{
            System.out.println(year + " Artık yıl değidir ");
        }
    }
}
