// Concrete Component

package Desktop;

public class BrowsingStation extends Desktop {

    public BrowsingStation() {
        description = "Casual Browsing Desktop";
    }

    @Override
    public double cost() {
        return 1000; 
    }
}