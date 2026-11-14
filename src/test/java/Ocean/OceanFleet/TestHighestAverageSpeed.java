package Ocean.OceanFleet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHighestAverageSpeed {

    @Test
    public void testAverageSpeed(){
        AddVessel addVessel = new AddVessel();

       Vessel v1 =  addVessel.addVessel(101,"vessel1",35.0,"cube");
       Vessel v2 = addVessel.addVessel(102,"vessel2",35.0,"cube");
       Vessel v3 = addVessel.addVessel(103,"vessel3",23.0,"cube");

       List<Vessel> list = new ArrayList<>();
       list.add(v1);
       list.add(v2);

       HighestAverageSpeed highestAverageSpeed = new HighestAverageSpeed();

        assertEquals(list,highestAverageSpeed.highestAverageSpeed());

    }
}
