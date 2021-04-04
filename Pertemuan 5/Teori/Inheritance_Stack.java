import java.util.Stack;

public class Inheritance_Stack {
      public static void main(String args[]){
            Samsung samsung = new Samsung();
            System.out.println(samsung.sisaSamsung());
 
            samsung.tambahSamsung("Samsung Galaxy S");
            samsung.tambahSamsung("Samsung Galaxy A");
            samsung.tambahSamsung("Samsung Galaxy M");
            samsung.tambahSamsung("Samsung Galaxy Z");
            System.out.println(samsung.sisaSamsung());
 
            samsung.gantiSamsung(2,"Samsung Galaxy Note");
            System.out.println(samsung.sisaSamsung());
 
            samsung.samsungRusak();
            System.out.println(samsung.sisaSamsung());
      }
}
 
class Samsung_Store {
      Stack<String> smartphone = new Stack<String>();
 
      public Samsung_Store(){
 
      }
      public void setSamsung(Stack<String> smartphone) {
            this.smartphone = smartphone;
      }
      public Stack<String> getSamsung(){
            return this.smartphone;
      }
} 
 
class Samsung extends Samsung_Store {
      public void tambahSamsung(String smartphone){
            super.getSamsung().push(smartphone);
      }
      public String samsungRusak(){
            return super.getSamsung().pop();
      }
      public void gantiSamsung(int index,String smartphone){
            super.getSamsung().set(index, smartphone);
      }
      public Stack<String> sisaSamsung(){
            return super.getSamsung();
      }
}