
package Laptop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MacbookAir extends MacLaptop {
    double cost = 999.99;

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "Macbook Air"; 
    }

    @Override
    public void addAppleCare() {
        System.out.println("Adding Apple Care...");
    }

    // hook
    public boolean customerWantsAppleCare(){
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")){
            cost = cost + 249.99;
            return true;
        }
        else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like to upgrade your ram to 16GB for $150? (y/n)");

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
