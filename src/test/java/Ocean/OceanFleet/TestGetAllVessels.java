package Ocean.OceanFleet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestGetAllVessels {

    @Test
    public void testGetAllVessels(){

        AddVessel addVessel = new AddVessel();

        Vessel v1 =  addVessel.addVessel(101,"vessel1",35.0,"cube");
        Vessel v2 = addVessel.addVessel(102,"vessel2",35.0,"cube");
        Vessel v3 = addVessel.addVessel(103,"vessel3",23.0,"cube");

        List<Vessel> allvessels = new ArrayList<>(Arrays.asList(v1,v2,v3));

        GetAllVessels getAllVessels = new GetAllVessels();

        assertEquals(allvessels,getAllVessels.allvessels());
    }
}
