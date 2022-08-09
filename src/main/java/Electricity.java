

import java.util.ArrayList;
import java.util.List;

public class Electricity {

  //Fields

  private static int instanceCount = 0;

  public double volts;
  public double amps;
  public double hours;
  public static double totalPower;

public static List<Appliance> devices = new ArrayList<>();

  //Constructors
  public Electricity() {

  }
  public Electricity(Appliance appliance) {
    this.volts = appliance.getVoltage();
    this.amps = appliance.getAmps();
    this.hours = appliance.getHours();



  //METHODS

  //TODO create totalPower
  private double totalPowerCalculator() {
    //TODO getPowerCalculator for each device and multiply by number of devices
    double totalPower = 0;

    return totalPower;
  }
  private double deviceKWHCalculator() {
    deviceKWH = devicePower() * hours;
    return deviceKWH;
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

}
}
