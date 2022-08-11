import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {

  public static double rate;

  /**
   * Creates a class for users to calculate estimate electric costs using default or input values.
   * This calculator uses either the default pre-set values for multiple appliances or user input.
   * If the user inputs invalid values then an instance of {@link java.io.IOException} is thrown.
   */
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.printf("Please provide the state abbreviation of your residency:\n"
        + "(example: Enter 'NY' for New York or 'CO' for Colorado)\n ");
    String state = scanner.nextLine();
    try {
      Map<String, Double> states = Files  //This calls values from the statescosts.csv file states.get(NM)
          .lines(Paths.get("src/main/resources/state-costs.csv"))
          .map((line) -> line.trim().split("\\s*,\\s*"))
          .collect(Collectors.toMap((parts) -> parts[0], (parts) -> Double.valueOf(parts[1])));
      System.out.println(states.get(state));
      rate = states.get(state);

    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.printf("How many appliances would you like to register?\n");
    int numAppliances = scanner.nextInt();

    Map<String, Appliance> appliances = new TreeMap<>();//Linked HashMap would iterate based on input order
    //TreeMap<>(Comparator.comparing(String::compareToCaseInsensitive));
    for (int i = 0; i< numAppliances; i++) {
      scanner.nextLine();
      //Create while loop
      System.out.printf("Which appliance would you like to register?\n" +
          "examples: Television, Air Conditioning, Dishwasher, Microwave\n");
      String name = scanner.nextLine();

      System.out.printf("What is the voltage required for this appliance?\n +"
          + "(Note: Most appliances in the United States have a voltage from"
              + "110-120 volts or 220 -240 volts.\n");
      double volts = scanner.nextInt();

      System.out.printf("What is the amperage required for this appliance?\n");
      double amps = scanner.nextDouble();

      System.out.printf("How many hours a day do you usually run this appliance?\n");
      double hours = scanner.nextDouble();

      Appliance appliance = new Appliance(volts,amps,hours);
      appliances.put(name,appliance);
    }

   for( Map.Entry<String,Appliance> entry : appliances.entrySet()){
     Appliance appliance = entry.getValue();
     System.out.printf("%-20s%6.0f%8.2f%6.2f%10.2f%n", entry.getKey(), appliance.voltage,
         appliance.amps, appliance.hours, appliance.getDeviceKWH());
   }

//    Console console = System.console();
//    String state = console.readLine("Please provide the state abbreviation of your residency:\n"
//        + "(ex. Enter 'NY' for New York or 'CO' for Colorado)\n ");
//    System.out.println(state);
//
//    Appliance AC = new Appliance(120.0, 37.5, 17.5);//78.75
//    Appliance heater = new Appliance(120.0, 12.5, 0.0);//0
//    Appliance tv = new Appliance(120.0, 0.5, 7.0);//0.42
//    Appliance refrigerator = new Appliance(115.0, 6.04, 8.0);//5.5568
//    Appliance dishwasher = new Appliance(120.0, 10.5, 3.0);//3.78
//    Appliance microwave = new Appliance(120, 5.0, 0.5);//0.3
//    Appliance lighting = new Appliance(120, 15, 5);//9.00
//
//    Bill aCbill = new Bill(AC);
//    Bill tvBill = new Bill(tv);
//
//    System.out.printf("The television takes up %1.2f%% of your energy bill.\n",
//        tvBill.getPercentage());
//    System.out.printf("The Air Conditioning takes up %1.2f%% of your energy bill.\n",
//        aCbill.getPercentage());
//
//    System.out.printf("Your daily bill for Air Conditioning is $%1.2f\n",
//        aCbill.getDeviceDailyBill());
//    System.out.printf("Your monthly bill for Air Conditioning is $%1.2f\n",
//        aCbill.getDeviceMonthlyBill());
//    System.out.printf("Your yearly bill for Air Conditioning is $%1.2f\n",
//        aCbill.getDeviceYearlyBill());
//
//    System.out.printf("Your daily bill is $%1.2f\n", aCbill.getDailyBill());
//    System.out.printf("Your monthly bill is $%1.2f\n", aCbill.getMonthlyBill());
//    System.out.printf("Your yearly bill is $%1.2f\n", aCbill.getYearlyBill());
  }

}
