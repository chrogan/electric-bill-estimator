import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BillTest {

  Appliance AC = new Appliance(120.0, 37.5, 17.5);//78.75kwh
  Appliance heater = new Appliance(120.0, 12.5, 0.0);//0.0kwh
  Appliance refrigerator = new Appliance(115.0, 6.04, 8.0);//5.5568kwh
  Appliance dishwasher = new Appliance(120.0, 10.5, 3.0);//3.78kwh
  Appliance microwave = new Appliance(120, 5.0, 0.5);//0.3kwh
  Appliance lighting = new Appliance(120, 15, 5);//9.0kwh

  Bill acBill = new Bill(AC);
  Bill heatBill = new Bill(heater);
  Bill fridgeBill = new Bill(refrigerator);
  Bill dwBill = new Bill(dishwasher);
  Bill microwaveBill = new Bill(microwave);
  Bill lightBill = new Bill(lighting);

  @Test
  void getDeviceDailyBill() {
    assertAll("Should return the bill for an appliance per day.",
        () -> assertEquals(8.7648, acBill.getDeviceDailyBill(), 0.001),
        () -> assertEquals(0.0, heatBill.getDeviceDailyBill(), 0.001),
        () -> assertEquals(0.61847184, fridgeBill.getDeviceDailyBill(), 0.001),
        () -> assertEquals(0.420714, dwBill.getDeviceDailyBill(), 0.001),
        () -> assertEquals(0.03339, microwaveBill.getDeviceDailyBill(), 0.001),
        () -> assertEquals(1.0017, lightBill.getDeviceDailyBill(), 0.001)
    );
  }


  @Test
  void getDeviceWeeklyBill() {
    assertAll("Should return the bill for an appliance per week.",
        () -> assertEquals(61.354, acBill.getDeviceWeeklyBill(), 0.001),
        () -> assertEquals(0.0, heatBill.getDeviceWeeklyBill(), 0.001),
        () -> assertEquals(4.32930288, fridgeBill.getDeviceWeeklyBill(), 0.001),
        () -> assertEquals(2.944998, dwBill.getDeviceWeeklyBill(), 0.001),
        () -> assertEquals(0.23373, microwaveBill.getDeviceWeeklyBill(), 0.001),
        () -> assertEquals(7.0119, lightBill.getDeviceWeeklyBill(), 0.001)
        );
  }

  @Test
  void getDeviceMonthlyBill() {
    assertAll("Should return the bill for an appliance per month.",
        () -> assertEquals(262.94625, acBill.getDeviceMonthlyBill(), 0.001),
        () -> assertEquals(0.0, heatBill.getDeviceMonthlyBill(), 0.001),
        () -> assertEquals(18.5541552, fridgeBill.getDeviceMonthlyBill(), 0.001),
        () -> assertEquals(12.62142, dwBill.getDeviceMonthlyBill(), 0.001),
        () -> assertEquals(1.0017, microwaveBill.getDeviceMonthlyBill(), 0.001),
        () -> assertEquals(30.051, lightBill.getDeviceMonthlyBill(), 0.001)
    );
  }

  @Test
  void getDeviceYearlyBill() {
    assertAll("Should return the bill for an appliance per year.",
        () -> assertEquals(3199.179375, acBill.getDeviceYearlyBill(), 0.001),
        () -> assertEquals(0.0, heatBill.getDeviceYearlyBill(), 0.001),
        () -> assertEquals(225.7422216, fridgeBill.getDeviceYearlyBill(), 0.001),
        () -> assertEquals(153.56061, dwBill.getDeviceYearlyBill(), 0.001),
        () -> assertEquals(12.18735, microwaveBill.getDeviceYearlyBill(), 0.001),
        () -> assertEquals(365.6205, lightBill.getDeviceYearlyBill(), 0.001)
        );
  }

  @Test
  @Order(1)
  void getDailyBill() {
    assertAll("Should return the total bill per day for any instance.",
        () -> assertEquals(10.83915084, acBill.getDailyBill(), 0.001),
        () -> assertEquals(10.83915084, heatBill.getDailyBill(), 0.001),
        () -> assertEquals(10.83915084, fridgeBill.getDailyBill(), 0.001),
        () -> assertEquals(10.83915084, dwBill.getDailyBill(), 0.001),
        () -> assertEquals(10.83915084, microwaveBill.getDailyBill(), 0.001),
        () -> assertEquals(10.83915084, lightBill.getDailyBill(), 0.001)
    );
  }

  @Test
  @Order(2)
  void getWeeklyBill() {
    assertAll("Should return the total bill per day for any instance.",
        () -> assertEquals(75.87405588, acBill.getWeeklyBill(), 0.001),
        () -> assertEquals(75.87405588, heatBill.getWeeklyBill(), 0.001),
        () -> assertEquals(75.87405588, fridgeBill.getWeeklyBill(), 0.001),
        () -> assertEquals(75.87405588, dwBill.getWeeklyBill(), 0.001),
        () -> assertEquals(75.87405588, microwaveBill.getWeeklyBill(), 0.001),
        () -> assertEquals(75.87405588, lightBill.getWeeklyBill(), 0.001)
    );
  }

  @Test
  @Order(3)
  void getMonthlyBill() {
    assertAll("Should return the total bill per day for any instance.",
        () -> assertEquals(325.1745252, acBill.getMonthlyBill(), 0.001),
        () -> assertEquals(325.1745252, heatBill.getMonthlyBill(), 0.001),
        () -> assertEquals(325.1745252, fridgeBill.getMonthlyBill(), 0.001),
        () -> assertEquals(325.1745252, dwBill.getMonthlyBill(), 0.001),
        () -> assertEquals(325.1745252, microwaveBill.getMonthlyBill(), 0.001),
        () -> assertEquals(325.1745252, lightBill.getMonthlyBill(), 0.001)
    );

  }

  @Test
  @Order(4)
  void getYearlyBill() {
    assertAll("Should return the total bill per day for any instance.",
        () -> assertEquals(3956.2900566, acBill.getYearlyBill(), 0.001),
        () -> assertEquals(3956.2900566, heatBill.getYearlyBill(), 0.001),
        () -> assertEquals(3956.2900566, fridgeBill.getYearlyBill(), 0.001),
        () -> assertEquals(3956.2900566, dwBill.getYearlyBill(), 0.001),
        () -> assertEquals(3956.2900566, microwaveBill.getYearlyBill(), 0.001),
        () -> assertEquals(3956.2900566, lightBill.getYearlyBill(), 0.001)
    );
  }

  @Test
  @Order(5)
  void getPercentage() {
    assertAll("Should return the total bill per day for any instance.",
        () -> assertEquals( 80.86311491906501, acBill.getPercentage(), 0.001),
        () -> assertEquals( 0.0, heatBill.getPercentage(), 0.001),
        () -> assertEquals( 5.70590675533029, fridgeBill.getPercentage(), 0.001),
        () -> assertEquals( 3.88142951611512, dwBill.getPercentage(), 0.001),
        () -> assertEquals( 0.30804996159644, microwaveBill.getPercentage(), 0.001),
        () -> assertEquals( 9.24149884789314, lightBill.getPercentage(), 0.001)
    );
  }
}