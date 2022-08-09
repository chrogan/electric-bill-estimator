

public class Electricity {

  //Fields
  public static double totalMonthlyBill;
  public static double totalYearlyBill;
  public static double totalPower;
  public double deviceKWH;

  public double volts;
  public double amps;
  public double hours;


  //Constructors
  public Electricity() {

  }
  public Electricity(Appliance appliance) {
    this.volts = appliance.getVoltage();
    this.amps = appliance.getAmps();
    this.hours = appliance.getHours();
  }


  //METHODS
  private double monthlyPriceEstimator(double price) {
    return totalMonthlyBill = getTotalPower() * price;
  }

  private double yearlyPriceEstimator() {
    return totalYearlyBill = getTotalMonthlyBill() * 12;
  }



  private double deviceKWHCalculator() {
    return deviceKWH = getPowerPerDevice() * this.hours;
  }

  //TODO create totalPower
//  private double totalPowerCalculator(double[] devicesPower) {
//    //TODO getPowerCalculator for each device and multiply by number of devices
//    //then multiply that by 30 days
//    for (double device : devicesPower) {
//      // totalPower += device.getPowerPerDevice();
//    }
//    return totalPower;
//  }

  private double devicePower() {
    double result = (volts * amps)/ 1000.0;
    return result;
  }

  //ACCESSORS AND MODIFIERS
  private double setTotalMonthlyBill(double totalMonthlyBill) {
    return this.totalMonthlyBill = totalMonthlyBill;
  }

  public static double getTotalMonthlyBill() {
    return totalMonthlyBill;
  }

  private double setTotalYearlyBill() {
   return this.totalYearlyBill = totalYearlyBill;
  }

  public static double getTotalYearlyBill() {
    return totalYearlyBill;
  }


  private static void setTotalPower(double totalPower) {
    Electricity.totalPower = totalPower;
  }

  public static double getTotalPower() {
    return totalPower;
  }

  private double setDeviceKWH(double deviceKWH) {
    return deviceKWH * hours;
  }


  public double getDeviceKWH() {
    return this.deviceKWH = devicePower() * hours;
  }


  public double getPowerPerDevice() {
    return devicePower();
  }

}
