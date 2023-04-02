public class DifferentSorts {

    public static int[] doBubbleSort(int[] numbers) {
        int temporaryElement = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temporaryElement = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temporaryElement;
                }
            }
        }
        return numbers;
    }

    public static int[] doInsertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int temp = numbers[i];
            int additional = i - 1;
            while (additional >= 0 && numbers[additional] > temp) {
                numbers[additional + 1] = numbers[additional];
                additional--;
            }
            numbers[additional + 1] = temp;
        }
        return numbers;
    }
}