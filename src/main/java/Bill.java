public class Bill {


  //FIELDS
  double KWH;
  public double totalKWH;
  double rate = 0.160;


  //CONSTRUCTORS
  public Bill() {
  }

  public Bill(Appliance appliance) {
    this.KWH = appliance.getDeviceKWH();
    this.totalKWH = appliance.getTotalKWH();
  }


  //METHODS
  private double deviceBillDay() {
    double deviceBill = KWH * rate;
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


  //totals for bill
  public double getDailyBill() {
    return DayBill();
  }

  public double getWeeklyBill() {
    return DayBill() * 7.0;
  }

  public double getMonthlyBill() {
    return DayBill() * 30.0;
  }

  public double getYearlyBill() {
    return DayBill() * 365.0;
  }

}




