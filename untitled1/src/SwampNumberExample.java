public class SwampNumberExample {

    public static void main(String[] args){
        int a = 5 ;
        int b = 4 ;

        System.out.println("a " + ":" + " - " + "b: " + b );

        int temp = a;
        a =b;

        System.out.println("a " + ":" + " - " + "b: " + b);

        b = temp;

        System.out.println("a " + ":" + " - " + "b: " + b);


    }
}
