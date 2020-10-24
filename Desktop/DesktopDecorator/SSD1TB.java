package Desktop.DesktopDecorator;

import Desktop.Desktop;

public class SSD1TB extends StorageDecorator {
    Desktop desktop;

    public SSD1TB(Desktop desktop) {
        this.desktop = desktop;
    }

    @Override
    public double cost() {
        return 175 + desktop.cost();
    }

    @Override
    public String getDescription() {
        return desktop.getDescription() + ", 1TB SSD.";
    }
    
}

