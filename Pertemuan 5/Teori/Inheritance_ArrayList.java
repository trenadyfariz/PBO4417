import java.util.ArrayList;

public class Inheritance_ArrayList {
      public static void main(String args[]){
           Samsung samsung = new Samsung();
           System.out.println(samsung.sisaSamsung());

           samsung.tambahSamsung("Samsung Galazy S");
           samsung.tambahSamsung("Samsung Galazy Z");
           samsung.tambahSamsung("Samsung Galazy A");
           System.out.println(samsung.sisaSamsung());

           samsung.gantiSamsung(1,"Samsung Galazy Note");
           System.out.println(samsung.sisaSamsung());

           samsung.samsungRusak(0);
           System.out.println(samsung.sisaSamsung());
      }
}

class Samsung_Store {
      ArrayList<String> smartphone = new ArrayList<>();

      public Samsung_Store(){

      }
      public void setSamsung(ArrayList<String> smartphone) {
            this.smartphone = smartphone;
      }
      public ArrayList<String> getSamsung(){
            return this.smartphone;
      }
} 

class Samsung extends Samsung_Store {
      public void tambahSamsung(String smartphone){
            super.getSamsung().add(smartphone);
      }
      public String samsungRusak(int index){
            return super.getSamsung().remove(index);
      }
      public void gantiSamsung(int index, String smartphone){
            super.getSamsung().set(index, smartphone);
      }
      public ArrayList<String> sisaSamsung(){
            return super.getSamsung();
      }
}