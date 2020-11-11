package D_JavaAdvancedOOP.Lecture1_Abstraction.ExProblem6;
public class Item {

    private long quantity;

    protected Item(long quantity) {
        this.quantity = quantity;
    }


    public long getQuantity() {
        return this.quantity;
    }

    protected void addQuantity(long quantity) {
        this.quantity += quantity;
    }


}
