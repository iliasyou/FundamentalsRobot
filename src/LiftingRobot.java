public class LiftingRobot extends Robot {
    private double maxLifeHeight;


    public LiftingRobot(String unitName, double maxLifeHeight) {
        super(unitName);
        this.maxLifeHeight = maxLifeHeight;
    }

    public void life(double height) {
        if (isLiftPossible(height)) {
            System.out.println("Het opheffen is gelukt met een hoogte van " + height);
        } else {
            System.out.println("Het opheffen is niet mogelijk.");
        }
    }

    private boolean isLiftPossible(double height) {
        return height <= maxLifeHeight;
    }

    @Override
    public String toString() {
        return "LiftingRobot{" +
                "maxLifeHeight=" + maxLifeHeight +
                '}';
    }
}

