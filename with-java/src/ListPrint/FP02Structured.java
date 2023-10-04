package ListPrint;

import java.util.List;

public class FP02Structured {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        // 짝수만 출력
        printEvenNumbers(numbers);
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
