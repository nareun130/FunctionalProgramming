package ListPrint;

import java.util.List;

public class FP02Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        // 짝수만 출력
        printEvenNumbers(numbers);
    }

    // private static boolean isEven(int number) {
    //     return number % 2 == 0;
    // }

    private static void printEvenNumbers(List<Integer> numbers) {
        // numbers.stream().filter(FP02Functional::isEven).forEach(System.out::println);
        // ~> 람다식으로 더 간편하게
        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
        //! 이 처럼 함수형 프로그래밍에서는 수행할 작업에 초점을 마춘다.

    }
}
