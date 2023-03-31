import java.util.TreeMap;
public class toRimOtv {
    TreeMap<Integer, String>arab = new TreeMap<>();
    public toRimOtv() {
        arab.put(100, "C");
        arab.put(90, "XC");
        arab.put(50, "L");
        arab.put(40, "XL");
        arab.put(10, "X");
        arab.put(9, "IX");
        arab.put(5, "V");
        arab.put(4, "IV");
        arab.put(1, "I");
    }

    public String toRim(int number) {
        String rim = "";
        int arab2;
        do {
            arab2 = arab.floorKey(number);
            rim += arab.get(arab2);
            number -= arab2;
        }  while (number != 0);
        return rim;
    }
}
