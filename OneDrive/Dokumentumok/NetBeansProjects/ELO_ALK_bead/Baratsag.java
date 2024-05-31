public class Baratsag<T extends Ember> {
    private T ember1;
    private T ember2;

    public Baratsag(T ember1, T ember2) {
        this.ember1 = ember1;
        this.ember2 = ember2;
    }

    public T getEmber1() {
        return ember1;
    }

    public void setEmber1(T ember1) {
        this.ember1 = ember1;
    }

    public T getEmber2() {
        return ember2;
    }

    public void setEmber2(T ember2) {
        this.ember2 = ember2;
    }

    @Override
    public String toString() {
        return "Baratsag{" +
                "ember1=" + ember1 +
                ", ember2=" + ember2 +
                '}';
    }
}
