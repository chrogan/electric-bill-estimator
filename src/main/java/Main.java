public class Main {

  /**
   * Creates a class for users to calculate estimate electric costs using default or input values.
   * This calculator uses either the default pre-set values for multiple appliances or user input.
   * If the user inputs invalid values then an instance of {@link java.io.IOException} is thrown.
   */
  public static void main(String[] args) {
    Appliance AC = new Appliance(120.0, 37.5, 17.5);
    Appliance heater = new Appliance(120.0, 12.5, 12.0);
    Appliance tv = new Appliance(120.0, 0.5, 7.0);
    Appliance refrigerator = new Appliance(110.0, 17.5, 8.0);
    Appliance dishwasher = new Appliance(110.0, 15.0, 3.0);
    Appliance microwave = new Appliance(240, 20.0, 0.5);
    Appliance lighting = new Appliance(120,15, 10 );


    Bill bill = new Bill(AC);

    System.out.printf("Your daily bill for Air Conditioning is $%1.2f\n", bill.getDeviceDailyBill());
    System.out.printf("Your monthly bill for Air Conditioning is $%1.2f\n", bill.getDeviceDailyBill());
    System.out.printf("Your yearly bill for Air Conditioning is $%1.2f\n", bill.getDeviceYearlyBill());

    System.out.printf("Your daily bill is $%1.2f\n", bill.getDailyBill());
    System.out.printf("Your monthly bill is $%1.2f\n", bill.getMonthlyBill());
    System.out.printf("Your yearly bill is $%1.2f\n", bill.getYearlyBill());

  }

}
