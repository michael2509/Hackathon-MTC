package fr.formation.hackatonmtc.entities;

public class Caisse {
    static private int id = 0;
    private int velocite;
    private Queue queue = null;

    public Caisse(int velocite) {
        this.id++;
        this.velocite = velocite;
    }

    public int getVelocite() {
        return velocite;
    }

    public void setVelocite(int velocite) {
        this.velocite = velocite;
    }
}
