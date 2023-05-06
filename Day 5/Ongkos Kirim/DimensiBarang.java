import java.util.Scanner;
public class DimensiBarang {
    float panjang;
    float lebar;
    float tinggi;
    float berat;
    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public void setBerat(float berat) {
        this.berat = berat;
    }

    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai Panjang = ");
        this.panjang = input.nextFloat();
        System.out.println("Masukkan nilai Lebar = ");
        this.lebar = input.nextFloat();
        System.out.println("Masukkan nilai Tinggi = ");
        this.tinggi = input.nextFloat();
        System.out.println("Masukkan nilai Berat = ");
        this.berat = input.nextFloat();
    }

}
