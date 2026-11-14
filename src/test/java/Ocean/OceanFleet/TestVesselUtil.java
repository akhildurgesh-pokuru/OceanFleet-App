package Ocean.OceanFleet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestVesselUtil {

    @Test
    public void testUtil(){
        VesselUtil vesselUtil = new VesselUtil();

        Vessel vessel = vesselUtil.addVessel(101,"vessel1",35.0,"cube");

        assertEquals(101,vessel.getVessel_id());
        assertEquals("vessel1",vessel.getName());
        assertEquals(35.0,vessel.getAverage_speed());
        assertEquals("cube",vessel.getVessel_type());
    }

}
