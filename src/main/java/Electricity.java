public class Electricity {

//COST = KWH
//  KWH = (KW * 30)
//      KW = (WATT / 1000)
//        WATT = (AMP * VOLT)


  //Fields
  public static double totalMonthlyBill = 0;
  public static double totalYearlyBill = 0;
  public static double powerPerDevice = 0;
  public static double totalPower = 0;
  public static double deviceKWH = 0;

  Electricity electricity = new Electricity();

  //Constructors
  public Electricity() {
  }

  //METHODS
  //TODO create cost conversions
  private double monthlyPriceEstimator(double price) {
    return electricity.totalMonthlyBill = getTotalPower() * price;
  }
  private double yearlyPriceEstimator() {
    return electricity.totalYearlyBill = getTotalMonthlyBill() * 12;

  }
  //TODO create power calculator (per devices)

  //returns each device's power in kW
  private double devicePowerCalculator(double voltage, double current) {
    Electricity electricity = new Electricity();
    return electricity.powerPerDevice = current * voltage / 1000.0;
  }

  private double deviceKWHCalculator(double hours){
    return electricity.deviceKWH = getPowerPerDevice() * hours;
  }

  //TODO create totalPower
  private double totalPowerCalculator(double[] devicesPower) {
    //TODO getPowerCalculator for each device and multiply by number of devices
    //then multiply that by 30 days
    for(double device: devicesPower){
      totalPower += device.getPowerPerDevice();
    }
    return totalPower;
  }



  //accessors and modifiers

  public static double getTotalMonthlyBill() {
    return totalMonthlyBill;
  }

  public static double getTotalYearlyBill() {
    return totalYearlyBill;
  }


  public static double getPowerPerDevice() {
    return powerPerDevice;
  }



  public static double getTotalPower() {
    return totalPower;
  }



  public static double getDeviceKWH() {
    return deviceKWH;
  }




  //accessors and modifiers

}
