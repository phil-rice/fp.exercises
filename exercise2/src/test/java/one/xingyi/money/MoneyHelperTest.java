package one.xingyi.money;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RequiredArgsConstructor
abstract public class MoneyHelperTest<T> {
    private final MoneyHelper<T> moneyHelperTC;
    private final Function<Integer, T> moneyFn;

    T money(int i) {
        return moneyFn.apply(i);
    }

    @Test
    public void testAddAll() {
        assertEquals(money(0), moneyHelperTC.addAll(List.of()));
        assertEquals(money(5), moneyHelperTC.addAll(List.of(money(5))));
        assertEquals(money(7), moneyHelperTC.addAll(List.of(money(3), money(4))));
    }

    @Test
    public void testCanSplit() {
        assertEquals(List.of(money(10)), moneyHelperTC.split(money(10), 1));
        assertEquals(List.of(money(5), money(5)), moneyHelperTC.split(money(10), 2));
        assertEquals(List.of(money(4), money(3), money(3)), moneyHelperTC.split(money(10), 3));
    }

}

class IntMoneyHelperTest extends MoneyHelperTest<Integer> {
    public IntMoneyHelperTest() {
        super(MoneyHelper.forInt, i -> i);
    }
}

class DoubleMoneyHelperTest extends MoneyHelperTest<Double> {
    public DoubleMoneyHelperTest() {
        super(MoneyHelper.forDouble, i -> i.doubleValue());
    }
}
