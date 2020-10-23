package Desktop.DesktopDecorator;

import Desktop.Desktop;

public abstract class CPUCool extends WaterCoolDecorator {
    Desktop desktop;

    public CPUCool(Desktop desktop) {
        this.desktop = desktop;
    }

    @Override
    public double cost() {
        return 300 + desktop.cost();
    }

    @Override
    public String getDescription() {
        return desktop.getDescription() + ", CPU watercooling.";
    }
    
}
