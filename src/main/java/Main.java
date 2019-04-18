import sort.ISort;
import sort.SortFactory;
import sort.SortType;

public class Main {

    public static void main(String[] args) {
        testSrot();
    }

    public static void testSrot() {
        ISort iSort = SortFactory.productSort(SortType.BUBBLE);

        int[] array = {20, 10, 22, 1, 4, 6, 25, 13, 7};

        int[] sort = iSort.sort(array);

        printArray(sort);
    }

    public static void printArray(int[] array) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int a : array) {
            stringBuffer.append(a);
            stringBuffer.append(", ");
        }
        stringBuffer.delete(stringBuffer.length() - 2, stringBuffer.length());
        String s = stringBuffer.toString();
        System.out.println(s);
    }
}

