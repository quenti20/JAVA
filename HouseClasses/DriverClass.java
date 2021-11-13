package HouseClasses;

public class DriverClass {
    public static void main(String[] args) {
        House house = new House();
       House house2 = new House(10,2,"Tiles","Brick");

       house2.setNoofDoors(3);
       house2.setTypeofWall("Marble");
       house2.setNoofWindows(2);

       System.out.println("House : ");

       System.out.println("No.of Windows - "+house2.getNoofWindows());
       System.out.println("No.of Doors - "+house2.getNoofDoors());
       System.out.println("Roof Type - "+house2.gettypeofRoof());
       System.out.println("Wall Type - "+house2.gettypeofWall());

    }
    
}
