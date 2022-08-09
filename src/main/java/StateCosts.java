import java.io.*;
import java.util.Scanner;

public class StateCosts {

  public static void main(String[] args) throws Exception {
    //parsing a CSV file into Scanner class Constructor
    Scanner sc = new Scanner(new File("src/main/resources/state-costs.csv"));
    sc.useDelimiter(","); //sets the delimiter pattern
    while (sc.hasNext()) //returns a boolean value
    {
      System.out.print(sc.next()); //find and returns the next complete token from this scanner
    }
      sc.close(); //closes the scanner

  }

}
