package HouseClasses;

public class House {
    private int noofDoors;
    private int noofWindows;
    private String typeofRoof;
    private String typeofWall;

    // this is a default constructor , java automatically creates it for u if u don't
    public House(){
        noofDoors = 0;
        noofWindows = 0;
        typeofRoof = null;
        typeofWall = null;
    }
    public House(int noofDoors,int noofWindows,String typeofRoof,String typeofWall){

        this.noofDoors = noofDoors;
        this.noofWindows = noofWindows;
        this.typeofRoof = typeofRoof;
        this.typeofWall = typeofWall;

    }
    public int getNoofWindows(){
        return noofWindows;
    }
    public int getNoofDoors(){
        return noofDoors;
    }
    public String gettypeofRoof(){
        return typeofRoof;
    }
    public String gettypeofWall(){
        return typeofWall;
    }
     
    public void setNoofWindows(int noofWindows){
        this.noofWindows = noofWindows;


    }
    public void setNoofDoors(int noofDoors){
        this.noofDoors = noofDoors;


    }
    public void setTypeofWall(String typeofWall){
        this.typeofWall = typeofWall;


    }
    public void setTypeofRoof(String typeofRoof){
        this.typeofRoof = typeofRoof;


    }
    
    

}
