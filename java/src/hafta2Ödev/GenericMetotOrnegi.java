package hafta2Ödev;

public class GenericMetotOrnegi {

    // Generic metot tanımı
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // Bir sonraki çıktı için satır başı
    }

    public static void main(String[] args) {
        // Integer dizisi
        Integer[] intArray = {1, 2, 3, 4, 5};

        // String dizisi
        String[] strArray = {"Java", "Generics", "Ödev"};

        // Double dizisi (ek örnek)
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};

        // Generic metodu farklı türlerle çağırma
        printArray(intArray);
        printArray(strArray);
        printArray(doubleArray);
    }
}