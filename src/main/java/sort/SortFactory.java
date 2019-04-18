package sort;

public class SortFactory {

    public static ISort productSort(SortType type) {
        switch (type) {
            case BUBBLE:
                return new BubbleSort();
            default:
                return new BubbleSort();
        }
    }
}
