import java.util.Scanner;
class Matematika {
    int a;
    int b;
    int c;
    int d;
    double plus, minus, kali, bagi;
}
public class MatematikaDemo {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        int plus=a+c;
        int minus=c-c;
        int kali=b*d;
        int bagi=b/a;

        System.out.println("plus :"+plus);
        System.out.println("minus :"+minus);
        System.out.println("kali :"+kali);
        System.out.println("bagi :"+bagi); 
    }
}