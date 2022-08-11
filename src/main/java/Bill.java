public class Bill {

  public double totalKWH;
  //FIELDS
  double KWH;
  double rate = 0.160; //this is the avg state cost for electricity

  //CONSTRUCTORS
  public Bill() {
  }

  public Bill(Appliance appliance) {
    this.KWH = appliance.getDeviceKWH();
    this.totalKWH = appliance.getTotalKWH();
  }


  //METHODS
  private double deviceBillDay() {
    double deviceBill = KWH * rate;  //calculates the actual cost of electricity
    return deviceBill;
  }

  private double DayBill() {
    double sum = totalKWH * rate;
    return sum;
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


  //calculates a 1 day cost value
  public double getDailyBill() {
    return DayBill();
  }

  //calculates a 7 day value
  public double getWeeklyBill() {
    return DayBill() * 7.0;
  }

  //calculates a 30 day value
  public double getMonthlyBill() {
    return DayBill() * 30.0;
  }

  //calculates a 365-day value
  public double getYearlyBill() {
    return DayBill() * 365.0;
  }

}




