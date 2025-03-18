public class Stringler {
    public static void main(String[] args ){
        String name = "Merhaba Dünya ";
        System.out.println(name);
        //length dizinin ne kadar olduğunu yazar kısaca kaç karakter olduğu.
        int length = name.length();
        System.out.println(length);
        //toLowerCase diziyi küçük harflere ile yazar.
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String toUpper = name.toUpperCase();
        System.out.println(toUpper);

        //charAt sayının o harfini seçerek yazar.
        System.out.println(name.charAt(4));

        System.out.println(name.substring(0,4));
        String hi="merhaba";
        System.out.println(hi + "Patika");

        boolean isStringsEquals1 = name.equals(hi);
        System.out.println(isStringsEquals1);

        String s1="merhaba";
        String s2="merhaba2";
        String s3="merhabbba";

        System.out.println("s1 s2 ye eşit mi: " + s1.equals(s2));
        System.out.println(s1 == s3);
        // equals eşittir yani == kısa yolu .

    }


}
