public class GameEnemy {
    private double width;
    private double height;
    private int positionX;
    private int positionY;

    public GameEnemy(){}
    public GameEnemy(double widht, double height){}
    public GameEnemy (double widht, double height, int positionX, int positionY) {
        this.width = widht;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public void SetDimension(double width, double height){
        this.width = width;
        this.height = height;
    }
    public void SetPosition(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public double getwidht(){
        return width;
    }
    public double getheight(){
        return height;
    }
    public int getX(){
        return  positionX;
    }
    public int getY(){
        return  positionY;
    }
    public void Run(){
        System.out.println("Enemy is running");
    }
}