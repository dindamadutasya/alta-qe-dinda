import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Halo, mari menghitung volume!");

        System.out.println("Masukkan nilai Sisi Kubus : ");
        int sisiKubus = scan.nextInt();

        System.out.println("Masukkan nilai Panjang Balok : ");
        int panjangBalok = scan.nextInt();
        System.out.println("Masukkan nilai Lebar Balok : ");
        int lebarBalok = scan.nextInt();
        System.out.println("Masukkan nilai tinggi Balok : ");
        int tinggiBalok = scan.nextInt();

        System.out.println("Masukkan nilai Jari-jari Tabung : ");
        double jariTabung = scan.nextDouble();
        System.out.println("Masukkan nilai Tinggi Tabung : ");
        double tinggiTabung = scan.nextDouble();

        Kubus hasilKubus = new Kubus(sisiKubus);
        System.out.println("Volume Kubus adalah = " + hasilKubus.volKubus());

        Balok hasilBalok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
        System.out.println("Volume Balok adalah = " + hasilBalok.volBalok());

        Tabung hasilTabung = new Tabung(jariTabung, tinggiTabung);
        System.out.println("Volume Tabung adalah = " + hasilTabung.volTabung());
    }
}