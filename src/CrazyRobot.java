public class CrazyRobot extends Robot {


    public CrazyRobot() {
    }


    public CrazyRobot(String unitName) {
        super(unitName);

    }

    @Override
    public void boot() {

        StringBuilder rb = new StringBuilder(getUnitName());
        System.out.println("Omgekeerde Naam : " + rb.reverse());


    }

    @Override
    public String toString() {
        return "Robotnaam: " + getUnitName();
    }
}

