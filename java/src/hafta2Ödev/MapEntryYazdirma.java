package hafta2Ödev;

import java.util.HashMap;
import java.util.Map;

public class MapEntryYazdirma {
    public static void main(String[] args) {
        // HashMap oluşturma
        Map<String, Integer> scores = new HashMap<>();

        // Map'e 5 farklı key-value çifti ekleme
        scores.put("Ali", 85);
        scores.put("Ayşe", 92);
        scores.put("Mehmet", 78);
        scores.put("Zeynep", 90);
        scores.put("Burak", 88);

        // Entry'leri satır satır yazdırma
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
