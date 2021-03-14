public class BukuDemo {
    String Judul, Pengarang, Penerbit;
    int Tahun;

    public BukuDemo(String newjudul, String newpengarang, String newpenerbit, int newtahun){
        Judul = newJudul;
        Pengarang = newPengarang;
        Penerbit = newPenerbit;
        Tahun = newTahun;
    }

    public void cetakdata() {
        System.out.println("Judul Buku : " + Judul);
        System.out.println(" Pengarang : " + Pengarang);
        System.out.println("Penerbit : " + Penerbit);
        System.out.println("Tahun : " + Tahun);
    }
}