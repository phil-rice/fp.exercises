package one.xingyi.money;

import lombok.RequiredArgsConstructor;

import java.util.List;

interface MoneyHelper<T> {
    T addAll(List<T> monies);

    List<T> split(T t, int n);

    MoneyHelper<Integer> forInt = new MoneyHelperFor<>(Money.forInt);
    MoneyHelper<Double> forDouble = new MoneyHelperFor<>(Money.forDouble);
}

@RequiredArgsConstructor
class MoneyHelperFor<T> implements MoneyHelper<T> {
    private final Money<T> money;

    @Override
    public T addAll(List<T> monies) {
        throw new RuntimeException("This is the code you have to implement");
    }

    @Override
    public List<T> split(T t, int n) {
        throw new RuntimeException("This is the code you have to implement");
    }
}
