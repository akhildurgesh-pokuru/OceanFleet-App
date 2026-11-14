package Ocean.OceanFleet;
import static Ocean.OceanFleet.VesselUtil.vessels;


public class AddVessel {

    public Vessel addVessel(int id, String name, double speed, String type){

        VesselUtil vesselUtil = new VesselUtil();

        Vessel vessel = new Vessel(id, name, speed, type);

        vessels.add(vessel);

        return vessel;
    }

}
