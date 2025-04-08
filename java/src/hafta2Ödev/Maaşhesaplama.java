package hafta2Ödev;

import java.util.Scanner;

public class Maaşhesaplama {
    public static void main(String[] args) {
        System.out.println("brüt maaşınızı giriniz: ");
        Scanner sc = new Scanner(System.in);
        int brut = sc.nextInt();
        int vergi ;
        int maas ;
        if (brut <1000) {
            vergi = brut *1*10;
            maas = brut-vergi;


        }
        else {
            vergi=brut*3/10;
            maas = brut-vergi;
        }
        System.out.println("ödediğiniz vergi= "+vergi);
        System.out.println("net maaşınız=  " +maas);
    }
}
