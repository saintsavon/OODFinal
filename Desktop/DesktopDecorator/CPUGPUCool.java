package Desktop.DesktopDecorator;

import Desktop.Desktop;

public class CPUGPUCool extends WaterCoolDecorator {
    Desktop desktop;

    public CPUGPUCool(Desktop desktop) {
        this.desktop = desktop;
    }

    @Override
    public double cost() {
        return 700 + desktop.cost();
    }

    @Override
    public String getDescription() {
        return desktop.getDescription() + ", CPU and GPU watercooling.";
    }
    
}
