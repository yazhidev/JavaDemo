package sort;

public class BubbleSort implements ISort {
    @Override
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) { // 最后一轮只有一个数字，不用再走一轮
            for (int j = 0; j < array.length - i - 1; j++) { // 因为下面有 j + 1，所以长度要 -1 防止溢出
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
