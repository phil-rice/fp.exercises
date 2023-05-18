package one.xingyi.money;

import lombok.RequiredArgsConstructor;
import one.xingyi.simpleFP.Adder;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;

import static one.xingyi.simpleFP.ExampleFP.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RequiredArgsConstructor
abstract public class AdderTest<T> {
    private final Adder<T> adder;
    private final Function<Integer, T> tFn;

    T t(int t) {
        return tFn.apply(t);
    }

    @Test
    public void testAdder() {
        assertEquals(t(5), adder.add(t(2), t(3)));
    }

    @Test
    public void testCanMap() {
        Function<List<T>, List<T>> fn = mapFn(t -> adder.add(t, t(2)));
        assertEquals(List.of(), fn.apply(List.of()));
        assertEquals(List.of(t(2), t(3), t(4)), fn.apply(List.of(t(1), t(2), t(3))));
    }

    @Test
    public void testCanAdd() {
        Function<T, T> add2 = add(adder, t(2));
        assertEquals(t(3), add2.apply(t(1)));
    }

    @Test
    public void testCanCompose() {
        Function<T, T> add1 = add(adder, t(1));
        Function<T, T> add2 = add(adder, t(2));
        Function<T, T> add3 = add(adder, t(3));
        Function<T, T> add6 = compose(add1, add2, add3);

        assertEquals(t(7), add6.apply(t(1)));
    }
}
