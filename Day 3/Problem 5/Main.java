import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String palindrome = "";
        int panjangkata;
        System.out.println("Masukkan kata yang ingin di uji : ");
        String kata = input.nextLine();
        panjangkata = kata.length();

        for (int i = panjangkata-1; i >= 0; i--) {
            palindrome = palindrome + kata.charAt(i);
        }
        if (kata.equals(palindrome)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }


}