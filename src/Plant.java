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
//    return getClass().getName().toLowerCase() + ";" + color + ";" + currentWaterAmount;
    return getClass() + ";" + color + ";" + currentWaterAmount;
  }
}
