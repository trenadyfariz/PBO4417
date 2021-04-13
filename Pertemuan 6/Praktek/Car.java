public class Car extends MotorVehicle {
    Boolean seatbelt = false;
    public Car(){
    }
    public void setSeatbelt(Boolean seatbelt) {
        this.seatbelt = seatbelt;
    }
    public Boolean getSeatBelt(){
        return seatbelt;
    }
}