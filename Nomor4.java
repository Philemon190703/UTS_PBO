import java.util.Scanner;
public class Nomor4 {
//Masukkan variabel
    public int r;
    public double phi = 3.14;
//Memasukkan setR untuk menghitung jari-jari
    public void setR(int jari){ this.r = jari; }
    private double setR(){ return this.r; }
    private double luas_lingkaran(){ return phi * (this.r * this.r); }
    private double keliling_lingkaran(){ return 2 * phi * this.r; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nomor4 hitung = new Nomor4();
        System.out.print("Silahkan Input jari-jari lingkaran : ");
        hitung.setR(sc.nextInt());
        System.out.println("Luas lingkaran : " + hitung.luas_lingkaran()+ " cm");
        System.out.println("Keliling lingkaran : " + hitung.keliling_lingkaran()+ " cm");
    }
}