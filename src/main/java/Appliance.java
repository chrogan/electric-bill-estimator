

public class Appliance {


  //FIELDS
  public double voltage = 120.0;
  public double amps = 12.5;
  public double hours = 10;


  //CONSTRUCTORS
  public Appliance() {

  }

  public Appliance(double voltage, double amps, double hours) {
    this.voltage = setVoltage(voltage);
    this.amps = setAmps(amps);
    this.hours = setHours(hours);
  }


  public double getVoltage() {
    return voltage;
  }

  public double setVoltage(double voltage) {
    return this.voltage = voltage;
  }

  public double getAmps() {
    return amps;
  }

  public double setAmps(double amps) {
    return this.amps = amps;
  }

  public double getHours() {
    return hours;
  }

  public double setHours(double hours) {
    return this.hours = hours;
  }


}



