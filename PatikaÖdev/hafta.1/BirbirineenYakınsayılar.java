import java.util.ArrayList;
import java.util.Collections;

public class BirbirineenYakınsayılar {

        public static void main(String[] args) {
            // Benzersiz ve pozitif sayılardan oluşan ArrayList oluşturma
            ArrayList<Integer> sayilar = new ArrayList<>();
            sayilar.add(15);
            sayilar.add(7);
            sayilar.add(32);
            sayilar.add(24);
            sayilar.add(11);
            sayilar.add(19);
            sayilar.add(3);
            sayilar.add(28);
            sayilar.add(13);
            sayilar.add(5);

            // Listeyi sıralayarak karşılaştırmayı kolaylaştırıyoruz
            Collections.sort(sayilar);

            int minFark = Integer.MAX_VALUE;
            int sayi1 = 0;
            int sayi2 = 0;

            // Sıralı listede ardışık elemanlar arasındaki farkları karşılaştırıyoruz
            for (int i = 0; i < sayilar.size() - 1; i++) {
                int fark = sayilar.get(i + 1) - sayilar.get(i);
                if (fark < minFark) {
                    minFark = fark;
                    sayi1 = sayilar.get(i);
                    sayi2 = sayilar.get(i + 1);
                }
            }

            // Sonucu ekrana yazdırıyoruz
            System.out.println("Listedeki sayılar: " + sayilar);
            System.out.println("Birbirine en yakın iki sayı: " + sayi1 + " ve " + sayi2);
            System.out.println("Aradaki fark: " + minFark);
        }
}
