package fr.formation.hackatonmtc.entities;

public class Magasin {
    private int[] nbArticlesParClient;
    private int[] velocite;

    private Client[] clients;
    private Caisse[] caisses;

    public Magasin(int[] nbArticlesParClient, int[] velocites) {
        this.nbArticlesParClient = nbArticlesParClient;
        this.velocite = velocite;

        for (int i = 0; i < nbArticlesParClient.length ; i++) {
            clients[i] = new Client(i++, nbArticlesParClient[i]);
        }

        for (int i = 0; i < velocite.length ; i++) {
            caisses[i] = new Caisse(i++, velocites[i]);
        }
    }

    public int[] getNbArticlesParClient() {
        return nbArticlesParClient;
    }

    public void setNbArticlesParClient(int[] nbArticlesParClient) {
        this.nbArticlesParClient = nbArticlesParClient;
    }

    public int[] getVelocite() {
        return velocite;
    }

    public void setVelocite(int[] velocite) {
        this.velocite = velocite;
    }

    private Client[] dicpatchClient() {
        int capaciteTotale = 0;
        int articlesTotal = 0;

        for (Caisse caisse:caisses) {
            capaciteTotale += caisse.getVelocite();
        }
        for (Client client : clients) {
            articlesTotal += client.getNbArticles();
        }
        for (Client client : clients) {
            for (Caisse caisse : caisses) {
                if (caisse.getVelocite() <  client.getNbArticles()) {

                }
            }
        }
    }
}
