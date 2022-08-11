import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
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

//    Console console = System.console();
//    String state = console.readLine("Please provide the state abbreviation of your residency:\n"
//        + "(ex. Enter 'NY' for New York or 'CO' for Colorado)\n ");
//    System.out.println(state);

    Appliance AC = new Appliance(120.0, 37.5, 17.5);//78.75
    Appliance heater = new Appliance(120.0, 12.5, 0.0);//0
    Appliance tv = new Appliance(120.0, 0.5, 7.0);//0.42
    Appliance refrigerator = new Appliance(115.0, 6.04, 8.0);//5.5568
    Appliance dishwasher = new Appliance(120.0, 10.5, 3.0);//3.78
    Appliance microwave = new Appliance(120, 5.0, 0.5);//0.3
    Appliance lighting = new Appliance(120, 15, 5);//9.00

    Bill aCbill = new Bill(AC);
    Bill tvBill = new Bill(tv);

    System.out.printf("The television takes up %1.2f%% of your energy bill.\n",
        tvBill.getPercentage());
    System.out.printf("The Air Conditioning takes up %1.2f%% of your energy bill.\n",
        aCbill.getPercentage());

    System.out.printf("Your daily bill for Air Conditioning is $%1.2f\n",
        aCbill.getDeviceDailyBill());
    System.out.printf("Your monthly bill for Air Conditioning is $%1.2f\n",
        aCbill.getDeviceMonthlyBill());
    System.out.printf("Your yearly bill for Air Conditioning is $%1.2f\n",
        aCbill.getDeviceYearlyBill());

    System.out.printf("Your daily bill is $%1.2f\n", aCbill.getDailyBill());
    System.out.printf("Your monthly bill is $%1.2f\n", aCbill.getMonthlyBill());
    System.out.printf("Your yearly bill is $%1.2f\n", aCbill.getYearlyBill());
  }

}
