public class FindMaxValue {
    public static <T extends Comparable<T>> T max(T... elements) {
        T max = elements[0];
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Integer Max: " + max(Integer.valueOf(32), Integer.valueOf(56), Integer.valueOf(89), Integer.valueOf(456)));
        System.out.println("Double Max: " + max(Double.valueOf(5.6), Double.valueOf(7.8), Double.valueOf(2.9), Double.valueOf(18.9), Double.valueOf(10.25)));
        System.out.println("String Max: " + max("Strawberry", "Mango", "Apple", "Date"));
        System.out.println("Boolean Max: " + max(Boolean.TRUE, Boolean.FALSE));
        System.out.println("Byte Max: " + max(Byte.MIN_VALUE, Byte.MAX_VALUE));
    }
}
