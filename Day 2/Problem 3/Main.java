import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner masukkan = new Scanner(System.in);
        System.out.print("Masukkan Bilangan = ");
        int bilangan = masukkan.nextInt();
        for (int i = 1; i <= bilangan; i++) {
            if (bilangan % i == 0) {
                System.out.print(i + "  ");
            }
        }
    }
}