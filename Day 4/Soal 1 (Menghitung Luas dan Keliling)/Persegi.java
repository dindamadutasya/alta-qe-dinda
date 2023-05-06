public class Persegi {

    int sisiPersegi;

    public Persegi(int sisiPersegi) {

        this.sisiPersegi = sisiPersegi;
    }

    public int luasPersegi() {
        return sisiPersegi * sisiPersegi;
    }

    public int kelilingPersegi() {
        return 4 * sisiPersegi;
    }
}

