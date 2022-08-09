public class Electricity {

//COST = KWH
//  KWH = (KW * 30)
//      KW = (WATT / 1000)
//        WATT = (AMP * VOLT)

  //Fields

  private static int instanceCount = 0;

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

  //TODO create power calculator (per devices)

  //returns each device's power in kW
  private double devicePowerCalculator(double voltage, double current) {
    Electricity electricity = new Electricity();
    return electricity.powerPerDevice = current * voltage / 1000.0;
  }

  private double deviceKWHCalculator(double hours) {
    return electricity.deviceKWH = getPowerPerDevice() * hours;
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

  //Returns in kW/power
  private double devicePower() {
    double result = (volts * amps)/ 1000.0;
    return result;
  }

  private double devicePower() {
    double result = (volts * amps)/ 1000.0;
    return result;
  }

  //ACCESSORS AND MODIFIERS

  public double getTotalPower() {
    return totalPowerCalculator();
  }
  public double getDeviceKWH() {
    return deviceKWHCalculator();
  }
  public double getPowerPerDevice() {
    return devicePower();
  }

  //ACCESSORS AND MODIFIERS

  public double getTotalPower() {
    return totalPowerCalculator();
  }
  public double getDeviceKWH() {
    return deviceKWH();
  }
  public double getDevicePower() {
    return devicePower();
  }
}
