public class TestVehicle {
    public static void main(String[] args){
        
        Vehicle Kendaraan = new Vehicle();
        Kendaraan.goStraight();
        
        Bicycle Sepeda = new Bicycle();
        Sepeda.ringBell();

        MotorVehicle SepedaMotor = new MotorVehicle();
        SepedaMotor.getSizeofEnggine();
        SepedaMotor.getLicencePlate();

        Car Mobil = new Car();
        Mobil.goStraight();
    }
}