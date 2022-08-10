import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bill {

  private static double deviceBill;
  //FIELDS
  double KWH;
  double rate = 0.160;
  public static int instanceCount = 0;

  List<Double> totalBill = new ArrayList<>();

  //CONSTRUCTORS
  public Bill() {
    instanceCount++;
  }
  public Bill(Appliance apppliance) {
    this.KWH = apppliance.getDeviceKWH();
    totalBill.add(apppliance.getDeviceKWH());
  }


  //METHODS
  public double deviceBillDay() {
     this.deviceBill = KWH * rate;
    return deviceBill;
  }

  private double billWeek() {
    double result = deviceBillDay() * 7;
    return result;
  }

  private double billMonth() {
    double result = deviceBillDay() * 30;
    return result;
  }

  private double billYear() {
    double result = deviceBillDay() * 365;
    return result;
  }

  public static double total() {
    double hopefullyWorks = 0;
    hopefullyWorks += deviceBill;
    return hopefullyWorks;
  }

  //ACCESSORS


}
