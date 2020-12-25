package intheritance;

public class FourWheelerVehicle extends Vehicle {

    public void repairEngine(){
        System.out.println("Repairing Engine of Four Wheeler wheeler will be different  .......");
    }

    public static void main (String args[]){
       //Vehicle obj= new FourWheelerVehicle();
        Vehicle obj1= new TwoWheelerVehicle();

      //  obj.repairEngine();
        obj1.repairEngine();

    }
}
