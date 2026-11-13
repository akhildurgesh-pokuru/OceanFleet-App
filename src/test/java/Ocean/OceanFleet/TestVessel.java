package Ocean.OceanFleet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestVessel {

    @Test
    public void TestDefaultConstructor(){
        Vessel vessel = new Vessel();
        assertEquals(0,vessel.getVessel_id());
        assertEquals(null,vessel.getName());
        assertEquals(0.0,vessel.average_speed);
        assertEquals(null,vessel.getVessel_type());
    }

    @Test
    public void TestParameterConstructor(){
        Vessel vessel = new Vessel(101,"Vessel1",34.0,"cube");
        assertEquals(101,vessel.vessel_id);
        assertEquals("Vessel1",vessel.name);
        assertEquals(34.0,vessel.average_speed);
        assertEquals("cube",vessel.vessel_type);
    }

    @Test
    public void TestGetterIDANDSetterID(){
        Vessel vessel = new Vessel();
        vessel.setVessel_id(101);
        assertEquals(101,vessel.getVessel_id());
    }

    @Test
    public void TestGetterSppedANDSetterSpeed(){
        Vessel vessel = new Vessel();
        vessel.setAverage_speed(34.0);
        assertEquals(34.0,vessel.getAverage_speed());
    }

    @Test
    public void TestGetterTypeANDSetterType(){
        Vessel vessel = new Vessel();
        vessel.setVessel_type("cube");
        assertEquals("cube",vessel.getVessel_type());
    }

    @Test
    public void TestGetterNameANDSetterName(){
        Vessel vessel = new Vessel();
        vessel.setName("vessel1");
        assertEquals("vessel1",vessel.getName());
    }

}
