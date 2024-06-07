public class NonGenericClass<T> {
    private Object val;

    public NonGenericClass(Object val) {
        this.val = val;
    }

    public Object getVal() {
        return val;
    }
}
