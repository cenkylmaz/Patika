package week1;

import java.util.Scanner;

public class SifreKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen şifrenizi giriniz: ");
        String sifre = scanner.nextLine();

        if (sifreKontrol(sifre)) {
            System.out.println("Geçerli Şifre");
        } else {
            System.out.println("Geçersiz Şifre");
        }
    }

    public static boolean sifreKontrol(String sifre) {
        // 1. En az 8 karakter kontrolü
        if (sifre.length() < 8) {
            return false;
        }

        // 2. Boşluk karakteri kontrolü
        if (sifre.contains(" ")) {
            return false;
        }

        // 3. İlk harfin büyük olma kontrolü
        if (sifre.isEmpty() || !Character.isUpperCase(sifre.charAt(0))) {
            return false;
        }

        // 4. Son karakterin '?' olma kontrolü
        if (sifre.isEmpty() || sifre.charAt(sifre.length() - 1) != '?') {
            return false;
        }

        // Tüm kontroller başarılı ise
        return true;
    }
}