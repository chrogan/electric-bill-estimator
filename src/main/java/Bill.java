public class Bill {

  public double totalKWH;
  //FIELDS
  double KWH;

  public static double totalKWH;
  static double rate = 0.1113;

  double rate = 0.160; //this is the avg state cost for electricity


  //CONSTRUCTORS
  public Bill() {
  }

  public Bill(Appliance appliance) {
    this.KWH = appliance.getDeviceKWH();
    this.totalKWH = appliance.getTotalKWH();
    //this.rate = Main.rate;
  }

  //METHODS

  private double deviceBillDay() {
    double deviceBill = KWH * rate;  //calculates the actual cost of electricity
    return deviceBill;
  }

  private static double dayBill() {
    double result = totalKWH * rate;
    return result;
  }

  private double percentageOfBill() {
    double percent = (deviceBillDay() / dayBill()) * 100.0;
    return percent;
  }

  //ACCESSORS
  //per device
  public double getDeviceDailyBill() {
    return deviceBillDay();
  }

  public double getDeviceWeeklyBill() {
    return deviceBillDay() * 7.0;
  }

  public double getDeviceMonthlyBill() {
    return deviceBillDay() * 30.0;
  }

  public double getDeviceYearlyBill() {
    return deviceBillDay() * 365.0;
  }


  //totals for bill
  public static double getDailyBill() {
    return dayBill();

  //calculates a 1 day cost value
  public double getDailyBill() {
    return DayBill();

  }

  //calculates a 7 day value
  public double getWeeklyBill() {
    return dayBill() * 7.0;
  }

  //calculates a 30 day value
  public double getMonthlyBill() {
    return dayBill() * 30.0;
  }

  //calculates a 365-day value
  public double getYearlyBill() {
    return dayBill() * 365.0;
  }

  //percentage of bills
  public double getPercentage() {
    return percentageOfBill();
  }

}




