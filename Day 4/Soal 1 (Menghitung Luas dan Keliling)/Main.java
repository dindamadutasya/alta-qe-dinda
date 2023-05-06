import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Halo, mari menghitung luas dan keliling bangunan datar!");

        System.out.println("Masukkan nilai sisi Persegi : ");
        int sisiPersegi = scan.nextInt();

        System.out.println("Masukkan nilai alas Segitiga : ");
        double alasSegitiga = scan.nextDouble();
        System.out.println("Masukkan nilai tinggi Segitiga : ");
        double tinggiSegitiga = scan.nextDouble();

        System.out.println("Masukkan nilai panjang Persegi Panjang : ");
        int panjangPersegiPjg = scan.nextInt();
        System.out.println("Masukkan nilai lebar Persegi Panjang : ");
        int lebarPersegiPjg = scan.nextInt();

        Persegi hasilPersegi = new Persegi(sisiPersegi);
        System.out.println("Luas Persegi adalah = " + hasilPersegi.luasPersegi());
        System.out.println("Keliling Persegi adalah = " + hasilPersegi.kelilingPersegi());

        Segitiga hasilSegitiga = new Segitiga(alasSegitiga, tinggiSegitiga);
        System.out.println("Luas Segitiga adalah = " + hasilSegitiga.luasSegitiga());
        System.out.println("Keliling Segitiga adalah = " + hasilSegitiga.kelilingSegitiga());

        PersegiPanjang hasilPersegiPjg = new PersegiPanjang(panjangPersegiPjg, lebarPersegiPjg);
        System.out.println("Luas Persegi Panjang adalah = " + hasilPersegiPjg.luasPersegiPjg());
        System.out.println("Keliling Persegi Panjang adalah = " + hasilPersegiPjg.kelilingPersegiPjg());
    }
}