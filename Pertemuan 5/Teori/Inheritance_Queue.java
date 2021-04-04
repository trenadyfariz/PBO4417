import java.util.Queue;
import java.util.LinkedList;
public class Inheritance_Queue {
      public static void main(String args[]){
            Samsung samsung = new Samsung();
            System.out.println(samsung.sisaSamsung());
 
            samsung.tambahSamsung("Galaxy S21+ 5G");
            samsung.tambahSamsung("Galaxy S21 Ultra 5G");
            samsung.tambahSamsung("Galaxy S21 5G");
            samsung.tambahSamsung("Galaxy S20 FE");
            samsung.tambahSamsung("Galaxy S20+ BTS Edition");
            samsung.tambahSamsung("Galaxy S10 Lite");
            samsung.tambahSamsung("Galaxy S20+");
            samsung.tambahSamsung("Galaxy S20");
            samsung.tambahSamsung("Galaxy S20 Ultra");
            System.out.println(samsung.sisaSamsung());
 
            samsung.samsungRusak(3);
            System.out.println(samsung.sisaSamsung());
      }      
}

class Samsung_Store {
      Queue<String> smartphone = new LinkedList<String>();
 
      public Samsung_Store(){
 
      }
      public void setSamsung(Queue<String> smartphone) {
            this.smartphone = smartphone;
      }
      public Queue<String> getSamsung(){
            return this.smartphone;
      }
}

class Samsung extends Samsung_Store {
      public void tambahSamsung(String smartphone){
            super.getSamsung().add(smartphone);
      }
      public void samsungRusak(int index){
            System.out.println(super.getSamsung().poll());
      }
      public Queue<String> sisaSamsung(){
            return super.getSamsung();
      }
} 