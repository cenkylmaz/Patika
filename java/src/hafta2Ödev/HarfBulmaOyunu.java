package hafta2Ödev;

import java.util.ArrayList;
import java.util.Scanner;

public class HarfBulmaOyunu {
    public static void main(String[] args) {
        // 4 elemanlı ArrayList oluşturma ve rastgele harfler ekleme
        ArrayList<String> harfListesi = new ArrayList<>();
        harfListesi.add("a");
        harfListesi.add("b");
        harfListesi.add("c");
        harfListesi.add("d");

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 4 harf girişi alma
        for (int i = 0; i < 4; i++) {
            System.out.print("Lütfen bir harf giriniz: ");
            String girilenHarf = scanner.nextLine().toLowerCase();

            // Harfin listede olup olmadığını kontrol etme
            boolean harfVarMi = false;
            for (int j = 0; j < harfListesi.size(); j++) {
                if (harfListesi.get(j).equals(girilenHarf)) {
                    harfListesi.set(j, "found");
                    harfVarMi = true;
                    break;
                }
            }

            // Harf listede yoksa listeye ekleme
            if (!harfVarMi) {
                harfListesi.add(girilenHarf);
            }
        }