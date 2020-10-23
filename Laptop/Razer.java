
package Laptop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Razer extends WindowsLaptop {
    double cost = 1599.99;

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "Razer Blade Stealth"; 
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
            cost = cost + 125; // This needs to be unified in some way
            return true;
        }
        else {
            return false; // Does this need curly braces
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like to upgrade your ram to 16GB for $125? (y/n)");

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

