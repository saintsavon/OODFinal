// Receiver

import Laptop.Laptop;
import Desktop.Desktop;
import Desktop.DesktopDecorator.*;
import Desktop.DesktopDecorator.SSD500;
import Desktop.DesktopDecorator.SSD1TB;
import Desktop.DesktopDecorator.SSD2TB;

public class Builder {
    public String desktopType="";
    public String laptopType="";
    public String storageList[] = null;
    public String waterCoolList[] = null;

    Desktop desktop;
    Laptop laptop;

    public void getOrder(String factoryType){
        if (factoryType.equalsIgnoreCase("Desktop")){ // Not sure if Desktop should be Desktop or the individual desktop types
            System.out.println(desktopType + " order received.");

            DesktopFactory factory = new DesktopFactory();
            desktop = factory.buildDesktop(desktopType);

            desktop.prepareWorkstation(desktopType);
            desktop.buildDesktop(desktopType);
            desktop.deliverDesktop(desktopType);
            desktop = decorate(storageList, waterCoolList);

            System.out.println(desktop.getDescription() + " order completed.");
            System.out.println("Cost: $" + desktop.cost());
        }
        else if (factoryType.equalsIgnoreCase("Laptop")){
            System.out.println(laptopType + " order received.");

            LaptopFactory factory = new LaptopFactory();
            laptop = factory.chooseLaptop(laptopType);
            laptop.gatherLaptop();

            System.out.println(laptop.getDescription() + " order completed.");
            System.out.println("Cost: $" + laptop.cost());
        }
        System.out.println("");
    }

    public Desktop decorate(String[] storageList, String[] waterCoolList){
        for (int i=0; i < storageList.length; i++) {
            String storage = storageList[i];
            if (storage.equals("500GB")){
                desktop = new SSD500(desktop); 
            }
            else if (storage.equals("1TB")){
                desktop = new SSD1TB(desktop);
            }
            else if (storage.equals("2TB")){
                desktop = new SSD2TB(desktop);
            }
        }

        for (int i=0; i < waterCoolList.length; i++) {
            String water = waterCoolList[i];
            if (water.equals("CPU")){
                desktop = new CPUCool(desktop);
            }
            else if (water.equals("GPU")){
                desktop = new GPUCool(desktop);
            }
            else if (water.equals("CPUGPUCool")){ 
                desktop = new CPUGPUCool(desktop);
            }
        }
        return desktop;
    }
}
