
package Laptop;

public abstract class WindowsLaptop implements Laptop {
    public abstract double cost();
    public abstract String getDescription();

    //template method
    @Override
    public void gatherLaptop() {
        idParts();
        compBench();
        packLap();

        if(customerWantsCustomPart()) { 
            addCustom(); 
        }
    }

    public void idParts(){
        System.out.println("Identifying most reasonable parts...");
    }

    public abstract void compBench();

    public void packLap(){
        System.out.println("Packing your laptop!");
    }

    public abstract void addCustom();

    boolean customerWantsCustomPart(){
        return true;
    }
    
}
