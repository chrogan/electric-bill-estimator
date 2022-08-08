public class Appliance {


  //FIELDS
    public static double voltage=120.0;
    public static double amps=12.5;
    public static double hours=10;


    //CONSTRUCTORS
    public Appliance(){

    }

    public Appliance(double voltage, double amps, double hours){
   setVoltage(voltage );
   setAmps(amps);
   setHours(hours);
      // Call the setters
    }


  public static double getVoltage() {
    return voltage;
  }

  public static void setVoltage(double voltage) {
    Appliance.voltage = voltage;
  }

  public static double getAmps() {
    return amps;
  }

  public static void setAmps(double amps) {
    Appliance.amps = amps;
  }

  public static double getHours() {
    return hours;
  }

  public static void setHours(double hours) {
    Appliance.hours = hours;
  }


  }



