public abstract class Robot {
    private String unitName;


    public Robot() {
        this.unitName = "nameless Robot";
        // boot();
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Robot(String unitName) {
        this.unitName = unitName;
    }

    public void boot() {
        System.out.println("De Robot is aan het opstarten...");
        System.out.println("Robot Naam :" + unitName);

    }

    public String getUnitName() {
        return unitName;

    }

    @Override
    public String toString() {
        return "Robot{" +
                "unitName='" + unitName + '\'' +
                '}';
    }
}
