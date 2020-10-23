// Concrete Component

package Desktop;

public class GamingStation extends Desktop {

    public GamingStation() {
        description = "High End Gaming Desktop";
    }

    @Override
    public double cost() {
        return 2000; // Temp price for high end gaming station
    }
}