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
    devices.add(appliance);

  }


  //METHODS

  //TODO create totalPower
  private double totalPowerCalculator() {
    //TODO sum of getPowerCalculator for each appliance

    for(Appliance device : devices){
      Electricity electricity = new Electricity(device);
       totalPower += electricity.getDeviceKWH();

    }
    return totalPower;
  }


  // Returns in kWh/power per hours
  private double deviceKWH() {
    double deviceKWH = devicePower() * hours;
    return deviceKWH;
  }

  //Returns in kW/power
  private double devicePower() {
    double result = (volts * amps)/ 1000.0;
    return result;
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
