package Desktop.DesktopDecorator;

import Desktop.Desktop;

public class SSD2TB extends StorageDecorator {
    Desktop desktop;

    public SSD2TB(Desktop desktop) {
        this.desktop = desktop;
    }

    @Override
    public double cost() {
        return 270 + desktop.cost();
    }

    @Override
    public String getDescription() {
        return desktop.getDescription() + ", 2TB SSD.";
    }
    
}

