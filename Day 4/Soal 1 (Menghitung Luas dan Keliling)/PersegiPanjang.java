public class PersegiPanjang {

    int panjangPersegiPjg;
    int lebarPersegiPjg;
    public PersegiPanjang(int panjangPersegiPjg, int lebarPersegiPjg) {
        this.panjangPersegiPjg = panjangPersegiPjg;
        this.lebarPersegiPjg = lebarPersegiPjg;
    }
    public int luasPersegiPjg (){

        return panjangPersegiPjg*lebarPersegiPjg;
    }
    public int kelilingPersegiPjg(){
        return 2*(panjangPersegiPjg+lebarPersegiPjg);
    }

    }
