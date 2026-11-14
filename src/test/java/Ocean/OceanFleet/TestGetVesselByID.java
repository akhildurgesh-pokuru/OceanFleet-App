package Ocean.OceanFleet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGetVesselByID {

    @Test
    public void getVesselByID(){
        GetVesselByID getVesselByID = new GetVesselByID();


        AddVessel addVessel = new AddVessel();
        Vessel vessel =  addVessel.addVessel(101, "vessel1", 35.0, "cube");

        assertEquals(vessel,getVesselByID.getVesselById(101));
    }

}
