package Ocean.OceanFleet;
import java.util.ArrayList;
import java.util.List;

import static Ocean.OceanFleet.VesselUtil.vessels;


public class HighestAverageSpeed {

    public List<Vessel> highestAverageSpeed(){
        double highest_speed = Integer.MIN_VALUE;

        List<Vessel> vesselss = new ArrayList<>();

        for(Vessel vessel : vessels){
            if(vessel.getAverage_speed() > highest_speed){
                highest_speed = vessel.getAverage_speed();
            }
        }

        for(Vessel vessel : vessels){
            if(vessel.getAverage_speed() == highest_speed){
                vesselss.add(vessel);
            }
        }

        for(Vessel vessel : vesselss){
            System.out.println("Vessel ID: "+vessel.getVessel_id()+"  Vessel Name: "+vessel.getName()+"  Average Speed: "+vessel.getAverage_speed()+"  Vessel Type: "+vessel.getVessel_type());
            System.out.println();
        }

        return vesselss;
    }

}
