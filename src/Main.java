import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //task 1
        Predicate <Integer> isPositive = value -> value > 0;
        Predicate <Integer> isPositiveAnClass = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };
        //task 2
        Consumer <String> hello = value -> System.out.println(value);
        Consumer <String> helloAnClass = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        //task 3
        Function <Double, Long> round = value -> Math.round(value);
        Function <Double, Long> roundAnClass = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        //task 4
        Supplier <Integer> random = () -> ThreadLocalRandom.current().nextInt(0, 100);
        Supplier <Integer> randomAnClass = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return ThreadLocalRandom.current().nextInt(0, 100);
            }
        };
        }
    //task 5
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return (value) -> condition.test (value) ? ifTrue.apply(value):ifFalse.apply(value);










    }
}