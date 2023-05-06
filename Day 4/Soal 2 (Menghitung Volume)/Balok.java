public class Balok {

    int panjangBalok;
    int lebarBalok;
    int tinggiBalok;
    public Balok(int panjangBalok, int lebarBalok, int tinggiBalok) {
        this.panjangBalok = panjangBalok;
        this.lebarBalok = lebarBalok;
        this.tinggiBalok = tinggiBalok;
    }
    public int volBalok (){

        return panjangBalok*lebarBalok*tinggiBalok;
    }


}
