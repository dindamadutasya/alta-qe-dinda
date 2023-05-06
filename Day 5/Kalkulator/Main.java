import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menghitung menghitung = new Menghitung();
        String ulangLagi = null;

        do {

            System.out.println("Apa yang ingin kamu lakukan di kalkulator ini?");
            System.out.println("a. Penjumlahan, b. Pengurangan, c. Perkalian, d. Pembagian");
            System.out.println("Pilih a/b/c/d = ");
            String pilihan = input.next();

            if (pilihan.equalsIgnoreCase("a")) {
                System.out.println("Masukkan angka pertama = ");
                float angka1 = input.nextFloat();
                System.out.println("Masukkan angka = ");
                float angka2 = input.nextFloat();
                menghitung.masukkanAngka(angka1, angka2);
                System.out.println("Hasil penjumlahan adalah = " + menghitung.penjumlahan());
                System.out.println("Ingin menghitung lagi? (Y/N) = ");
                ulangLagi = input.next();
                
            } else if (pilihan.equalsIgnoreCase("b")) {
                System.out.println("Masukkan angka pertama = ");
                float angka1 = input.nextFloat();
                System.out.println("Masukkan angka = ");
                float angka2 = input.nextFloat();
                menghitung.masukkanAngka(angka1, angka2);
                System.out.println("Hasil pengurangan adalah = " + menghitung.pengurangan());
                System.out.println("Ingin menghitung lagi? (Y/N) = ");
                ulangLagi = input.next();
                
            } else if (pilihan.equalsIgnoreCase("c")) {
                System.out.println("Masukkan angka pertama = ");
                float angka1 = input.nextFloat();
                System.out.println("Masukkan angka = ");
                float angka2 = input.nextFloat();
                menghitung.masukkanAngka(angka1, angka2);
                System.out.println("Hasil perkalian adalah = " + menghitung.perkalian());
                System.out.println("Ingin menghitung lagi? (Y/N) = ");
                ulangLagi = input.next();
                
            } else if (pilihan.equalsIgnoreCase("d")) {
                System.out.println("Masukkan angka pertama = ");
                float angka1 = input.nextFloat();
                System.out.println("Masukkan angka = ");
                float angka2 = input.nextFloat();
                menghitung.masukkanAngka(angka1, angka2);
                System.out.println("Hasil pembagian adalah = " + menghitung.pembagian());
                System.out.println("Ingin menghitung lagi? (Y/N) = ");
                ulangLagi = input.next();
                
            } 
            
            else {
                System.out.println("Pilihan Anda Salah! Masukkan sesuai dengan pilihan!  ");
            }
        }
        while (ulangLagi.equalsIgnoreCase("Y"));


    }
}
