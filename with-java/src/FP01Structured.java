import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        // 기존 구조적 접근법
        printAllNumbers(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
    }

    private static void printAllNumbers(List<Integer> numbers) {

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
