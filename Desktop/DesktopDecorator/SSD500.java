package Desktop.DesktopDecorator;

import Desktop.Desktop;

public abstract class SSD500 extends StorageDecorator {
    Desktop desktop;

    public SSD500(Desktop desktop) {
        this.desktop = desktop;
    }

    @Override
    public double cost() {
        return 100 + desktop.cost();
    }

    @Override
    public String getDescription() {
        return desktop.getDescription() + ", 500GB SSD.";
    }
    
}
