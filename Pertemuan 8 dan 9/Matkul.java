import java.util.Arrays;
public class matkul {
    String Jadwal;

    public void setJadwal(String Jadwal){
        this.Jadwal = Jadwal;}
    public String getJadwal(){
        return Jadwal;}
    public static void printArrayMatkul(String[][] dataArray) {
        for(int i = 0; i < dataArray.length; i=i+1) {
            System.out.println(Arrays.toString(dataArray[i]));}
    }
}