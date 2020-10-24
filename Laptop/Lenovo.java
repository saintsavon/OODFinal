
package Laptop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lenovo extends WindowsLaptop {
    double cost = 799.99;

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "Lenovo ThinkPad T490S"; 
    }

    @Override
    public void compBench() {
        System.out.println("Running benchmarks...");
    }

    @Override
    public void addCustom() {
        System.out.println("Adding your custom selections...");
    }

    // hook
    public boolean customerWantsCustomPart(){
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")){
            cost = cost + 75;
            return true;
        }
        else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like to upgrade your ram to 16GB for $75? (y/n)");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = input.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (answer == null) {
            answer = "no";
        }
        return answer;
    }
}

