public class Segitiga {
    double alasSegitiga;
    double tinggiSegitiga;


    public Segitiga(double alasSegitiga, double tinggiSegitiga) {
        this.alasSegitiga = alasSegitiga;
        this.tinggiSegitiga = tinggiSegitiga;
    }

    public double luasSegitiga(){
        return (alasSegitiga*tinggiSegitiga)/2;
    }
    public double kelilingSegitiga(){
        double sisiMiring;
        sisiMiring = Math.sqrt((alasSegitiga*alasSegitiga)+(tinggiSegitiga*tinggiSegitiga));
        return alasSegitiga+tinggiSegitiga+sisiMiring;
    }
}

