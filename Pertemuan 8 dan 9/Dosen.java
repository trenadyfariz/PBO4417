import java.util.Arrays;
public class dosen implements UHK {
    String NamaDosen;
    String Matkul;
    public void setnama(String NamaDosen){
        this.NamaDosen = NamaDosen;}
    public String getnama(){
        return NamaDosen;}
    public void setMatkul(String Matkul){
        this.Matkul = Matkul;}
    public String getMatkul(){
        return Matkul;}
    public static void printArrayDosen(String[][] dataArray) {
        for(int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));}
    }
}