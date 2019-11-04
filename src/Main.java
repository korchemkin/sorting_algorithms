import com.github.korchemkin.Sorter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] unsortedArr = {5, 8, 1, 3, 9, 6};

        Sorter sorter = new Sorter();
        int[] insertionSortResult = sorter.insertionSort(unsortedArr);
        int[] selectionSortResult = sorter.selectionSort(unsortedArr);

        System.out.println("unsortedArr " + Arrays.toString(unsortedArr));
        System.out.println("insertionSortResult " + Arrays.toString(insertionSortResult));
        System.out.println("selectionSortResult " + Arrays.toString(selectionSortResult));
    }
}
