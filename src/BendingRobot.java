public class BendingRobot extends Robot {
    private double maxBendAngle;


    public BendingRobot(String unitName, double maxBendAngle) {
        super(unitName);
        if (maxBendAngle > 0 && maxBendAngle <= 360) {
            this.maxBendAngle = maxBendAngle;
        } else {
            System.out.println("Sorry buigen is niet mogelijk !");
            System.exit(-1);
        }

    }

    public void bend(double bendAngle) {
        if (bendAngle > 0 && bendAngle < maxBendAngle) {
            System.out.println(" Het buigen van Angle : " + bendAngle + " is een succes");
        } else {
            System.out.println("IS NIET TOEGELATEN");
        }


    }

    @Override
    public String toString() {
        return "BendingRobot{" +
                "maxBendAngle=" + maxBendAngle +
                '}';
    }
}
