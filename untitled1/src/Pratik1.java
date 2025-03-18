import java.util.Scanner;

public class Pratik1 {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the name : ");
        String name = scanner.nextLine();

        System.out.println("Enter the age  : ");
        int age = scanner.nextInt();

        System.out.println("Merhaba " + name + " is "  + age + " years old ");

    }
}
