import java.util.Scanner;
public class Nomor2 {
//Jika BMI yang dihasilkan antara 18,5 sampai 22,9 maka berat badan dinyatakan ideal
//Jika lebih dari22,9 maka overweight, dan jika kurang dari 18,5 maka underweight. Input program berupa berat_badan dan tinggi_badan , dan output berupa normal atau underweight atau overweight
    public static void penentuan(double BMI){
        if(BMI > 22.9){
            System.out.println("Overweight");
        } else if (BMI<18.5) {
            System.out.println("Underweight");
        }else {
            System.out.println("Ideal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int berat,tinggi;
        double BMI;
        System.out.println("Masukkan berat: ");
        berat=sc.nextInt();
        System.out.println("Masukkan tinggi: ");
        tinggi= sc.nextInt();
        tinggi=tinggi/100;
        BMI= (float)berat / (tinggi * tinggi);
        System.out.println(BMI);
        penentuan(BMI);
    }
}
