import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Bilangan : ");
        int bilangan = input.nextInt();
        System.out.println(bilanganprima(bilangan));
    }
    public static boolean bilanganprima (int bilangan) {
        if (bilangan == 0 || bilangan == 1){
            return false;
        }
        for (int i = 2; i < bilangan; i++) {
            if (bilangan % i == 0) {
                return false;
            }
            }
            return true;
        }
    }