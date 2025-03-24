import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List list = new List();

        List<String> names = new ArrayList<>();

        names.add("Mehmet");
        names.add("Kaya");
        names.add("Sayi");
        names.add("Sayi");

        names.remove("Sayi");
        int[] sayilara = {1,2,4,50};
        System.out.println(sayilara[1]);
    }
}
