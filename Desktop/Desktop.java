// Component

package Desktop;

public abstract class Desktop {
    String description="";

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public void prepareWorkstation(String type) { 
        System.out.println("Preparing " + type + " workstation...");
    }

    public void buildDesktop(String type) { 
        System.out.println("Building " + type + " desktop...");
    }

    public void deliverDesktop(String type) {   
        System.out.println("Delivering your " + type + " to you!");
    }
    
}
