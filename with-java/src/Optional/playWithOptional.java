package Optional;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class playWithOptional {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "mango");

        // ~> b로 시작하는 것이 있을 수 도 없을 수도 있다.
        Predicate<? super String> predicate = fruit -> fruit.startsWith("b");
        // * Optional은 Null이 아닌 값을 포함할 수도, 하지 않을 수도 있는 객체
        Optional<String> optional = fruits.stream().filter(predicate).findFirst();
        System.out.println(optional);
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        System.out.println(optional.get());

        // ? null이 발생할 것 같은 상황에서는 Optional을 사용하는 것이 좋다.
        Optional<String> fruit = Optional.of("banana");
        //! java8부터는 빈 값에 null을 넣지 않고 Optional 사용할 것을 권장
        Optional<String> empty = Optional.empty();

    }
}
