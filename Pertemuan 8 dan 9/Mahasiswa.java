import java.util.Arrays;
public class mahasiswa implements UHK {
    String NIM;
    String NamaMahasiswa;
    public void setNIM(String NIM){
        this.NIM = NIM;}
    public String getNIM(){
        return NIM;}
    public void setNamaMahasiswa(String NamaMahasiswa){
        this.NamaMahasiswa = NamaMahasiswa;}
    public String getnama(){
        return NamaMahasiswa;}
    //output
    public static void printArrayMahasiswa(String[][] dataArray) {
        for(int i = 0; i < dataArray.length; i=i+1) {
            System.out.println(Arrays.toString(dataArray[i]));}
    }
}