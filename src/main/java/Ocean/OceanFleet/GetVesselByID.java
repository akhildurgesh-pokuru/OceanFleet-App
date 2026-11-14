package Ocean.OceanFleet;

import static Ocean.OceanFleet.VesselUtil.vessels;

public class GetVesselByID {

    public Vessel getVesselById(int vesselId){
        for(Vessel vessel : vessels){
            if(vessel.getVessel_id() == vesselId){
                System.out.println("Vessel ID: "+vessel.getVessel_id());
                System.out.println("Vessel Name: "+vessel.getName());
                System.out.println("Average Speed: "+vessel.getAverage_speed());
                System.out.println("Vessel Type: "+vessel.getVessel_type());
                return vessel;
            }
        }
        return null;
    }

}
