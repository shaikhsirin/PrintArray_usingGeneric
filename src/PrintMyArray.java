public class PrintMyArray <E> {
    E[] myArray;
    public PrintMyArray(E[] myArray) {
        this.myArray = myArray;
    }
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4};
        Double[] b = {1.1, 2.2, 3.3};
        Character[] c = {'a', 'b', 'c'};
        toprint(a);
        toprint(b);
        toprint(c);
        new PrintMyArray<Integer>(a).toPrint();
        new PrintMyArray<Double>(b).toPrint();
        new PrintMyArray<Character>(c).toPrint();

    }

    private void toPrint() {
        toprint(myArray);
    }

    private static  <E> void toprint(E[] a) {
        for (E i: a) {
            System.out.println(i);
        }
    }
}
