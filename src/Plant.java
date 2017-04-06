public class Plant {
  double currentWaterAmount;
  private double absorbPercentage;
  String color;

  public Plant(double currentWaterAmount, double absorbPercentage, String color) {
    this.currentWaterAmount = currentWaterAmount;
    this.absorbPercentage = absorbPercentage;
    this.color = color;
  }

  public void water(double amount) {
    currentWaterAmount += amount * absorbPercentage;
  }


  public String toFile() {

//    "tree;blue;5.0"
    return getClass().getName().toLowerCase() + ";" + color + ";" + currentWaterAmount;
  }
}
