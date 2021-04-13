public class MotorVehicle extends Vehicle {
    public int sizeofEnggine = 1;
    public String licencePlate = "H 1 IDN";
    public MotorVehicle(){
    }
    public MotorVehicle(int sizeEng, String lcPlate){
        this.sizeofEnggine = sizeEng;
        this.licencePlate = lcPlate;
    }
    public int getSizeofEnggine(){
        return sizeofEnggine;
    }
    public String getLicencePlate(){
        return licencePlate;
    }
}