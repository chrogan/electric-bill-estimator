import java.util.ArrayList;
import java.util.List;

public class Appliance {


  //FIELDS
  public double KWH;
  public double voltage = 120.0; //default values in place of empty values
  public double amps = 12.5;
  public double hours = 10;
  public static int instanceCount;

  static List<Double> totalKWH = new ArrayList<>();

  //CONSTRUCTORS
  public Appliance() {
  }

  //takes information for these values from the main class
  public Appliance(double voltage, double amps, double hours) {
    this.voltage = setVoltage(voltage);
    this.amps = setAmps(amps);
    this.hours = setHours(hours);
    totalKWH.add(deviceKWH()); //calculates the total kWh from all appliances
  }

  //METHODS
  private double deviceKWH() {  //This calculates kWh
    KWH = voltage * amps * hours / 1000;
    return KWH;
  }

  private double totalKWH() { //changes all of the values of kWh into one total sum.
    double sum = totalKWH.stream().reduce(0.0, Double::sum);
    return sum;
  }

  //ACCESSORS AND MODIFIERS
  public double getDeviceKWH() {
    return KWH;
  }

  public double getTotalKWH() {
    return totalKWH();
  }

  //volts
  public double getVoltage() {
    return voltage;
  }

  public double setVoltage(double voltage) {
    return this.voltage = voltage;
  }

  //amps
  public double getAmps() {
    return amps;
  }

  public double setAmps(double amps) {
    return this.amps = amps;
  }

  //hours
  public double getHours() {
    return hours;
  }

  public double setHours(double hours) {
    return this.hours = hours;
  }


}



