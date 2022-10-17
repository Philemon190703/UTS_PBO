import java.util.Scanner;
public class Nomor3 {
    static Scanner s = new Scanner(System.in);
//Menggunakan int array dan masukkan bilangan hingga 10 kali
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int number = 0;
        int total = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print(" Input Bilangan : ");
            number = s.nextInt();
            array1[i] = number;
            total = total + array1[i];
        }
//Untuk mencari rata-rata di totalkan lalu dibagi 10
        int Rata_rata = total / 10;
        for (int i = 0; i > 10; i++) {
            System.out.println(array1[i]);
        }
        System.out.println(" Rata-rata Bilangan : " + Rata_rata  );
    }
}