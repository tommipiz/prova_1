package main.java.it.pizzutilo;


public class Cestino {
    int valore;

    public Cestino(int valore) {
        this.valore = valore;
    }

    public int getValore() {
        return valore;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }

    synchronized public void aggiungiMoneta() {
        int appo = valore + 1;
        valore = appo;
    }
  
}
