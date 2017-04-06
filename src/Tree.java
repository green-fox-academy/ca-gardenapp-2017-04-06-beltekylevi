public class Tree extends Plant {
  public Tree(double currentWaterAmount, String color) {
    super(currentWaterAmount, .4, color);
  }

  @Override
  public String toString() {
    return "[T] color: " + color + ", water: " + currentWaterAmount;
  }
}
