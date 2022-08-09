import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class StateCosts {

  public static void main(String[] args) throws Exception {
    String line = "";
    String splitBy = ",";

    try {
      String Montana = Files.readAllLines(Paths.get("src/main/resources/state-costs.csv")).get(41);
      String[] states = Montana.split(splitBy);
      double RATES = Double.parseDouble(states[1]);
      System.out.println(RATES);

    } catch (IOException e) {
      e.printStackTrace();
    }

    //  This is used to print out the entire file for testing purposes. *Intentionally left out*
//    try {
//      //parsing a CSV file into Scanner class Constructor
//      BufferedReader br = new BufferedReader(new FileReader("src/main/resources/state-costs.csv"));
//      while ((line = br.readLine()) != null) { //returns a Boolean value
//        String[] states = line.split(splitBy); //uses a comma as separator
//        System.out.println("Location [State: " + states[0] + ", Avg: Cost" + states[1] + "¢/kWh]");
//      }
//    }
//    catch (IOException e)
//    {
//      e.printStackTrace();
//    }

  }
}
