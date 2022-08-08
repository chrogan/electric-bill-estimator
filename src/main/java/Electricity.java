

public class Electricity {

//COST = KWH
//  KWH = (KW * 30)
//      KW = (WATT / 1000)
//        WATT = (AMP * VOLT)

  //Fields
  public static double totalMonthlyBill;
  public static double totalYearlyBill;
  public static double powerPerDevice;
  public static double totalPower;
  public static double deviceKWH;


  //Constructors
  public Electricity() {

  }

  public Electricity(Appliance appliance) {
    double volts = appliance.getVoltage();
    double amps = appliance.getAmps();
    double hours = appliance.getHours();
  }


  //METHODS
  private double monthlyPriceEstimator(double price) {
    return totalMonthlyBill = getTotalPower() * price;
  }

  private double yearlyPriceEstimator() {
    return totalYearlyBill = getTotalMonthlyBill() * 12;

  }

  //returns each device's power in kW
  private double devicePowerCalculator(double volts, double amps) {

    return this.powerPerDevice = (volts * amps)/ 1000.0;
  }

  private double deviceKWHCalculator(double hours) {
    return deviceKWH = getPowerPerDevice() * hours;
  }

  //TODO create totalPower
  private double totalPowerCalculator(double[] devicesPower) {
    //TODO getPowerCalculator for each device and multiply by number of devices
    //then multiply that by 30 days
    for (double device : devicesPower) {
      // totalPower += device.getPowerPerDevice();
    }
    return totalPower;
  }

  //ACCESSORS AND MODIFIERS


  private static void setTotalMonthlyBill(double totalMonthlyBill) {
    Electricity.totalMonthlyBill = totalMonthlyBill;
  }

  public static double getTotalMonthlyBill() {
    return totalMonthlyBill;
  }

  private static void setTotalYearlyBill(double totalYearlyBill) {
    Electricity.totalYearlyBill = totalYearlyBill;
  }

  public static double getTotalYearlyBill() {
    return totalYearlyBill;
  }

  private static void setPowerPerDevice(double powerPerDevice) {
    Electricity.powerPerDevice = powerPerDevice;
  }

  public static double getPowerPerDevice() {
    return powerPerDevice;
  }

  private static void setTotalPower(double totalPower) {
    Electricity.totalPower = totalPower;
  }

  public static double getTotalPower() {
    return totalPower;
  }

  private static void setDeviceKWH(double deviceKWH) {
    Electricity.deviceKWH = deviceKWH;
  }

  public static double getDeviceKWH() {
    return deviceKWH;
  }


}
