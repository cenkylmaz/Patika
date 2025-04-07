import java.util.Scanner;

public class Artıkyıl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yil ;
        System.out.println("yıl giriniz:  ");
        yil = sc.nextInt();
        if(yil %4 == 0){
            if (yil % 100 == 0)
                if(yil % 400 == 0)
                    System.out.println( yil + "Artık yildir ");
            else System.out.println(yil + "Artik yil değildir ");
            else System.out.println(yil + "Artik yildir");




        }
        else
            System.out.println(yil +"artik yil değildir ");
    }
}
