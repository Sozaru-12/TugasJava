import java.util.Scanner;

public class KasirATK{
    public static void main(String[] args) {
        double bukutulis, pensil, penghapus, penggaris;
        bukutulis=2500;
        pensil=1000;
        penghapus=1500;
        penggaris=1000;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah beli buku tulis: ");
        double jumlahbuku= input.nextDouble();
        double total=jumlahbuku*bukutulis;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah beli pensil: ");
        double jumlahpensil= input.nextDouble();
        double total=jumlahpensil*pensil;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Jumlah beli penghapus: ");
        double jumlahpenghapus= input.nextDouble();
        double total=jumlahpenghapus*penghapus;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Jumlah beli penggaris: ");
        double jumlahpenggaris= input.nextDouble();
        double total=jumlahpenggaris*penggaris;


        













        System.out.println("Masukkan Uang yang akan dibayar: ");
        double bayar=input.nextDouble();
        double diskon=0.05*total;
        double kembali=bayar-(total-diskon);
        System.out.println("Total diskon: "+diskon);
        System.out.println("Total Kembalian:"+kembali);
    }
    
}
