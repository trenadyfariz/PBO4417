public class TestSimpleCircle {
    public static void main(String[] args){
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        SimpleCircle circle2 = new SimpleCircle(10 );
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
        
        SimpleCircle circle3 = new SimpleCircle(100 );
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
        
        circle2.radius = 1000 ;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }
}
