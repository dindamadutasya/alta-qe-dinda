import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String soal = "Ayo MenghitungLuas Segitiga";
        System.out.println("Hello "+soal);

        Scanner input = new Scanner(System.in);
        System.out.println("Input nilai alas : ");
        double alas = input.nextDouble();
        System.out.println("Input nilai alas = " + alas );
        System.out.println("Input nilai tinggi : ");
        double tinggi = input.nextDouble();
        System.out.println("Input nilai tinggi = " + tinggi);
        double luassegitiga = (0.5*alas*tinggi);
        System.out.println("Luas Segitiga : " +luassegitiga );




    }
}
