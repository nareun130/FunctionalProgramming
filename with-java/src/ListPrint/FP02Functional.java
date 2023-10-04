package ListPrint;

import java.util.List;

public class FP02Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        // 짝수만 출력
        printEvenNumbers(numbers);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        numbers.stream().filter(FP02Functional::isEven).forEach(System.out::println);
    }
}
