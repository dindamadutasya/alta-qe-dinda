public class HitungOngkir extends DimensiBarang {
    float hargaOngkir;

    public void hitungOngkir() {
        float dimensi = (this.panjang * this.lebar * this.tinggi) / 50;

        if (Math.round(dimensi) > Math.round(this.berat)) {
            hargaOngkir = Math.round(dimensi) * 5000;
            System.out.println("Harga Ongkir yang Harus Kamu Bayar " +hargaOngkir);
        }
        else if (Math.round(dimensi) < Math.round(this.berat)) {
            hargaOngkir = Math.round(this.berat) * 5000;
            System.out.println("Harga Ongkir yang Harus Kamu Bayar " +hargaOngkir);
        }
        else if (Math.round(dimensi) == Math.round(this.berat)) {
            hargaOngkir = Math.round(this.berat) * 5000;
            System.out.println("Harga Ongkir yang Harus Kamu Bayar " +hargaOngkir);
        }
    }
}
