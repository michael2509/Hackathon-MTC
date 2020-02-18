package fr.formation.hackatonmtc.entities;

public class Client {
    private int numero;
    private int nbArticles;

    public Client(int numero, int nbArticles) {
        this.numero = numero;
        this.nbArticles = nbArticles;
    }

    public int getNbArticles() {
        return nbArticles;
    }

    public void setNbArticles(int nbArticles) {
        this.nbArticles = nbArticles;
    }
}
