
public class LaptopOrder implements Command{

    Builder builder;
    String order;

    public LaptopOrder(Builder builder, String order){
        this.builder = builder;
        this.order = order;
    }

    @Override
    public void buildReady() {
        builder.laptopType = order;
        builder.getOrder("Laptop");
    }
    
}
