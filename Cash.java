package D_JavaAdvancedOOP.Lecture1_Abstraction.ExProblem6;

public class Cash extends Item {
    private String name;
    
    
    public Cash(String name, long quantity) {
        super(quantity);
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("##%s - %d",this.name, this.getQuantity());
    }
    
}
