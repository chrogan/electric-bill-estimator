public class Bill {



  double KWH;
  double totalPower;


  public Bill(){
  }

  public Bill(Electricity electricity){
    this.KWH = electricity.getDeviceKWH();
    this.totalPower = electricity.getTotalPower();
  }
  //Bill for one device would be cool;
  //TODO we need to get the price for a day
  //TODO bill for a week
  //TODO bill for a month
  //TODO bill for a year

}
