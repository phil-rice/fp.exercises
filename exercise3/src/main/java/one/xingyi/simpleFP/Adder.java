package one.xingyi.simpleFP;

public interface Adder<T> {
    T zero();

    T add(T t1, T t2);

    static Adder<Integer> forInt = new AdderForInt<>();

}

class AdderForInt<T> implements Adder<Integer> {


    @Override
    public Integer zero() {
        return 0;
    }

    @Override
    public Integer add(Integer t1, Integer t2) {
        return t1 + t2;
    }
}
