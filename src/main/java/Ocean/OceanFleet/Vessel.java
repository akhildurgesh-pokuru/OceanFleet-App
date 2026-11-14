package Ocean.OceanFleet;

public class Vessel {

    private int vessel_id;

    private String name;

    private double average_speed;

    private String vessel_type;

    public Vessel(int vessel_id, String name, double average_speed, String vessel_type) {
        this.vessel_id = vessel_id;
        this.name = name;
        this.average_speed = average_speed;
        this.vessel_type = vessel_type;
    }

    public Vessel() {
    }

    public int getVessel_id() {
        return vessel_id;
    }

    public void setVessel_id(int vessel_id) {
        this.vessel_id = vessel_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage_speed() {
        return average_speed;
    }

    public void setAverage_speed(double average_speed) {
        this.average_speed = average_speed;
    }

    public String getVessel_type() {
        return vessel_type;
    }

    public void setVessel_type(String vessel_type) {
        this.vessel_type = vessel_type;
    }
}
