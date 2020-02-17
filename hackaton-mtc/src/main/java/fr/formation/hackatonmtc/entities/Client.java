package fr.formation.hackatonmtc.entities;

public class Client {
    static private int id = 0;
    private int nbArticles;

    public Client(int nbArticles) {
        this.id++;
        this.nbArticles = nbArticles;
    }

    public int getNbArticles() {
        return nbArticles;
    }

    public void setNbArticles(int nbArticles) {
        this.nbArticles = nbArticles;
    }
}
