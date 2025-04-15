package hafta2Ödev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HarfFrekansiBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kelimeleri giriniz: ");
        String kelime = scanner.nextLine().toLowerCase(); // Büyük/küçük harf farkını ortadan kaldır

        // Harf frekanslarını tutacak Map
        Map<Character, Integer> harfFrekanslari = new HashMap<>();

        // Kelimeyi karakter karakter dolaş
        for (int i = 0; i < kelime.length(); i++) {
            char c = kelime.charAt(i);

            // Sadece harfleri dikkate al
            if (Character.isLetter(c)) {
                // Harf zaten Map'te varsa sayısını artır, yoksa 1 olarak ekle
                harfFrekanslari.put(c, harfFrekanslari.getOrDefault(c, 0) + 1);
            }
        }

        // Sonuçları yazdır
        for (Map.Entry<Character, Integer> entry : harfFrekanslari.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        scanner.close();
    }
}
