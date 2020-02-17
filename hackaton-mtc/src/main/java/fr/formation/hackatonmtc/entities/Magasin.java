package fr.formation.hackatonmtc.entities;

public class Magasin {
    private int[] nbArticlesByClient;
    private int[] velocite;

    private Client[] clients;
    private Caisse[] caisses;

    public Magasin(int[] nbArticlesByClient, int[] velocites) {
        this.nbArticlesByClient = nbArticlesByClient;
        this.velocite = velocite;

        for (int i = 0; i < nbArticlesByClient.length ; i++) {
            clients[i] = new Client(nbArticlesByClient[i]);
        }

        for (int i = 0; i < velocite.length ; i++) {
            caisses[i] = new Caisse(velocites[i]);
        }




    }

    public int[] getNbArticlesByClient() {
        return nbArticlesByClient;
    }

    public void setNbArticlesByClient(int[] nbArticlesByClient) {
        this.nbArticlesByClient = nbArticlesByClient;
    }

    public int[] getVelocite() {
        return velocite;
    }

    public void setVelocite(int[] velocite) {
        this.velocite = velocite;
    }

    private Client[] dicpatchClient() {
        for () {

        }
    }
}
