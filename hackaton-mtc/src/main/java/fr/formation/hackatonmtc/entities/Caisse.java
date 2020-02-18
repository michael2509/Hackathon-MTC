package fr.formation.hackatonmtc.entities;

public class Caisse {
    private int numero;
    private int velocite;
    private Queue queue;

    public Caisse(int numero, int velocite) {
        this.numero = numero;
        this.velocite = velocite;
    }

    public int getVelocite() {
        return velocite;
    }

    public void setVelocite(int velocite) {
        this.velocite = velocite;
    }

    public Queue getQueue() {
        return queue;
    }

    public void setQueue(Queue queue) {
        this.queue = queue;
    }
}
