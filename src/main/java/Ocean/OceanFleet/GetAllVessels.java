package Ocean.OceanFleet;
import static Ocean.OceanFleet.VesselUtil.vessels;


import java.util.ArrayList;
import java.util.List;

public class GetAllVessels {

    List<Vessel> all = new ArrayList<>();

    public List<Vessel> allvessels(){
        for(Vessel vessel : vessels){
            all.add(vessel);
            System.out.println("Vessel ID: "+vessel.getVessel_id()+"  Vessel Name: "+vessel.getName()+"  Average Speed: "+vessel.getAverage_speed()+"  Vessel Type: "+vessel.getVessel_type());
        }

        return all;
    }

}
