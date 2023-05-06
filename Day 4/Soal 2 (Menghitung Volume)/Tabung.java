public class Tabung {
        double jariTabung;
        double tinggiTabung;

        public Tabung(double jariTabung, double tinggiTabung) {

            this.jariTabung = jariTabung;
            this.tinggiTabung = tinggiTabung;

        }

        public double volTabung() {
            return Math.PI * jariTabung * jariTabung * tinggiTabung;
        }
    }

