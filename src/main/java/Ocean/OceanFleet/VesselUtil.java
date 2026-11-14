package Ocean.OceanFleet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class VesselUtil {

    static Scanner sc = new Scanner(System.in);

    static List<Vessel> vessels = new ArrayList<>();

    public static void main(String[] args) {
        VesselUtil vesselUtil = new VesselUtil();

        int choice = 1;

        while(choice!=0){

            System.out.println("1. Add Vessel");
            System.out.println("2. get Vessel by id");
            System.out.println("3. Find Highest Vessel Speed");
            System.out.println("Enter you choice");
            choice = sc.nextInt();

            switch (choice){

                case 1 :

                    AddVessel addVessel = new AddVessel();
                    System.out.println("Enter Vessel ID: ");
                    int id = sc.nextInt();

                    System.out.println("Enter Vessel Name: ");
                    String name = sc.next();

                    System.out.println("Enter the Average Speed: ");
                    double speed = sc.nextDouble();

                    System.out.println("Enter the Vessel Type");
                    String type = sc.next();
                    addVessel.addVessel(id, name, speed, type);
                    break;

                case 2 :

                    GetVesselByID getVesselByID = new GetVesselByID();
                    System.out.println("Enter the Vessel ID: ");
                    int vessle_id = sc.nextInt();
                    getVesselByID.getVesselById(vessle_id);
                    break;

                case 3 :

                    HighestAverageSpeed highestAverageSpeed = new HighestAverageSpeed();
                    highestAverageSpeed.highestAverageSpeed();
                    break;



                default:

                    System.out.println("Enter valid Choice");
                    break;
            }

            System.out.println("Enter your choice to continue: ");
            choice = sc.nextInt();
        }

    }
}


