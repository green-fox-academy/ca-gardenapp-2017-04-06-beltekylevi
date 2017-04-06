import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> plants;

  public Garden() {
    this.plants = new ArrayList<>();
  }

  @Override
  public String toString() {
    String result = "";

    for (Plant plant : plants) {
      result += plant.toString() + "\n";
    }

    return result;
  }
}
