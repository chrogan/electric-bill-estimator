public class Bill {


  //FIELDS
  double KWH;
  double rate = 0.1374;

  //CONSTRUCTORS
  public Bill() {
  }

  public Bill(Electricity electricity) {
    this.KWH = electricity.getDeviceKWH();
  }


  //METHODS
  private double deviceBillDay() {
    double result = KWH * rate;
    return result;
  }

  private double billWeek() {
    double result = billDay() * 7;
    return result;
  }

  private double billMonth() {
    double result = billDay() * 30;
    return result;
  }

  private double billYear() {
    double result = billDay() * 365;
    return result;
  }

  //ACCESSORS


}
