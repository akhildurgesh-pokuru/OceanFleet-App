package Ocean.OceanFleet;

import static Ocean.OceanFleet.VesselUtil.vessels;

public class GetVesselByID {

    public Vessel getVesselById(int vesselId){
        for(Vessel vessel : vessels){
            if(vessel.getVessel_id() == vesselId){
                System.out.println("Vessel ID: "+vessel.getVessel_id()+"  Vessel Name: "+vessel.getName()+"  Average Speed: "+vessel.getAverage_speed()+"  Vessel Type: "+vessel.getVessel_type());
                return vessel;
            }
        }
        return null;
    }

}
