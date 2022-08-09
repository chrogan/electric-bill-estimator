public class Electricity {

  //Fields

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

  // Returns in kWh/power per hours
  private double deviceKWH() {
    double deviceKWH = devicePower() * hours;
    return deviceKWH;
  }

  //Returns in kW/power
  private double devicePower() {

    double result = (volts * amps) / 1000.0;
    return result;
  }

  //ACCESSORS AND MODIFIERS

  public double getDeviceKWH() {
    return deviceKWH();
  }

  public double getDevicePower() {
    return devicePower();
  }
}
