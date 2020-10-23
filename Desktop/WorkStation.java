// Concrete Component

package Desktop;

public class WorkStation extends Desktop {

    public WorkStation() {
        description = "High End Work Station";
    }

    @Override
    public double cost() {
        return 3000; 
    }
}