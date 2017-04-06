public class Flower extends Plant {
  public Flower(double currentWaterAmount, String color) {
    super(currentWaterAmount, .75, color);
  }

  @Override
  public String toString() {
    return "[F] color: " + color + ", water: " + currentWaterAmount;
  }
}
