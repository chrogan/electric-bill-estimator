import java.io.*;
import java.util.Scanner;

public class StateCosts {

  public static void main(String[] args) throws Exception {

    String line = "";
    String splitBy = ",";

    try {
      //parsing a CSV file into Scanner class Constructor
      BufferedReader br = new BufferedReader(new FileReader("src/main/resources/state-costs.csv"));
      while ((line = br.readLine()) != null) { //returns a Boolean value
        String[] states = line.split(splitBy); //uses a comma as separator
        System.out.println("Location [State: " + states[0] + ", Avg: Cost" + states[1] + "¢/kWh]");
      }
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}
