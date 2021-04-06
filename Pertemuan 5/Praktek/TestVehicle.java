public class TestVehicle {
    public static void main(String[] args){
    Vehicle Kendaraan = new Vehicle();
    Bicycle Sepeda = new Bicycle();
    MotorVehicle SepedaMotor = new MotorVehicle();
    Kendaraan.goStraight();
    Kendaraan.turnLeft();
    Kendaraan.turnRight();
    Sepeda.ringBell();   
    }
}