public class Plant {
    private double currentWaterAmount;
    private double absorbPercentage;
    private String color;

    public Plant(double currentWaterAmount, double absorbPercentage, String color) {
        this.currentWaterAmount = currentWaterAmount;
        this.absorbPercentage = absorbPercentage;
        this.color = color;
    }

    public void water(double amount) {
        currentWaterAmount += amount * absorbPercentage;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "currentWaterAmount=" + currentWaterAmount +
                ", absorbPercentage=" + absorbPercentage +
                ", color='" + color + '\'' +
                '}';
    }
}
