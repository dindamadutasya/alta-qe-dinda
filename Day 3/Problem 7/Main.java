import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang array: ");
        int panjang = input.nextInt();
        System.out.println("Hasil Mean adalah: "+mean(panjang));
    }
    private static float mean(int panjang){
        Scanner input = new Scanner(System.in);
        int nilaiarray[] = new int[panjang];
        float jumlah = 0;
        float hasil = 0;

        for(int i=0; i<= panjang-1; i++){
            System.out.println("Masukkan angka ke - " +(i+1));
            nilaiarray[i] = input.nextInt();
        }
        for(int i=0; i<= panjang-1; i++){
            jumlah = jumlah + nilaiarray[i];
        }
        return hasil = jumlah/nilaiarray.length;
    }

}