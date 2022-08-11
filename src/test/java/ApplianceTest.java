import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ApplianceTest {

    Appliance AC = new Appliance(120.0, 37.5, 17.5);//78.75kwh
    Appliance heater = new Appliance(120.0, 12.5, 0.0);//0.0
    Appliance tv = new Appliance(120.0, 0.5, 7.0);//0.42
    Appliance refrigerator = new Appliance(115.0, 6.04, 8.0);//5.5568
    Appliance dishwasher = new Appliance(120.0, 10.5, 3.0);//3.78
    Appliance microwave = new Appliance(120, 5.0, 0.5);//0.3
    Appliance lighting = new Appliance(120, 15, 5);//9.0


  @Test
  @Order(1)
  void totalKWHTest() {
    //should return 97.8068
    assertAll("Should return the same total for any instance",
        () -> assertEquals(97.8068, AC.getTotalKWH(), 0.000001),
        () -> assertEquals(97.8068, heater.getTotalKWH(), 0.000001),
        () -> assertEquals(97.8068, tv.getTotalKWH(), 0.000001),
        () -> assertEquals(97.8068, refrigerator.getTotalKWH(), 0.000001),
        () -> assertEquals(97.8068, dishwasher.getTotalKWH(), 0.000001),
        () -> assertEquals(97.8068, microwave.getTotalKWH(), 0.000001),
        () -> assertEquals(97.8068, lighting.getTotalKWH(), 0.000001)
    );
  }



  @Test
  public void deviceKWHTest() {
    assertAll("Should return the kWh for each device",
        () -> assertEquals(78.75, AC.getDeviceKWH(), 0.000001),
        () -> assertEquals(0.0, heater.getDeviceKWH(), 0.000001),
        () -> assertEquals(0.42, tv.getDeviceKWH(), .000001),
        () -> assertEquals(5.5568, refrigerator.getDeviceKWH(), 0.000001),
        () -> assertEquals(3.78, dishwasher.getDeviceKWH(), 0.000001),
        () -> assertEquals(0.3, microwave.getDeviceKWH(), .000001),
        () -> assertEquals(9.0, lighting.getDeviceKWH(), .000001)
    );
  }

  @Test
  void getVoltageTest() {
    assertAll("Should return specific instance voltage",
        () -> assertEquals(120.0, AC.getVoltage(), 0.000001),
        () -> assertEquals(120.0, heater.getVoltage(), 0.000001),
        () -> assertEquals(120.0, tv.getVoltage(), 0.000001),
        () -> assertEquals(115.0, refrigerator.getVoltage(), 0.000001),
        () -> assertEquals(120.0, dishwasher.getVoltage(), 0.000001),
        () -> assertEquals(120.0, microwave.getVoltage(), 0.000001),
        () -> assertEquals(120.0, lighting.getVoltage(), 0.000001)
    );
  }

  @Test
  void getAmpsTest() {
    assertAll("Should return specific instance amperage",
        () -> assertEquals(37.5, AC.getAmps(), 0.000001),
        () -> assertEquals(12.5, heater.getAmps(), 0.000001),
        () -> assertEquals(0.5, tv.getAmps(), .000001),
        () -> assertEquals(6.04, refrigerator.getAmps(), 0.000001),
        () -> assertEquals(10.5, dishwasher.getAmps(), 0.000001),
        () -> assertEquals(5.0, microwave.getAmps(), .000001),
        () -> assertEquals(15.0, lighting.getAmps(), .000001)
    );
  }

  @Test
  void getHoursTest() {
    assertAll("Should return specific instance hours",
        () -> assertEquals(17.5, AC.getHours(), 0.000001),
        () -> assertEquals(0.0, heater.getHours(), 0.000001),
        () -> assertEquals(7.0, tv.getHours(), .000001),
        () -> assertEquals(8.0, refrigerator.getHours(), 0.000001),
        () -> assertEquals(3.0, dishwasher.getHours(), 0.000001),
        () -> assertEquals(0.5, microwave.getHours(), .000001),
        () -> assertEquals(5.0, lighting.getHours(), .000001)
    );
  }
}