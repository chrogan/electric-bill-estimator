public class Main {

  /**
   * Creates a class for users to calculate estimate electric costs using default or input values.
   * This calculator uses either the default pre-set values for multiple appliances or user input.
   * If the user inputs invalid values then an instance of {@link java.io.IOException} is thrown.
   */
  public static void main(String[] args) {
    Appliance AC = new Appliance(120.0, 37.5, 17.5);// voltage= 120, Amps= 37.5, hours=17.5
    Appliance heater = new Appliance(120.0, 12.5,12.0);//voltage=120, Amps = 12.5, hours=12
    Appliance tv = new Appliance(120.0, 0.5, 7.0 );//voltage= 120, Amps=0.5 , hours= 7
    Appliance refrigerator = new Appliance(110.0, 17.5, 8.0);//voltage=110, Amps=17.5, hours=8
    Appliance dishwasher = new Appliance(110.0,15.0,3.0);//voltage=110 Amps=15, hours =3
    Appliance microwave = new Appliance(240, 20.0,0.5);//voltage=240, Amps= 20, hours=0.5
    Appliance lighting= new Appliance();//voltage=

    Electricity electricity = new Electricity(tv);

    double power = electricity.getDevicePower();
    double Kwh = electricity.getDeviceKWH();
//    double totalKWH = electricity.getTotalPower();

//    System.out.println(Electricity.devices);
    System.out.println(power);
    System.out.println(Kwh);
//    System.out.println(totalKWH);

  }

}
