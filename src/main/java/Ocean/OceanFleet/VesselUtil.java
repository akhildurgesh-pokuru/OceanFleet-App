package Ocean.OceanFleet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class VesselUtil {

    List<Vessel> vessels = new ArrayList<>();

    public static void main(String[] args) {
        VesselUtil vesselUtil = new VesselUtil();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Vessel ID: ");
        int id = sc.nextInt();

        System.out.println("Enter Vessel Name: ");
        String name = sc.next();

        System.out.println("Enter the Average Speed: ");
        double speed = sc.nextDouble();

        System.out.println("Enter the Vessel Type");
        String type = sc.next();


        vesselUtil.addVessel(id, name, speed, type);
    }

    public Vessel addVessel(int id, String name, double speed, String type){

        Vessel vessel = new Vessel(id, name, speed, type);

        vessels.add(vessel);

        return vessel;
    }
}


