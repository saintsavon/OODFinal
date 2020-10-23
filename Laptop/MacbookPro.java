
package Laptop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MacbookPro extends MacLaptop {
    double cost = 1249.99;

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "Macbook Pro"; 
    }

    @Override
    public void addAppleCare() {
        System.out.println("Adding Apple Care...");
    }

    // hook
    public boolean customerWantsAppleCare(){
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")){
            cost = cost + 249.99; // This needs to be unified in some way
            return true;
        }
        else {
            return false; // Does this need curly braces
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like to upgrade your ram to 16GB for $200? (y/n)");

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

