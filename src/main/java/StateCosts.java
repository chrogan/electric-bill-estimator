import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StateCosts {

  public static void main(String[] args) throws Exception {
//    String line = "";
    String splitBy = ",";

    try {

      Map<String, Double> rates = Files  //rates.get(NM)
          .lines(Paths.get("src/main/resources/state-costs.csv"))
          .map((line)->line.trim().split("\\s*,\\s*"))
          .collect(Collectors.toMap((parts) -> parts[0], (parts) -> Double.valueOf(parts[1])));
          System.out.println(rates);
//      String Montana = Files.readAllLines(Paths.get("src/main/resources/state-costs.csv")).get(41);
//      String[] states = Montana.split(splitBy);
//      double RATES = Double.parseDouble(states[1]);


    } catch (IOException e) {
      e.printStackTrace();
    }

//      This is used to print out the entire file for testing purposes. *Intentionally left out*
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
