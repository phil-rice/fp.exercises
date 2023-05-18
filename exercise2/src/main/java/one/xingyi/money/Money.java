package one.xingyi.money;

public interface Money<T> {

    T zero();
    T add(T t1, T t2);

    T subtract(T t1, T t2);

    T divide(T t, int n);

    static Money<Integer> forInt = new MoneyForInt();
    static Money<Double> forDouble = new MoneyForDouble();

}

class MoneyForInt implements Money<Integer> {


    @Override
    public Integer zero() {
        return 0;
    }

    @Override
    public Integer add(Integer t1, Integer t2) {
        return t1 + t2;
    }

    @Override
    public Integer subtract(Integer t1, Integer t2) {
        return t1 - t2;
    }

    @Override
    public Integer divide(Integer t, int n) {
        return t / n;
    }
}

class MoneyForDouble implements Money<Double> {

    @Override
    public Double zero() {
        return 0.0;
    }

    @Override
    public Double add(Double t1, Double t2) {
        return t1 + t2;
    }

    @Override
    public Double subtract(Double t1, Double t2) {
        return t1 - t2;
    }

    @Override
    public Double divide(Double t, int n) {
        return t / n;
    }
}