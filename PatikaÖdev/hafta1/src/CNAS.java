public class CNAS {
    public static void main(String[] args) {
        public class Araba {
            String marka;
            int yil;
            String renk;

            // 1. Constructor: Tüm parametreler
            public Araba(String marka, int yil, String renk) {
                this.marka = marka;
                this.yil = yil;
                this.renk = renk;
            }

            // 2. Constructor: Marka ve yıl alır, renk default "Siyah" olur
            public Araba(String marka, int yil) {
                this(marka, yil, "Siyah"); // Üstteki 3 parametreli constructor'ı çağırır
            }

            // 3. Constructor: Sadece marka alır, yıl=2023, renk="Beyaz"
            public Araba(String marka) {
                this(marka, 2023, "Beyaz");
            }
    }
    public class Araba {
    String marka;
    int yil;
    String renk;

    // 1. Constructor: Tüm parametreler
    public Araba(String marka, int yil, String renk) {
        this.marka = marka;
        this.yil = yil;
        this.renk = renk;
    }

    // 2. Constructor: Marka ve yıl alır, renk default "Siyah" olur
    public Araba(String marka, int yil) {
        this(marka, yil, "Siyah"); // Üstteki 3 parametreli constructor'ı çağırır
    }

    // 3. Constructor: Sadece marka alır, yıl=2023, renk="Beyaz"
    public Araba(String marka) {
        this(marka, 2023, "Beyaz");
    }
}
}
