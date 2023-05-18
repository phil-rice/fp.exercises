package one.xingyi.simpleFP;


import java.util.List;
import java.util.function.Function;

public interface ExampleFP {

    static <T> Function<List<T>, List<T>> mapFn(Function<T, T> fn) {
        throw new RuntimeException("You need to implement this code");
    }

    static <T> Function<T, T> add(Adder<T> adder, T value) {
        throw new RuntimeException("You need to implement this code");
    }

    static <T> Function<T, T> compose(Function<T, T>... fns) {
        throw new RuntimeException("You need to implement this code");
    }
}
