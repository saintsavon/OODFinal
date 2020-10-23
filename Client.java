import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    static String laptopType="";
    public static void main(String[] args) {
        Consultant consultant = new Consultant();
        Builder builder = new Builder();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("What do you want to order?");
            System.out.println("(1) Desktop");
            System.out.println("(2) Laptop");
            System.out.println("(3) No thanks, I'm done!");

            int a = scanner.nextInt();
            if(a==1) {
                ArrayList<String> storageList = new ArrayList<>();
                ArrayList<String> waterCoolList = new ArrayList<>();

                String desktopType = null;
                String answer = null;

                while (true) { // Make sure this functions as intended
                    System.out.println("Which desktop do you want?");
                    System.out.println("(1) High End Work Station - Starting at: $3000");
                    System.out.println("(2) High End Gaming Desktop - Starting at: $2000");
                    System.out.println("(3) Casual Browsing Desktop - Starting at: $1000");

                    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                    try {
                        answer = input.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    if (answer.equals("1")) {
                        desktopType = "High End Work Station Desktop"; // Make sure this is consistent throughout
                        System.out.println("You have chosen the high end work station.");
                        break;
                    } else if (answer.equals("2")) {
                        desktopType = "High End Gaming Desktop";
                        System.out.println("You have chosen the high end gaming desktop.");
                        break;
                    } else if (answer.equals("3")) {
                        desktopType = "Casual Browsing Desktop";
                        System.out.println("You have chosen the casual browsing desktop.");
                        break;
                    } else {
                        continue;
                    }
                }
                scanner.close();
                System.out.println("");

                // Storage options selections loop
                System.out.println("-------------------- ADDITIONAL COMPONENTS --------------------\n");
                Scanner scan = new Scanner(System.in);
                for (int i = 0; i < 2; i++) {
                    System.out.println("-------------------- Storage Amounts --------------------");
                    System.out.println("(1) 500GB SSD - $100.");
                    System.out.println("(2) 1TB SSD - $175.");
                    System.out.println("(3) 2TB SSD - $270.");
                    System.out.println("(4) I have chosen my storage amount.");

                    int value = scan.nextInt();
                    if (value == 1) {
                        storageList.add("500GB");
                        System.out.println("You have chosen a 500GB SSD.");
                    } else if (value == 2) {
                        storageList.add("1TB");
                        System.out.println("You have chosen a 1TB SSD.");
                    }else if (value == 3) { // Added third component choice here
                        storageList.add("2TB");
                    }
                     else break;
                }
                scan.close();

                System.out.println("Your storage amount selections have been saved.");
                System.out.println("\n");

                // Water cooling selections loop
                Scanner scan2 = new Scanner(System.in);
                for (int i = 0; i < 3; i++) {
                    System.out.println("-------------------- Water Cooling Options --------------------");
                    System.out.println("(1) CPU Water Cooling - $300.");
                    System.out.println("(2) GPU Water Cooling - $400.");
                    System.out.println("(3) CPU & GPU Water Cooling - $700.");
                    System.out.println("(4) I would not like water cooling/ have finished selecting my parts.");

                    int value = scan2.nextInt();
                    System.out.println(""); // Spacing

                    if (value == 1) {
                        waterCoolList.add("CPUCool");
                        System.out.println("You have chosen to watercool your CPU.");
                    } else if (value == 2) {
                        waterCoolList.add("GPUCool");
                        System.out.println("You have chosen to watercool your GPU.");
                    } else if (value == 3) {
                        waterCoolList.add("CPUGPUCool");
                        System.out.println("You have chosen to watercool your CPU & GPU.");
                    } else break;
                }
                scan2.close();

                System.out.println("Your watercooling selections have been saved.");
                System.out.println("");

                String[] storageArr = new String[storageList.size()];
                storageArr = storageList.toArray(storageArr);

                String[] waterCoolArr = new String[waterCoolList.size()];
                waterCoolArr = waterCoolList.toArray(waterCoolArr);

                DesktopBuild desktopBuild = new DesktopBuild(builder, desktopType, storageArr, waterCoolArr);
                consultant.takeOrder(desktopBuild); // Why no working
            }

            else if(a==2) {
                Scanner scanLaptop = new Scanner(System.in);
                System.out.println("-------------------- Laptops --------------------\n");
                for (int i = 0; i < 1; i++) {
                    System.out.println("-------------------- Available Laptops --------------------");
                    System.out.println("(1) Lenovo - $799.99");
                    System.out.println("(2) MSI - $849.99");
                    System.out.println("(3) MacbookAir - $999.99");
                    System.out.println("(4) MacbookPro - $1249.99");
                    System.out.println("(5) Razer - $1599.99");
                    System.out.println("(6) I would not like a laptop.");
                    int laptop = scanLaptop.nextInt();
                    System.out.println(""); // Spacing
                    if(laptop==1){
                        laptopType="Lenovo";
                        System.out.println("You have chosen the Lenovo laptop.");
                    }
                    else if(laptop==2){
                        laptopType="MSI";
                        System.out.println("You have chosen the MSI laptop.");
                    }
                    else if(laptop==3){
                        laptopType="MacbookAir";
                        System.out.println("You have chosen the Macbook Air laptop.");
                    }
                    else if(laptop==4){
                        laptopType="MacbookPro";
                        System.out.println("You have chosen the Macbook Pro laptop.");
                    }
                    else if(laptop==5){
                        laptopType="Razer";
                        System.out.println("You have chosen the Razer laptop.");
                    }
                    else{
                        break;
                    }
                }
                scanLaptop.close();
                
                System.out.println("The selection of laptops is completed.");
                System.out.println("");

                LaptopOrder laptopOrder = new LaptopOrder(builder, laptopType);
                consultant.takeOrder(laptopOrder);
            }

            else{
                System.out.println("-------------------------------------------------------------------------------");
                
                System.out.println("GLAD WE COULD BE OF SERVICE TO YOU TODAY!");
                break;
            }
        }
    }
}
