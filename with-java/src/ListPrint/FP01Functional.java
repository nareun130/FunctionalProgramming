package ListPrint;
import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        // 함수형 접근법
        printAllNumbers(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
    }

    private static void print(int number) {
        System.out.println(number);
    }

    private static void printAllNumbers(List<Integer> numbers) {
        // ! 함수형 접근에서는 "무슨 작업을 수행하느냐"가 중요
        // [12,9,13,4,6,2,4,12,15]
        // *-> 위의 리스트를 아래처럼 스트림으로 변환
        // 12
        // 9
        // 13
        // 4
        // ...
        // ~> 각 요소에 대해 이 메서드를 호출해야 한다.
        // numbers.stream().forEach(FP01Functional::print);// ?-> 메소드 참조
        numbers.stream(). forEach(System.out::println);
        
    }
}
