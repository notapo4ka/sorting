import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbersForBubbleSort = {5, 2, 6, 1, 4, 10, 7, 15};
        int[] numbersForInsertionSort = {7, 1, 4, 10, 9, 15, 7, 15};

        System.out.println("BubbleSort");
        System.out.println(Arrays.toString(DifferentSorts.doBubbleSort(numbersForBubbleSort)));

        System.out.println();

        System.out.println("Insertion sort");
        System.out.println(Arrays.toString(DifferentSorts.doInsertionSort(numbersForInsertionSort)));
    }
}