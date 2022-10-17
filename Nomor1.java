import java.util.Scanner;
public class Nomor1 {
    //Masukkan variabel jam, menit, detik
    private int jam = 0;
    private int menit = 0;
    private int detik = 0;
    //Masukkan hitungan jam * 3600, menit * 60, detik
    public Nomor1 durasike(Nomor1 masaDepan) {
        Nomor1 lama = new Nomor1();
        int lamaDetik = (masaDepan.jam - this.jam) * 3600 +
                (masaDepan.menit - this.menit) * 60 +
                (masaDepan.detik - this.detik);
        lama.jam = lamaDetik / 3600;
        lamaDetik = lamaDetik % 3600;
        lama.menit = lamaDetik / 60;
        lamaDetik = lamaDetik % 60;
        lama.detik = lamaDetik;
        return lama;
    }
    //Masukkan tampilan awalnya
    //Masukkan program do while untuk mengulang programnya lagi
    //Buat pertanyaan apabila di jawab "y" dia akan mengulang, sebaliknya apabila "g" program akan berhenti
    public static void main(String[] args) {
        System.out.println("Program Penghitung Biaya dan Durasi Percakapan");
        Scanner input = new Scanner(System.in);
        String tanya = null;

        do {
            Nomor1 mulai = new Nomor1();
            System.out.print("Waktu mulai ->   jam: ");
            mulai.jam = input.nextInt();
            System.out.print("               menit: ");
            mulai.menit = input.nextInt();
            System.out.print("               detik: ");
            mulai.detik = input.nextInt();
            Nomor1 selesai = new Nomor1();
            System.out.print("Waktu selesai ->   jam: ");
            selesai.jam = input.nextInt();
            System.out.print("                 menit: ");
            selesai.menit = input.nextInt();
            System.out.print("                 detik: ");
            selesai.detik = input.nextInt();
            if (selesai.jam < mulai.jam) {
                System.out.println("Program ini hanya bekerja pada hari yang sama. " +
                        "Silakan input waktu selesai dengan benar.");
            } else {
                Nomor1 lama = mulai.durasike(selesai);
                System.out.println("Lama waktu/durasi: " +
                        lama.jam + " jam " +
                        lama.menit + " menit " +
                        lama.detik + " detik");
                int lamaDurasi = (lama.jam * 3600) + (lama.menit * 60) + lama.detik;
                System.out.println("Biaya : Rp" + lamaDurasi * 30);
                System.out.println("Apakah anda ingin menelpon lagi?......");
                tanya = input.next().toLowerCase();
            }
        }while (tanya.equals("y"));
    }
}
