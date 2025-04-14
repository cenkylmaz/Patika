package hafta2Ödev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Film {
    private String ad;
    private int yayinYili;
    private String tur;
    private double imdbPuan;

    public Film(String ad, int yayinYili, String tur, double imdbPuan) {
        this.ad = ad;
        this.yayinYili = yayinYili;
        this.tur = tur;
        this.imdbPuan = imdbPuan;
    }

    // Getter metodları
    public String getAd() {
        return ad;
    }

    public int getYayinYili() {
        return yayinYili;
    }

    public String getTur() {
        return tur;
    }

    public double getImdbPuan() {
        return imdbPuan;
    }

    @Override
    public String toString() {
        return "Film{" +
                "ad='" + ad + '\'' +
                ", yayinYili=" + yayinYili +
                ", tur='" + tur + '\'' +
                ", imdbPuan=" + imdbPuan +
                '}';
    }
}

public class FilmKoleksiyonu {
    public static void main(String[] args) {
        // Film koleksiyonu oluşturma
        List<Film> filmListesi = new ArrayList<>();
        filmListesi.add(new Film("Başlangıç", 2010, "Bilim Kurgu", 8.8));
        filmListesi.add(new Film("Yüzüklerin Efendisi: Kralın Dönüşü", 2003, "Fantastik", 9.0));
        filmListesi.add(new Film("Kara Şövalye", 2008, "Aksiyon", 9.0));
        filmListesi.add(new Film("Dövüş Kulübü", 1999, "Drama", 8.8));
        filmListesi.add(new Film("Forrest Gump", 1994, "Drama", 8.8));

        // IMDb puanına göre büyükten küçüğe sıralama
        System.out.println("IMDb Puanına Göre Sıralama (Büyükten Küçüğe):");
        filmListesi.sort(Comparator.comparingDouble(Film::getImdbPuan).reversed());
        filmListesi.forEach(System.out::println);

        // Yayın yılına göre küçükten büyüğe sıralama
        System.out.println("\nYayın Yılına Göre Sıralama (Küçükten Büyüğe):");
        filmListesi.sort(Comparator.comparingInt(Film::getYayinYili));
        filmListesi.forEach(System.out::println);

        // Film türüne göre filtreleme
        System.out.println("\nDrama Türündeki Filmler:");
        filmleriFiltrele(filmListesi, "Drama");
    }

    // Belirli bir türdeki filmleri filtreleyen metod
    public static void filmleriFiltrele(List<Film> filmler, String tur) {
        filmler.stream()
                .filter(film -> film.getTur().equalsIgnoreCase(tur))
                .forEach(System.out::println);
    }
}
