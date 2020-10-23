
package Laptop;

public abstract class MacLaptop implements Laptop{
    public abstract double cost();
    public abstract String getDescription();

    // Template method
    @Override
    public void gatherLaptop() {
        packLap();

        if(customerWantsAppleCare()) {
            addAppleCare();
        }
    }

    public void packLap(){
        System.out.println("Packing your laptop!");
    }

    public void addAppleCare(){
        System.out.println("Adding Apple Care");
    }

    //hook
    boolean customerWantsAppleCare(){
        return true; 
    }

}
