import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {

  public static double rate;

  /**
   * Creates a class for users to calculate estimate electric costs using default or input values.
   * This program implements {@link Map} to find key values for average electric costs per state.
   * The calculator then uses either the values for the amount of appliances the user selects.
   * If the user inputs invalid values then an instance of {@link java.io.IOException} is thrown. A
   * {@link Scanner} and {@link TreeMap} are used to allow user input.
   */
  public static void main(String[] args) {
    //Gets the rate from a specific state after user input
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Please provide the state abbreviation of your residency:\n"
        + "(example: Enter 'NY' for New York or 'CO' for Colorado)\n ");
    String state = scanner.nextLine();
    try {
      Map<String, Double> states = Files  //This calls values from the statescosts.csv file states.get(NM)
          .lines(Paths.get("src/main/resources/state-costs.csv"))
          .map((line) -> line.trim().split("\\s*,\\s*"))
          .collect(Collectors.toMap((parts) -> parts[0], (parts) -> Double.valueOf(parts[1])));
      System.out.println("The average electricity cost in " + state + " = $" + states.get(state));
      rate = states.get(state);

    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.printf("How many appliances would you like to register?\n");
    int numAppliances = scanner.nextInt();

    Map<String, Appliance> appliances = new TreeMap<>();

    Set<String> names = appliances.keySet();
    String name;
    for (int i = 0; i < numAppliances; i++) {
      scanner.nextLine();
      System.out.printf("Which appliance would you like to register?\n" +
          "examples: Television, Air Conditioning, Dishwasher, Microwave\n");
      name = scanner.nextLine();
      if (appliances.containsKey(name)) {
        System.out.println("Sorry you already gave that name. Please insert a new device.");
      }
      while (!appliances.containsKey(name)) {
        System.out.printf("What is the voltage required for this appliance?\n"
            + "(Note: Most appliances in the United States have a voltage from"
            + " 110-120 volts or 220 -240 volts.\n");
        double volts = scanner.nextInt();

        System.out.printf("What is the amperage required for this appliance?\n");
        double amps = scanner.nextDouble();

        System.out.printf("How many hours a day do you usually run this appliance?\n");
        double hours = scanner.nextDouble();

        Appliance appliance = new Appliance(volts, amps, hours);
        appliances.put(name, appliance);
      }
    }
    //this lines of code below have large spaces intentionally
    System.out.printf("Appliance            Volts    Amps    Hrs        KWH\n");
    for (Map.Entry<String, Appliance> entry : appliances.entrySet()) {
      Appliance appliance = entry.getValue();
      System.out.printf("%-20s%6.0f%8.2f%8.2f%10.2f%n", entry.getKey(), appliance.voltage,
          appliance.amps, appliance.hours, appliance.getDeviceKWH());
    }
    System.out.println();
    System.out.printf("Appliance           $Appl     %%ofBill\n");
    for (Map.Entry<String, Appliance> entry : appliances.entrySet()) {
      Appliance appliance = entry.getValue();
      Bill bill = new Bill(appliance);
      System.out.printf("%-20s$%-6.2f%8.2f%%%n", entry.getKey(), bill.getDeviceMonthlyBill(),
          bill.getPercentage());
      System.out.printf("%nYour total monthly bill is approximately: $%1.2f",
          bill.getMonthlyBill());
    }

  }
}