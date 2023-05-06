import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai number : ");
        int NilaiNumber = input.nextInt();
        String NilaiHuruf = " ";

        if (NilaiNumber >= 80 && NilaiNumber <= 100) {
            NilaiHuruf = "A+";
        } else if (NilaiNumber >= 65 && NilaiNumber <= 79) {
            NilaiHuruf = "B+";
        } else if (NilaiNumber >= 50 && NilaiNumber <= 64) {
            NilaiHuruf = "B";
        } else if (NilaiNumber >= 35 && NilaiNumber <= 59) {
            NilaiHuruf = "C";
        } else if (NilaiNumber >= 0 && NilaiNumber <= 34) {
            NilaiHuruf = "D";
        } else {
            System.out.println("Nilai yang Kamu masukkan INVALID");
        }
        System.out.println("Nilai huruf Kamu = " + NilaiHuruf);

    }
}