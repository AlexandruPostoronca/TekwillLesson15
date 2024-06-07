/**
 * Box for pies
 */
public class PieBox extends Box {

    private Pie pie;

    public void put(Pie pie) {
        this.pie = pie;
    }

    public Pie get() {
        return this.pie;
    }
}
