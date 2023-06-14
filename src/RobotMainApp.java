public class RobotMainApp {
    public static void main(String[] args) {

        BendingRobot bendingRobot = new BendingRobot("michel", 265);
        bendingRobot.bend(260);
        System.out.println(bendingRobot);
        System.out.println("--".repeat(20));

        bendingRobot.bend(270);
        System.out.println(bendingRobot);
        System.out.println("--".repeat(20));


        LiftingRobot liftingRobot = new LiftingRobot("Ilias", 360);
        liftingRobot.life(360);
        System.out.println(liftingRobot);
        System.out.println("--".repeat(20));

        liftingRobot.life(450);
        System.out.println(liftingRobot);
        System.out.println("--".repeat(20));

        CrazyRobot crazyRobot = new CrazyRobot("MABOUL");
        System.out.println(crazyRobot);
        crazyRobot.boot();

    }
}