package Desktop.DesktopDecorator;

import Desktop.Desktop;

public abstract class GPUCool extends WaterCoolDecorator {
    Desktop desktop;

    public GPUCool(Desktop desktop) {
        this.desktop = desktop;
    }

    @Override
    public double cost() {
        return 400 + desktop.cost();
    }

    @Override
    public String getDescription() {
        return desktop.getDescription() + ", GPU watercooling.";
    }
    
}