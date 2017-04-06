import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

  private final static String FILE_NAME = "data.csv";
  private static Garden garden;

  public static void main(String[] args) {
    List<String> rawLines = readLinesFromFile();
    garden = new Garden();
    processData(rawLines);

    System.out.println(garden);
  }

  private static List<String> readLinesFromFile() {
    Path path = Paths.get(FILE_NAME);
    List<String> rawLines;

    try {
      rawLines = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
      rawLines = new ArrayList<>();
    }

    return rawLines;
  }

  private static void processData(List<String> rawLines) {
    for (String line : rawLines) {
      String[] splittedLine = line.split(";");

      String type = splittedLine[0];
      String color = splittedLine[1];
      double water = Double.valueOf(splittedLine[2]);

      if (type.equals("flower")) {
        garden.add(new Flower(water, color));
      } else if (type.equals("tree")) {
        garden.add(new Tree(water, color));
      }
    }
  }
}
