
import Laptop.*;

public class LaptopFactory {

    public Laptop chooseLaptop(String laptopType) { // Replaces makeBeverage and beverageType
        if (laptopType.equals(null)){
            return null;
        }
        else if (laptopType.equals("Lenovo")){
            return new Lenovo();
        }
        else if(laptopType.equals("MSI")){
            return new MSI();
        }
        else if(laptopType.equals("MacbookAir")){
            return new MacbookAir();
        }
        else if(laptopType.equals("MacbookPro")){
            return new MacbookPro();
        }
        else if(laptopType.equals("Razer")){
            return new Razer();
        }
        return null;
    }
    
}
